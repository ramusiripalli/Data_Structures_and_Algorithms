public class RowWithMaximumNumberOfOnes_normalApproach {
    public static int rowsWithmaximumNumberOfOnes(int[][] Array) {
        int size = Array.length;
        //initialize maxRow to -1 and maxCounter = 0 , as we have 0 index, so I have provided with -1;
        int maxRow = -1;
        int maxCounter = 0;
        for (int i = 0; i < size; i++) {
            int count = countOnes(Array[i]); // calling countOnes Function , it contains whole row.
            if (count > maxCounter) {
                maxCounter = count;
                maxRow = i;
            }

        }

        return maxRow;
    }

    public static int countOnes(int[] row) {
        int counter = 0;
        for (int num : row) {
            if (num == 1) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 1, 1},
                {0, 1, 1, 1}
        };
        int result = rowsWithmaximumNumberOfOnes(matrix);
        System.out.println("The rows with maximum ones is " + result);
    }
}
