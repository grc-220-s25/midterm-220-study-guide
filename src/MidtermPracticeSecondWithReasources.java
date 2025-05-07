import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MidtermPracticeSecondWithReasources {

    public static void main(String[] args) {
        // After implementing a method, call it here with
        // some sample input and print the result to
        // check if it works. Fix any issues you find.

        // List<String> newStringList = new ArrayList<>(Arrays.asList("apple", "banana", "kiwi"));
        // System.out.println(findLongestWord(newStringList));;

        // Map<String, Integer> wordScores = new HashMap<>();
        // wordScores.put("why", 7);
        // wordScores.put("hello", 8);
        // wordScores.put("brilliant", 99);
        // wordScores.put("world", 15);
        // wordScores.put("amazing", 17);

        // System.out.println(countLongWords(wordScores));

        // float[] floatList = {1.5f, 3.5f, 2.0f, 3.0f};
        // System.out.println(findAverage(floatList));

        // Map<String,Integer> isOdd = new HashMap<>();
        // isOdd.put("a", 7);
        // isOdd.put("x", 4);
        // isOdd.put("z", 5);

        // System.out.println(countOddNumbers(isOdd));
        int[] isDivbyThree = {3, 6, 9};
        int[] isNotDivbyThree = {3, 4, 6, 9};

        System.out.println(allDivisibleBy3(isDivbyThree));
        System.out.println(allDivisibleBy3(isNotDivbyThree));


    }

    /**
     * Finds the longest word in an List of Strings.
     * @param list an ArrayList of words
     * @return the longest word in the list
     * Example: input: ["apple", "banana", "kiwi"] -> output: "banana"
     */
    public static String findLongestWord(List<String> list) {
        String longestWord = "";
        int max = 0;
        for(String word : list){
            if (max < word.length()) {
                max = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }
     // --- Attempt 2 (With Resources, 10 min) ---
    // Time Completed: 5:19 seconds left
    // Notes: I understood this well I think there is some optimization stil that I saw after I completed it.





    /**
     * Counts how many words are longer than 5 characters in the keys of a Map.
     * @param map a Map of strings to integers
     * @return the count of words longer than 5 characters
     * Example: input: ["why"=7, "hello"=8, "brilliant"=99, "world"=15, "amazing"=17] -> output: 2
     */
    public static int countLongWords(Map<String, Integer> map) {
        int count = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
                if (entry.getKey().length() > 5) {
                    count++;
                }
        }
        return count;
    }
    // --- Attempt 2 (With Resources, 10 min) ---
    // Time Completed: 4:01 seconds left
    // Notes: I think I did well I just need to memorize a few things and get a better understanding.





    /**
     * Finds the average of the floats in an array.
     * @param arr an array of floats
     * @return the average of the values
     * Example: input: [1.5, 3.5, 2.0, 3.0] -> output: 2.5
     */
    public static double findAverage(float[] arr) {
        float sum = 0;
        int count = arr.length;

        for(float decimal : arr){
            sum += decimal;
        }
        return sum/count;
    }
    // --- Attempt 2 (With Resources, 10 min) ---
    // Time Completed: 7:26 seconds remaining
    // Notes: feeling really good about this one I think I have a very good grasp on this one.




    /**
     * Counts how many odd numbers there are in the values of a Map.
     * @param map a HashMap of String keys and Integer values
     * @return the count of odd numbers in the values
     * Example: input: {"a"=7, "x"=4, "z"=5} -> output: 2
     */
    public static int countOddNumbers(Map<String, Integer> map) {
        int amountOfOdd = 0;
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if (entry.getValue() % 2 != 0) {
                amountOfOdd++;
            }
        }
        return amountOfOdd;
    }
    // --- Attempt 2 (With Resources, 10 min) ---
    // Time Completed: 5:15 seconds remaining
    // Notes: feeling good, I just need to remeber the correct syntax for looping though key value pairs.


    /**
     * Returns true if all values are divisible by 3 in an array.
     * @param arr an array of integers
     * @return true if all values are divisible by 3, false otherwise
     * Example: input: [3, 6, 9] -> output: true
     * Example 2: input: [3, 4, 6, 9] -> output: false
     */
    public static boolean allDivisibleBy3(int[] arr) {
        int counter = 0;
        for(int num: arr){
            if (num % 3 == 0) {
                counter++;
            }
        }
        return counter == arr.length;
    }
       // --- Attempt 2 (With Resources, 10 min) ---
    // Time Completed: 5:23 seconds remaining
    // Notes: Could be more optimized but I am happy with my result.



    /**
     * Returns true if all words start with 'a' in an ArrayList of Strings.
     * @param list an ArrayList of words
     * @return true if all words start with 'a', false otherwise
     * Example: input: ["apple", "apricot", "avocado"] -> output: true
     * Example: input: ["apple", "banana", "avocado"] -> output: false
     */
    public static boolean allStartWithA(List<String> list) {
        return false;
    }
    // --- Attempt 2 (With Resources, 10 min) ---
    // Time Completed:
    // Notes:



    /**
     * OPTIONAL MORE CHALLENGING PROBLEM
     * NOT REQUIRED
     *
     * Determines if the array can be split into two contiguous subarrays with equal sums.
     * The method checks if there exists an index where the sum of elements to the left of the index
     * is equal to the sum of elements to the right. Both subarrays must be contiguous.
     *
     * @param arr an array of integers to evaluate
     * @return true if there exists a split point where the left and right contiguous subarrays have equal sums, false otherwise
     *
     * Example:
     * Input: [1, 3, 8, 2, 1, 2, 7]
     * Output: true (since [1, 3, 8] and [2, 1, 2, 7] both sum to 12)
     *
     * Input: [1, 2, 3, 4, 5]
     * Output: false (no contiguous split results in equal sums)
     */
    public static boolean canPartitionWithEqualSums(int[] arr) {
        return false;
    }
    // --- Attempt 2 (With Resources, 10 min) ---
    // Time Completed:
    // Notes:


    
}