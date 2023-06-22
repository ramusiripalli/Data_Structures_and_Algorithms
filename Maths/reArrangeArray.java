Given an array A of size N. Rearrange the given array so that A[i] becomes A[A[i]] with O(1) extra space.

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void rearrangeArray(List<Integer> A) {
        int n = A.size();

        // Encode the new values at each index
        for (int i = 0; i < n; i++) {
            A.set(i, A.get(i) + (A.get(A.get(i)) % n) * n);
        }

        // Decode the new values and update the list
        for (int i = 0; i < n; i++) {
            A.set(i, A.get(i) / n);
        }
    }

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        A.add(4);
        A.add(0);
        A.add(2);
        A.add(1);
        A.add(3);

        System.out.println("Original List: " + A);

        rearrangeArray(A);

        System.out.println("Rearranged List: " + A);
    }
}


// with array

public class Solution {
    public static void rearrangeArray(int[] A) {
        int n = A.length;
        
        // Encode the new values at each index
        for (int i = 0; i < n; i++) {
            A[i] += (A[A[i]] % n) * n;
        }
        
        // Decode the new values and update the array
        for (int i = 0; i < n; i++) {
            A[i] /= n;
        }
    }

    public static void main(String[] args) {
        int[] A = {4, 0, 2, 1, 3};
        
        System.out.println("Original Array: " + Arrays.toString(A));
        
        rearrangeArray(A);
        
        System.out.println("Rearranged Array: " + Arrays.toString(A));
    }
}

