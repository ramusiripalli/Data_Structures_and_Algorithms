public class Solution {
    public static String convertToTitle(int columnNumber) {
        StringBuilder columnTitle = new StringBuilder();

        while (columnNumber > 0) {
            // Adjust columnNumber to 0-based index
            columnNumber--;
            // Get the remainder after dividing by 26
            int remainder = columnNumber % 26;

            char currentChar = (char) ('A' + remainder);

            // Append the corresponding character to the column title
            columnTitle.insert(0, currentChar);

            // Divide columnNumber by 26 to get the next digit
            columnNumber /= 26;
        }

        return columnTitle.toString();
    }

    public static void main(String[] args) {
        int columnNumber = 1;
        String columnTitle = convertToTitle(columnNumber);
        System.out.println("Column Title: " + columnTitle);
    }
}
