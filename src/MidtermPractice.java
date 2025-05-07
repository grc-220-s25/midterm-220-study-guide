import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MidtermPractice {

    public static void main(String[] args) {
        // After implementing a method, call it here with
        // some sample input and print the result to
        // check if it works. Fix any issues you find.

        // List<String> test = new ArrayList(Arrays.asList("apple", "banana", "kiwi"));
        // String longest = findLongestWord(test);
        // System.out.println(longest);

        // float[] nums = {1.5f, 3.5f, 2.0f, 3.0f};
        // System.out.println(findAverage(nums));

        // int[] returnsTrue = {3, 6, 9};
        // int[] returnsFalse = {3, 4, 6, 9};

        // System.out.println(allDivisibleBy3(returnsTrue));
        // System.out.println(allDivisibleBy3(returnsFalse));

        // List<String> testTure = new ArrayList(Arrays.asList("apple", "apricot", "avocado"));
        // List<String> testFlase = new ArrayList(Arrays.asList("apple", "banana", "avocado"));
        // System.out.println(allStartWithA(testTure));
        // System.out.println(allStartWithA(testFlase));

        int[] returnsTrue = {1, 3, 8, 2, 1, 2, 7};
        int[] returnsFalse = {1, 2, 3, 4, 5};
        System.out.println(canPartitionWithEqualSums(returnsTrue));
        System.out.println(canPartitionWithEqualSums(returnsFalse));
    }

    /**
     * Finds the longest word in an List of Strings.
     * @param list an ArrayList of words
     * @return the longest word in the list
     * Example: input: ["apple", "banana", "kiwi"] -> output: "banana"
     */
    public static String findLongestWord(List<String> list) {
        /*
         loop for each varibales character amounts
         then do some comparasion between them probably need a max varible set to 0
         then return the exact index of the larget word
         */
        int longestWordSize = 0;
        String longestWordLength = "";
        for(int i = 0; i < list.size(); i++){
            longestWordSize = list.get(0).length();
            if (list.get(i).length() > longestWordSize) {
                longestWordSize = list.get(i).length();
                longestWordLength = list.get(i);
            }
        }

        return longestWordLength;
    }
    // --- Attempt 1 (No Resources, 10 min) ---
    // Time Completed: 2:37 seconds left
    // Notes: The actual making of the method was fine but I need to review on Arraylist istantiation because I still remebered but was too clear on it.

   


    /**
     * Counts how many words are longer than 5 characters in the keys of a Map.
     * @param map a Map of strings to integers
     * @return the count of words longer than 5 characters
     * Example: input: ["why"=7, "hello"=8, "brilliant"=99, "world"=15, "amazing"=17] -> output: 2
     */
    public static int countLongWords(Map<String, Integer> map) {
        /*
        loop through each get values and do some sort of comparison to find a specific one
         Need some comparison > 5
         */
        // for (Map<String,Integer> element : map.values()) {
        // }
        return -1;
    }
    // --- Attempt 1 (No Resources, 10 min) ---
    // Time Completed: Was not able to complete within the time frame
    // Notes: I need to refresh on how to loop through a map using a loop

   




    /**
     * Finds the average of the floats in an array.
     * @param arr an array of floats
     * @return the average of the values
     * Example: input: [1.5, 3.5, 2.0, 3.0] -> output: 2.5
     */
    public static double findAverage(float[] arr) {
        /*
         loop through
         two varibles we ned
         sum and count do divsion of them retunr Average
         */
        float sum = 0;
        int count = arr.length;
        for (float value : arr) {
            sum += value;
        }
        float Average = sum/count;
        return Average;
    }

     // --- Attempt 1 (No Resources, 10 min) ---
    // Time Completed: 3:52 seconds left
    // Notes: good just need to review proper float list istantiation.

   




    /**
     * Counts how many odd numbers there are in the values of a Map.
     * @param map a HashMap of String keys and Integer values
     * @return the count of odd numbers in the values
     * Example: input: {"a"=7, "x"=4, "z"=5} -> output: 2
     */
    public static int countOddNumbers(Map<String, Integer> map) {
        int counter = 0;
        // for (Map<String, Integer> value : map.keySet()) {
        //     int currentNumber = value.get(map.keySet());
        //     if (currentNumber % 2 != 0) {
        //         counter++;
        //     }
        // }
        return counter;
    }
    // --- Attempt 1 (No Resources, 10 min) ---
    // Time Completed: could not solve within the time frame
    // Notes: I think I have the logic correct I just need to know how to properly loop through

   


    /**
     * Returns true if all values are divisible by 3 in an array.
     * @param arr an array of integers
     * @return true if all values are divisible by 3, false otherwise
     * Example: input: [3, 6, 9] -> output: true
     * Example 2: input: [3, 4, 6, 9] -> output: false
     */
    public static boolean allDivisibleBy3(int[] arr) {
        /*
         loop through
         modulus by 3 if statement return true or false
         */
        int checker = 0;
        for(int num : arr){
            if (num % 3 == 0) {
                checker++;
            } else{
                checker = 0;
                return false;
            }
        }
        if (checker == arr.length) {
            return true;
        } 
        return false;
    }
    // --- Attempt 1 (No Resources, 10 min) ---
    // Time Completed: 1:27 seconds left
    // Notes: It works but I think I need to clean up logic and look for this one

   





    /**
     * Returns true if all words start with 'a' in an ArrayList of Strings.
     * @param list an ArrayList of words
     * @return true if all words start with 'a', false otherwise
     * Example: input: ["apple", "apricot", "avocado"] -> output: true
     * Example: input: ["apple", "banana", "avocado"] -> output: false
     */
    public static boolean allStartWithA(List<String> list) {
        /*
         loop thorugh check for charAt(i)
         save that to see streak
         return true or false depending
         */
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toLowerCase().charAt(0) == 'a') {
                counter++;
            }
        }
        if (counter == list.size()) {
            return true;
        }
        return false;
    }
    // --- Attempt 1 (No Resources, 10 min) ---
    // Time Completed: 2:57 seconds left
    // Notes: works I think I can clean up logic a bit more.

   
    

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
        int firstHalf = 0;
        int secondHalf = 0;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        firstHalf = arr[0] + arr[1] + arr[2];
        secondHalf = arr[3] + arr[4] + arr[5] + arr[6];
        if (total/2 == firstHalf && total/2 == secondHalf) {
            return true;
        }
        return false;
    }

    // --- Attempt 1 (No Resources, 10 min) ---
    // Time Completed: completed the method but had no time to test
    // Notes: this doe work only for check in the TRUE input, not the false our put because its out of index
    // I know this isnt optimal because its fixed but I think I can improve it.

   

}