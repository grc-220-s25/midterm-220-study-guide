import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MidtermPractice {

    public static void main(String[] args) {
        // After implementing a method, call it here with
        // some sample input and print the result to
        // check if it works. Fix any issues you find.
        List<String> findLongestWordList = new ArrayList<>();
        findLongestWordList.add("apple");
        findLongestWordList.add("banana");
        findLongestWordList.add("kiwi");
        System.out.println("findLongestWord: " + findLongestWord(findLongestWordList));

        Map<String, Integer> countLongWordsMap = new HashMap<>();
        countLongWordsMap.put("why", 7);
        countLongWordsMap.put("hello", 8);
        countLongWordsMap.put("brilliant", 99);
        countLongWordsMap.put("world", 15);
        countLongWordsMap.put("amazing", 17);
        System.out.println("countLongWords: " + countLongWords(countLongWordsMap));

        float[] arr = new float[4];
        arr[0] = (float) 1.5;
        arr[1] = (float) 3.5;
        arr[2] = (float) 2.0;
        arr[3] = (float) 3.0;
        System.out.println("findAverage: " + findAverage(arr));

        Map<String, Integer> countOddNumbersMap = new HashMap<>();
        countOddNumbersMap.put("a", 7);
        countOddNumbersMap.put("x", 4);
        countOddNumbersMap.put("z", 5);
        System.out.println("countOddNumbers: " + countOddNumbers(countOddNumbersMap));

        int[] divBy3Arr1 = {3, 6, 9};
        System.out.println("allDivisibleBy3: " + allDivisibleBy3(divBy3Arr1));

        int[] divBy3Arr2 = {3, 4, 6, 9};
        System.out.println("allDivisibleBy3: " + allDivisibleBy3(divBy3Arr2));

        List<String> allStartWithAList1 = new ArrayList<>();
        allStartWithAList1.add("apple");
        allStartWithAList1.add("apricot");
        allStartWithAList1.add("avocado");
        System.out.println("allStartWithA: " + allStartWithA(allStartWithAList1));

        List<String> allStartWithAList2 = new ArrayList<>();
        allStartWithAList2.add("apple");
        allStartWithAList2.add("banana");
        allStartWithAList2.add("avocado");
        System.out.println("allStartWithA: " + allStartWithA(allStartWithAList2));

        int[] canPartArr1 = {1, 3, 8, 2, 1, 2, 7};
        System.out.println("canPartitionWithEqualSums: " + canPartitionWithEqualSums(canPartArr1));

        int[] canPartArr2 = {1, 2, 3, 4, 5};
        System.out.println("canPartitionWithEqualSums: " + canPartitionWithEqualSums(canPartArr2));

        // Test Case 1: Example from problem description (should be true)
        int[] arr1 = {1, 3, 8, 2, 1, 2, 7};
        boolean result1 = canPartitionWithEqualSums(arr1);
        System.out.println("Test Case 1: " + result1); // Expected output: true

        // Test Case 2: Example from problem description (should be false)
        int[] arr2 = {1, 2, 3, 4, 5};
        boolean result2 = canPartitionWithEqualSums(arr2);
        System.out.println("Test Case 2: " + result2); // Expected output: false

        // Test Case 3: Empty array (should be false)
        int[] arr3 = {};
        boolean result3 = canPartitionWithEqualSums(arr3);
        System.out.println("Test Case 3: " + result3); // Expected output: false

        // Test Case 4: Single element array (should be false)
        int[] arr4 = {10};
        boolean result4 = canPartitionWithEqualSums(arr4);
        System.out.println("Test Case 4: " + result4); // Expected output: false

        // Test Case 5: Two element array with equal sum (should be true)
        int[] arr5 = {5, 5};
        boolean result5 = canPartitionWithEqualSums(arr5);
        System.out.println("Test Case 5: " + result5); // Expected output: true

        // Test Case 6: Two element array with unequal sum (should be false)
        int[] arr6 = {5, 6};
        boolean result6 = canPartitionWithEqualSums(arr6);
        System.out.println("Test Case 6: " + result6); // Expected output: false

        // Test Case 7: All zeros (should be true)
        int[] arr7 = {0, 0, 0, 0};
        boolean result7 = canPartitionWithEqualSums(arr7);
        System.out.println("Test Case 7: " + result7); // Expected output: true

        // Test Case 8: Negative numbers (should be true for this case)
        int[] arr8 = {-2, 2, -3, 3};
        boolean result8 = canPartitionWithEqualSums(arr8);
        System.out.println("Test Case 8: " + result8); // Expected output: true

        // Test Case 9: Negative numbers (should be true for this case)
        int[] arr9 = {-5, 0, 5};
        boolean result9 = canPartitionWithEqualSums(arr9);
        System.out.println("Test Case 9: " + result9); // Expected output: true

        // Test Case 10: Longer array with no split (should be false)
        int[] arr10 = {1, 1, 1, 1, 1, 1, 1};
        boolean result10 = canPartitionWithEqualSums(arr10);
        System.out.println("Test Case 10: " + result10); // Expected output: false

        // Test Case 11: Longer array with a split (should be true)
        int[] arr11 = {10, -5, 3, 7, 2, -7};
        boolean result11 = canPartitionWithEqualSums(arr11);
        System.out.println("Test Case 11: " + result11); // Expected output: true

        // Test Case 12: Longer array with a split at the beginning (should be true)
        int[] arr12 = {0, 1, -1, 5};
        boolean result12 = canPartitionWithEqualSums(arr12);
        System.out.println("Test Case 12: " + result12); // Expected output: false

        // Test Case 13: Longer array with a split at the end (should be true)
        int[] arr13 = {5, 0, 0};
        boolean result13 = canPartitionWithEqualSums(arr13);
        System.out.println("Test Case 13: " + result13); // Expected output: false

        // Test Case 14: Array with larger numbers (should be true)
        int[] arr14 = {5000000, 5000000};
        boolean result14 = canPartitionWithEqualSums(arr14);
        System.out.println("Test Case 14: " + result14); // Expected output: true
    }

    /**
     * Finds the longest word in an List of Strings.
     * 
     * @param list an ArrayList of words
     * @return the longest word in the list
     *         Example: input: ["apple", "banana", "kiwi"] -> output: "banana"
     */
    public static String findLongestWord(List<String> list) {
        int numOfChar = list.get(0).length();
        int idx = 0;
        for (int i = 0; i < list.size(); i++) {
            if (numOfChar < list.get(i).length()) {
                idx = i;
                numOfChar = list.get(i).length();
            }
        }
        return list.get(idx);
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
        for (var entry : map.entrySet()) {
            if (entry.getKey().length() > 5) {
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
        double sum = 0;
        double count = arr.length;
        for (double d : arr) {
            sum += d;
        }
        return sum / count;
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
        for (var entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
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
     * @param list an ArrayList of words
     * @return true if all words start with 'a', false otherwise
     * Example: input: ["apple", "apricot", "avocado"] -> output: true
     * Example: input: ["apple", "banana", "avocado"] -> output: false
     */
    public static boolean allStartWithA(List<String> list) {
        for (String str: list) {
            if (list.isEmpty()) {
                return false;
            } else if (str.startsWith("a")) {
                continue;
            } else {
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
        if (arr.length == 0) return false;

        int half = arr.length / 2;
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < half; i++) {
            sumLeft += arr[i];
        }
        for (int i = half; i < arr.length; i++) {
            sumRight += arr[i];
        }

        while (sumLeft > sumRight) {
            sumLeft -= arr[half - 1];
            sumRight += arr[half - 1];
            half--;
            if (sumLeft < sumRight) return false;
        }

        while (sumLeft < sumRight) {
            sumLeft += arr[half];
            sumRight -= arr[half];
            half++;
            if (sumLeft > sumRight) return false;

        }

        if (sumLeft == sumRight) {
            return true;
        }

        return false;
    }

}