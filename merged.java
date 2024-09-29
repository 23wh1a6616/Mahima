public class StringMerger {

    public static String mergeAlternately(String s1, String s2) {
        StringBuilder merged = new StringBuilder();
        int length1 = s1.length();
        int length2 = s2.length();
        int maxLength = Math.max(length1, length2);
        
        for (int i = 0; i < maxLength; i++) {
            if (i < length1) {
                merged.append(s1.charAt(i)); // Add from s1
            }
            if (i < length2) {
                merged.append(s2.charAt(i)); // Add from s2
            }
        }
        
        return merged.toString();
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "123456";
        String result = mergeAlternately(s1, s2);
        System.out.println("Merged String: " + result); 
    }
}


