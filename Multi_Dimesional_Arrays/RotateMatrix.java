/*
Problem Description
You are given an n x n 2D matrix A representing an image. Rotate the image by 90 degrees (clockwise).
You need to do this in place.
Note: If you end up using an additional array, you will only receive partial score.

 */

public class RotateMatrix {
/*
The approach I am going to use is as follows
First I am going to do Transpose (Changing Rows into columns and columns into rows)
and then do reverse of each row.
at last the Image is rotated by 90 degrees
 */
   public static void rotate(int[][] matrix) // Function definition , matrix is the parameter here
   {
     transpose(matrix); // calling transpose function , first transposing and then reversing each row
     revere(matrix);  // calling reverse function
   }
   public static void transpose(int[][] matrix)
   {
      int size = matrix.length; //calculate size of the matrix using length
      for(int i=0;i<size;i++)
      {
         for(int j=i+1;j<size;j++) // we can also use j=0 , (0,0) (1,1) (2,2) all values are same, so we are not changing
         {
             // swapping (i,j) into (j,i)
             int temp = matrix[i][j];
             matrix[i][j] = matrix[j][i];
             matrix[j][i] = temp;
         }
      }
      //This for loop is not needed in code , This is used just to get output in code.
       System.out.println("The Transpose of the matrix is : ");
       for(int i=0;i<size;i++)
       {
           for(int j=0;j<size;j++)
           {
               System.out.print(" " + matrix[i][j]);
           }
       }
   }
   public static void revere(int[][] matrix)
   {
     int size = matrix.length;
     for(int i=0;i<size;i++)
     {
       for(int j=0;j<size/2;j++)
       {
           int temp = matrix[i][j];
           matrix[i][j] = matrix[i][size-1-j];
           matrix[i][size-1-j] = temp;
       }

     }
       //This for loop is not needed in code , This is used just to get output in code.
       System.out.println(" ");
       System.out.println("The Reverse of the First Row of the Matrix is : ");
       for(int i=0;i<size;i++)
       {
           for(int j=0;j<size;j++)
           {
               System.out.print(" " + matrix[i][j]);
           }
       }
   }
    public static void main(String[] args) {
     int A[][] = {
             {1,2,3},
             {4,5,6},
             {7,8,9}
     }; // Intilazing 2D array in java

        rotate(A); //calling rotate function  , A is the Argument
    }
}
