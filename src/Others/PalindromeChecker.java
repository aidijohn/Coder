package Others;

public class PalindromeChecker {

    // Method to check if a given string is a palindrome
    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Loop until the middle of the string
        while (left < right) {
            // If characters at left and right indices are not the same, it's not a palindrome
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            // Move towards the middle
            left++;
            right--;
        }

        // If all characters matched, it's a palindrome
        return true;
    }

    public static void main(String[] args) {

        // Create an instance of Others.PalindromeChecker
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        // Others.Test strings
        String[] testStrings = {"racecar", "hello", "madam", "world", "level"};

        // Check each string and print whether it is a palindrome
        for (String str : testStrings) {
            boolean isPal = palindromeChecker.isPalindrome(str);
            System.out.println("Is \"" + str + "\" a palindrome? " + isPal);
        }
    }
}
