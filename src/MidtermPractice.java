import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MidtermPractice {

    public static void main(String[] args) {
        // List<String> word = new ArrayList<>();
        // word.add("Banna");
        // word.add("Orange");
        // word.add("Mangooooooo");
        // String result = findLongestWord(word);
        // System.out.println("The Longest word is " + result);
        /**************/
        // Map<String, Integer> myMap= new HashMap<>();
        // myMap.put("why", 7);
        // myMap.put("hello",8);
        // myMap.put("Kingston",10);
        // myMap.put("Amazing",99);
        // myMap.put("Education",25);
        // int result = countLongWords(myMap);
        // System.out.println("Words longer than 5 letters " + result );
        /***************/
        // float [] nums = { 1.5f, 3.5f, 2.0f, 1.0f};
        // double avg = findAverage(nums);
        // System.out.println("Average: " + avg);
        /***************/
    //     Map<String, Integer> myMap = new HashMap<>();
    // myMap.put("a", 7);
    // myMap.put("x", 4);
    // myMap.put("z", 5);

    // int result = countOddNumbers(myMap);
    // System.out.println("Odd numbers count: " + result);
    /***************/
    // int[] test1 = {3, 6, 9};
    // int[] test2 = {3, 4, 6, 9};
    // System.out.println(allDivisibleBy3(test1));  
    // System.out.println(allDivisibleBy3(test2));
    /************/
    // List<String> list1 = new ArrayList<>();
    // list1.add("apple");
    // list1.add("apricot");
    // list1.add("avocado");

    // List<String> list2 = new ArrayList<>();
    // list2.add("apple");
    // list2.add("banana");
    // list2.add("avocado");
    // System.out.println(allStartWithA(list1));
    // System.out.println(allStartWithA(list2));
    /**************/
    int[] test1 = {1, 3, 8, 2, 1, 2, 7};   
    int[] test2 = {1, 2, 3, 4, 5};         

    System.out.println(canPartitionWithEqualSums(test1));
    System.out.println(canPartitionWithEqualSums(test2));
}
        // After implementing a method, call it here with
        // some sample input and print the result to
        // check if it works. Fix any issues you find.
    

    /**
     * Finds the longest word in an List of Strings.
     * @param list an ArrayList of words
     * @return the longest word in the list
     * Example: input: ["apple", "banana", "kiwi"] -> output: "banana"
     */
    public static String findLongestWord(List<String> list) {
       if (list == null || list.isEmpty()){
        return "";
       }
       String Longest = list.get(0);
       for(String word : list){
        if (word.length() > Longest.length()){
            Longest = word;
        }
       }
       return Longest;
    }

    /**
     * Counts how many words are longer than 5 characters in the keys of a Map.
     * @param map a Map of strings to integers
     * @return the count of words longer than 5 characters
     * Example: input: ["why"=7, "hello"=8, "brilliant"=99, "world"=15, "amazing"=17] -> output: 2
     */
    public static int countLongWords(Map<String, Integer> map) {
       int count = 0; 
       for(String word : map.keySet()){
        if(word.length()>5){
            count++;
        }
       }return count;
    }

    /**
     * Finds the average of the floats in an array.
     * @param arr an array of floats
     * @return the average of the values
     * Example: input: [1.5, 3.5, 2.0, 3.0] -> output: 2.5
     */
    public static double findAverage(float[] arr) {
        if (arr == null || arr.length == 0){
        return 0.0;  
    } 
    float sum = 0;

    for(float num : arr){
        sum += num;
    }
    return sum / arr.length;

}
    


    /**
     * Counts how many odd numbers there are in the values of a Map.
     * @param map a HashMap of String keys and Integer values
     * @return the count of odd numbers in the values
     * Example: input: {"a"=7, "x"=4, "z"=5} -> output: 2
     */
    public static int countOddNumbers(Map<String, Integer> map) {
        int count = 0;
        for(Integer value : map.values()){
        if(value % 2 !=0){
            count++;
        }
        }
        return count;
    }

    /**
     * Returns true if all values are divisible by 3 in an array.
     * @param arr an array of integers
     * @return true if all values are divisible by 3, false otherwise
     * Example: input: [3, 6, 9] -> output: true
     * Example 2: input: [3, 4, 6, 9] -> output: false
     */
    public static boolean allDivisibleBy3(int[] arr) {
        for(int num : arr){
            if(num % 3 != 0){
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
        for(String word : list){
            if(!word.startsWith("a")){
                return false;
            }
        }
        return true;
    }

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
        /*
         * I will need the total sum of arry
         *          */
        int totalSum =0; 
        for(int num : arr){
            totalSum += num;
        }
        return false;
    }
}

