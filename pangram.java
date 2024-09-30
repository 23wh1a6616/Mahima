import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

       
        if (isPangram(sentence)) {
            System.out.println(1); 
        } else {
            System.out.println(-1);
        }

        scanner.close();
    }

  
    public static boolean isPangram(String sentence) {
        
        boolean[] alphabet = new boolean[26];

        
        sentence = sentence.toLowerCase();

       
        for (char c : sentence.toCharArray()) {
          
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true; 
            }
        }

        for (boolean isPresent : alphabet) {
            if (!isPresent) {
                return false; 
            }
        }

        return true; 
    }
}

