package Others;

public class CharacterCounter {

    // Method to count occurrences of a character in a string
    public int countOccurrences(String str, char ch) {
        int count = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // If the current character matches the specified character, increment the count
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        // Return the total count
        return count;
    }

    public static void main(String[] args) {
        // Create an instance of Others.CharacterCounter
        CharacterCounter characterCounter = new CharacterCounter();

        // Others.Test string and character
        String testString = "hello world";
        char testChar = 'l';

        // Count the occurrences of the character in the string
        int occurrences = characterCounter.countOccurrences(testString, testChar);

        // Print the result
        System.out.println("The character '" + testChar + "' occurs " + occurrences + " times in the string \"" + testString + "\".");
    }
}
