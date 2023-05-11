//Given an m x n matrix, return all elements of the matrix in spiral order.
//spiral matrix 1
import java.util.ArrayList;

public class SpiralMatrix {

    public static ArrayList<Integer> spiralOrder(int[][] matrix)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int rows = matrix.length;
        int columns = matrix[0].length;
        int up=0,left=0,right=columns-1,down=rows-1;
        while(result.size() < rows * columns)
        {
            for(int col=left;col<=right;col++)
            {
                result.add(matrix[up][col]);
            }
            for(int row=up+1;row<=down;row++){
                result.add(matrix[row][right]);
            }
            if(up!=down){
                for(int col=right-1;col>=left;col--){
                    result.add(matrix[down][col]);
                }
            }
            if(left!=right){
                for(int row= down-1;row>up;row--){
                    result.add(matrix[row][left]);
                }
            }
            up++;
            left++;
            right--;
            down--;


        }

        System.out.println("the resilt of the array is " + result);

        return result;

    }
    public static void main(String[] args) {
        int a[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        spiralOrder(a);


    }
}
