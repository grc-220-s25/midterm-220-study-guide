import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MidtermPractice {

    public static void main(String[] args) {
        // After implementing a method, call it here with
        // some sample input and print the result to
        // check if it works. Fix any issues you find.

        // problem 1
        List<String> words = Arrays.asList("apple", "banana", "kiwi");
        String result1 = findLongestWord(words);
        System.out.println("The Longest Word is: " + result1);

        // problem 2
        Map<String, Integer> maps = Map.of(
                "why", 7,
                "hello", 8,
                "brilliant", 99,
                "world", 15,
                "amazing", 17);

        int result2 = countLongWords(maps);
        System.out.println("Words longer than 5 characters: " + result2);

        // problem 3
        float[] numbers = { 1.5f, 3.5f, 2.0f, 3.0f };
        double result3 = findAverage(numbers);
        System.out.println("The Average is: " + result3);

        // problem 4
        Map<String, Integer> exampleMap = new HashMap<>();
        exampleMap.put("a", 7);
        exampleMap.put("x", 4);
        exampleMap.put("z", 5);

        int result4 = countOddNumbers(exampleMap);
        System.out.println("Total Odd Numbers: " + result4);

        // problem 5
        int[] test1 = { 3, 6, 9 };
        int[] test2 = { 3, 4, 6, 9 };

        System.out.println(allDivisibleBy3(test1));
        System.out.println(allDivisibleBy3(test2));

        // problem 6
        List<String> list1 = Arrays.asList("apple", "apricot", "avocado");
        List<String> list2 = Arrays.asList("apple", "banana", "avocado");

        System.out.println(allStartWithA(list1));
        System.out.println(allStartWithA(list2));

        // optional problem
        int[] test7 = { 1, 3, 8, 2, 1, 2, 7 };
        int[] test8 = { 1, 2, 3, 4, 5 };

        System.out.println(canPartitionWithEqualSums(test7));
        System.out.println(canPartitionWithEqualSums(test8));

    }

    /**
     * Finds the longest word in an List of Strings.
     * 
     * @param list an ArrayList of words
     * @return the longest word in the list
     *         Example: input: ["apple", "banana", "kiwi"] -> output: "banana"
     */
    public static String findLongestWord(List<String> list) {
        if (list == null || list.isEmpty()) {
            return " ";
        }

        String longest = "";
        for (String word : list) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    /**
     * Counts how many words are longer than 5 characters in the keys of a Map.
     * 
     * @param map a Map of strings to integers
     * @return the count of words longer than 5 characters
     *         Example: input: ["why"=7, "hello"=8, "brilliant"=99, "world"=15,
     *         "amazing"=17] -> output: 2
     */
    public static int countLongWords(Map<String, Integer> map) {
        int count = 0;
        for (String key : map.keySet()) {
            if (key.length() > 5) {
                count++;
            }
        }
        return count;
    }

    /**
     * Finds the average of the floats in an array.
     * 
     * @param arr an array of floats
     * @return the average of the values
     *         Example: input: [1.5, 3.5, 2.0, 3.0] -> output: 2.5
     */
    public static double findAverage(float[] arr) {
        if (arr == null || arr.length == 0) {
            return 0.0;
        }

        float sum = 0;
        for (float num : arr) {
            sum += num;
        }

        return sum / arr.length;

    }

    /**
     * Counts how many odd numbers there are in the values of a Map.
     * 
     * @param map a HashMap of String keys and Integer values
     * @return the count of odd numbers in the values
     *         Example: input: {"a"=7, "x"=4, "z"=5} -> output: 2
     */
    public static int countOddNumbers(Map<String, Integer> map) {
        int count = 0;
        for (int num : map.values()) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns true if all values are divisible by 3 in an array.
     * 
     * @param arr an array of integers
     * @return true if all values are divisible by 3, false otherwise
     *         Example: input: [3, 6, 9] -> output: true
     *         Example 2: input: [3, 4, 6, 9] -> output: false
     */
    public static boolean allDivisibleBy3(int[] arr) {
        for (int num : arr) {
            if (num % 3 != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns true if all words start with 'a' in an ArrayList of Strings.
     * 
     * @param list an ArrayList of words
     * @return true if all words start with 'a', false otherwise
     *         Example: input: ["apple", "apricot", "avocado"] -> output: true
     *         Example: input: ["apple", "banana", "avocado"] -> output: false
     */
    public static boolean allStartWithA(List<String> list) {
        for (String word : list) {
            if (!word.toLowerCase().startsWith("a")) {
                return false;
            }
        }
        return true;
    }

    /**
     * OPTIONAL MORE CHALLENGING PROBLEM
     * NOT REQUIRED
     *
     * Determines if the array can be split into two contiguous subarrays with equal
     * sums.
     * The method checks if there exists an index where the sum of elements to the
     * left of the index
     * is equal to the sum of elements to the right. Both subarrays must be
     * contiguous.
     *
     * @param arr an array of integers to evaluate
     * @return true if there exists a split point where the left and right
     *         contiguous subarrays have equal sums, false otherwise
     *
     *         Example:
     *         Input: [1, 3, 8, 2, 1, 2, 7]
     *         Output: true (since [1, 3, 8] and [2, 1, 2, 7] both sum to 12)
     *
     *         Input: [1, 2, 3, 4, 5]
     *         Output: false (no contiguous split results in equal sums)
     */
    public static boolean canPartitionWithEqualSums(int[] arr) {
        int totalSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            leftSum += arr[i];
            int rightSum = totalSum - leftSum;

            if (leftSum == rightSum) {
                return true;
            }
        }

        return false;
    }

}