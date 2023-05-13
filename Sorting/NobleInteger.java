
  import java.util.Arrays;
    /*
    Problem Description
    Given an integer array A, find if an integer p exists in the array
    such that the number of integers greater than p in the array equals p.

    https://www.geeksforgeeks.org/noble-integers-in-an-array-count-of-greater-elements-is-equal-to-value/
     */
    public class NobleInteger {
        public static int nobleInteger(int[] Array)
        {
            int size = Array.length;  //use Array.length to calculate length of the Array
            Arrays.sort(Array);  // use Arrays.sort for sorting which takes O(nlogn) time complexity
            for(int i=0;i<size;i++)
            {
                //The continue statement breaks one iteration (in the loop),
                // if a specified condition occurs, and continues with the next iteration in the loop.
                if(i+1<size && Array[i] == Array[i+1])
                    continue;
                if(Array[i] == (size-i-1)) // (size-i-1) means check
                    // where the same elements are present after sorting
                {
                    System.out.println("Noble Integer Exists");
                    return 1;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int A[] = new int[]{4,1,1,1};
           nobleInteger(A);
        }
    }


