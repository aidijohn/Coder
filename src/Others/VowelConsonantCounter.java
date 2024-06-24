package Others;

public class VowelConsonantCounter {

    // Method to count vowels in a string
    public int countVowels(String str) {
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // If the current character is a vowel, increment the vowel count
            if (vowels.indexOf(str.charAt(i)) != -1) {
                vowelCount++;
            }
        }

        // Return the total count of vowels
        return vowelCount;
    }

    // Method to count consonants in a string
    public int countConsonants(String str) {
        int consonantCount = 0;
        String vowels = "aeiouAEIOU";

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the current character is a letter and not a vowel, it is a consonant
            if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) {
                consonantCount++;
            }
        }

        // Return the total count of consonants
        return consonantCount;
    }

    public static void main(String[] args) {
        // Create an instance of Others.VowelConsonantCounter
        VowelConsonantCounter counter = new VowelConsonantCounter();

        // Others.Test string
        String testString = "Hello World!";

        // Count the vowels and consonants in the string
        int vowels = counter.countVowels(testString);
        int consonants = counter.countConsonants(testString);

        // Print the results
        System.out.println("The number of vowels in the string \"" + testString + "\" is: " + vowels);
        System.out.println("The number of consonants in the string \"" + testString + "\" is: " + consonants);
    }
}
