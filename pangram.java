import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Call the method to check if it's a pangram
        if (isPangram(sentence)) {
            System.out.println(1); // Print 1 if it is a pangram
        } else {
            System.out.println(-1); // Print -1 if it is not a pangram
        }

        scanner.close();
    }

    // Method to check if the sentence is a pangram
    public static boolean isPangram(String sentence) {
        // Create an array to track letters
        boolean[] alphabet = new boolean[26];

        // Convert the sentence to lower case to make it case-insensitive
        sentence = sentence.toLowerCase();

        // Iterate through each character in the sentence
        for (char c : sentence.toCharArray()) {
            // Check if the character is a letter
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true; // Mark the letter as found
            }
        }

        // Check if all letters are present
        for (boolean isPresent : alphabet) {
            if (!isPresent) {
                return false; // If any letter is missing, return false
            }
        }

        return true; // All letters are present
    }
}

