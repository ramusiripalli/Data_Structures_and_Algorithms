public class PascalTriangle {
    //Here the return type is 2D Array
    public static int[][] generatePascalTriangle(int number)
    {
        //created array[4][4] and all values are zero by default.
        int[][] pascalTriangle = new int[number][number];

        //looping through the 2D Array
        for(int i=0;i<number;i++)
        {
            //Take care of j<=i , you need to print pattern upto j<=i
           for(int j=0;j<=i;j++)
           {
            // As pascal triangle consists of 1 in the edge so this condition is very important
               if(j==0 || j==i)
               {
                   //providing value as 0 in this case
                   pascalTriangle[i][j] = 1;
               }
               else
               {
                   //if j!=i and j!=0 this condition will execute. It was the sum of [i-1][j-1] and [i-1][j]
                   pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];
               }
           }
        }


        return pascalTriangle;
    }
    public static void main(String[] args) {
        //this is the size given static , u can provide dynamically also
        int size= 4;
        //calling to a function generatePascalTriangle and assign into to triangle for printing
        int[][] pascalTriangle = generatePascalTriangle(size);
        //printing the pascalTriangle output generated using return of generatePascalTriangle function
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(pascalTriangle[i][j] + " ");
            }
            System.out.println();
        }

    }
}
