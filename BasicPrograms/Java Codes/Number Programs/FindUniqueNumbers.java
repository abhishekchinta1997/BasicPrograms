import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;

public class FindUniqueNumbers {

    // Method 1: Using HashMap
    public static void findUniqueUsingHashMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        // Count the occurrences of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Print elements with only 1 occurrence
        System.out.println("Unique elements using HashMap:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }

    // Method 2: Using Nested Loop
    public static void findUniqueUsingNestedLoop(int[] arr) {
        System.out.println("Unique elements using Nested Loop:");
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            
            // Compare current element with the rest of the elements
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                System.out.println(arr[i]);
            }
        }
    }

    // Method 3: Using Sorting
    public static void findUniqueUsingSorting(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Unique elements using Sorting:");
        for (int i = 0; i < arr.length; i++) {
            if ((i == 0 || arr[i] != arr[i - 1]) && (i == arr.length - 1 || arr[i] != arr[i + 1])) {
                System.out.println(arr[i]);
            }
        }
    }

    // Method 4: Using Hashing with Set
    public static void findUniqueUsingHashing(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> unique = new HashSet<>();
        
        for (int num : arr) {
            if (seen.contains(num)) {
                unique.remove(num); // Remove if already seen
            } else {
                seen.add(num);
                unique.add(num); // Add to unique set
            }
        }
        
        System.out.println("Unique elements using Hashing:");
        for (int num : unique) {
            System.out.println(num);
        }
    }

    // Method 5: Using Bitwise XOR (^) operator
    public static void findUniqueUsingXOR(int[] arr) 
    {
        int unique = 0; // Initialize unique variable
        for (int i=0; i<arr.length; i++) 
        {
            unique = unique ^ arr[i]; // XOR all the elements
        }
        
        System.out.println("The unique number is: " + unique);
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 7, 8, 9, 9, 10};
        
        findUniqueUsingHashMap(arr);
        findUniqueUsingNestedLoop(arr);
        findUniqueUsingSorting(arr);
        findUniqueUsingHashing(arr);
        findUniqueUsingXOR(arr);
    }
}
