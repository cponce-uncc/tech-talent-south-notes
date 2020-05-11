/*
Big O notation is a way to represent the time-space complexity of
algorithms in programming. It is used to directly compare the efficiency
of different solutions.
    + 0(1): One step, constant time
    + 0(n): Scales linearly, linear time
    + 0(log n): Scales in a logarithmic fashion, logarithmic time
    + 0(n^2): Scales in a quadratic function, quadratic time

More notes:
    - Logarithmic solutions are the most effective in real practice.
    - When you are calculating Big 0 complexity, throw out constants.
    - For example, if a method has two linear operations, it would be
      expressed by 0(2n). However, that just equates to 0(n).
    - Drop the less significant terms. Big 0 complexity is calculated
      by "worst-case" scenario. 0(1 + n + n^2) = 0(n^2) [Quadratic time]
    - There is also best-case, and average-case runtime. 0(n) generally
      speaks in "worst-case" scenario.
    - Space (in memory) may sometimes be more important than using less time.
      Talking about memory cost (space complexity) is very similar to talking
      about computation cost (time complexity).
    - Sometimes there is a tradeoff between saving time and saving space,
      so you have to decide which to optimize for in your scenario
        + Algorithm takes a long time but less memory: space efficient
        + Algorithm is quick but takes more memory: time efficient
    - Think about the time-space complexity while you design your algorithms.
        + This is why Lionel does not like nested for loops- they increase
          time-space complexity in a quadratic manner
    - Optimizing may also impact readability and time spend coding
    - "A great engineer knows how to strike the right balance between runtime,
      space, implementation time, maintainability, and readability.
    - Time-space complexity is very important when it comes to sorting algorithms
 */
public class BigONotation {

    // This method runs in O(1) time or "constant time".
    // No matter the input size, the method will always require one "step"
    public static void printFirstItem(int[] items){
        System.out.println("First number: ");
        System.out.println(items[0]);
    }

    // This method runs in 0(n) time complexity- "linear time"
    // The time-space complexity scales linearly with the input
    public static void printAllItems(int[] items){
        System.out.println("All integers: ");
        for(int item:items){
            System.out.println(item);
        }
    }

    // This method runs in 0(n^2) time complexity, known as quadratic time.
    // When the input is 2, the algorithm takes four steps. When the input
    // is 10, the algorithm takes ten steps. Time-space complexity scales
    // exponentially as the input increases.
    public static void printAllPossibleOrderedPairs(int[] items){
        System.out.println("All possible pairs: ");
        for(int firstItem:items){
            for(int secondItem:items){
                System.out.println(firstItem + " " + secondItem);
            }
        }
    }

    // This would be represented as O(a + b). Two different operations.
    // If it was looping through two lists of the same size and type, then
    // you can make it O(n). But here, you do not know that they are the same.
    public static void printBoth(int[] intList, String[] stringList){
        for(int integer:intList){
            System.out.println(integer);
        }

        for(String string:stringList){
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        String[] myStrings = {"hello", "new", "world"};
        int[] myIntegers = {0, 4, 5, 3};
        printFirstItem(myIntegers);  // Constant time
        printAllItems(myIntegers);  // Linear time
        printAllPossibleOrderedPairs(myIntegers);
        printBoth(myIntegers, myStrings);

    }
}
