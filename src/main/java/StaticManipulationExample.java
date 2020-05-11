import java.util.Arrays;

/* Objects can be manipulated within static methods, without actually passing back a new value. For primitive types
passed in as an argument in Java, the original value is never manipulated. For objects, the object may be manipulated
within a static method. This includes objects such as arrays. However, it is important to note that strings, while
not primitive types, behave like primitives here. They will retain their original value if you attempt to manipulate
them within a static method.
*/
public class StaticManipulationExample {

    // Changes all elements of the array passed in to zero.
    public static void arrayManipulator(int[] a){
        Arrays.fill(a, 0);
    }

    // Changes the int to 999. This method will NOT change the value of the variable passed as an argument.
    public static void integerManipulator(int a){
        a = 999;
    }

    // Changes the String to 'method value'. This method will NOT change the value of the variable passed as an argument.
    public static void stringManipulator(String a){
        a = "method value";
    }

    public static void main(String[] args) {
        // Initialize variables to hold data
        int[] myArray = {3, 4, 52, 21, 3};
        int testInt = 1;
        String myString = "original value";

        // Call methods to manipulate data
        integerManipulator(testInt);
        arrayManipulator(myArray);
        stringManipulator(myString);

        // Display data
        System.out.println(testInt);
        System.out.println(myString);

        for (int item : myArray) {
            System.out.println(item);
        }
    }
}
