//using recursion 

public class PalindromeChecker {
    public static int isPalindrome(String str) {
        // Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        // Base cases:
        if (str.length() <= 1) {
            return 1;  // Single character or empty string is a palindrome
        } else if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return 0;  // First and last characters don't match, not a palindrome
        } else {
            // Recursive case:
            // Check if the substring without the first and last characters is a palindrome
            return isPalindrome(str.substring(1, str.length() - 1));
        }
    }

    public static void main(String[] args) {
        String word = "level";
        int result = isPalindrome(word);
        if (result == 1) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}







// normal approach
public class PalindromeChecker {
    public static int isPalindrome(String str) {
        // Remove any non-alphanumeric characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return 0;  // Characters don't match, not a palindrome
            }
            left++;
            right--;
        }

        return 1;  // All characters match, it is a palindrome
    }

    public static void main(String[] args) {
        String word = "level";
        int result = isPalindrome(word);
        if (result == 1) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}






// Another recursive approach

public class PalindromeChecker {
    public static int isPalindrome(String str) {
        // Remove any non-alphanumeric characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        return isPalindromeHelper(str, 0, str.length() - 1);
    }

    private static int isPalindromeHelper(String str, int left, int right) {
        // Base cases:
        if (left >= right) {
            return 1;  // All characters have been compared and matched
        }

        if (str.charAt(left) != str.charAt(right)) {
            return 0;  // Characters don't match, not a palindrome
        }

        // Recursive case:
        // Move the pointers inward and check the next characters
        return isPalindromeHelper(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String word = "level";
        int result = isPalindrome(word);
        if (result == 1) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}

