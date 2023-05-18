/*
Q2. Multiplication of previous and next
Given an array of integers A, update every element with multiplication of previous and next elements
 with following exceptions.
 a) First element is replaced by multiplication of first and second.
 b) Last element is replaced by multiplication of last and second last.

Input 1:
    A = [1, 2, 3, 4, 5]
Output 1:
    [2, 3, 8, 15, 20]
 */

import java.util.Arrays;

public class MultiplicationOfPreviousAndNext {

    public static int[] multiplication(int[] array)
    {
        int size = array.length;
        //This below condition you need to put mandatory , if Array is [0] , we will get Index out of bound
        //so if array is [] or [0] , we will simply return the array.
        //otherwise we are using array[1] which will provide index out of bound
        if(size<=1)
        return array;
        //Storing first value in previousElement variable
        int previousElement = array[0];
        // As we were not passing in loop i=0, we need to update array[0] here by this condition.
        array[0] = array[0] * array[1];
        //update for the rest of the array from i=1 to i<size-1
        for(int i=1;i<size-1;i++)
        {
            int current = array[i];
            array[i] = previousElement * array[i+1];
            previousElement = current;
        }
        //update the value of the last element
        array[size-1] = previousElement * array[size-1];

        return array;
    }
    public static void main(String[] args) {
       int[] array = {1,2,3,4,5};
       int[] result = multiplication(array);
        System.out.println("The result of the array is " + Arrays.toString(result));
    }
}
