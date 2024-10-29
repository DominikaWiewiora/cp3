public class AlphabetOrder {
    public static boolean isAlphabet(String t) {
        // Loop through the string from the first character to the second last
        for (int i = 0; i < t.length() - 1; i++) {
            // Compare the current character with the next character
            if (t.charAt(i) > t.charAt(i + 1)) {
                return false; // If current char is greater than next char, return false
            }
        }
        return true; // If all characters are in order, return true
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(AlphabetOrder.isAlphabet("abegsw")); // Should return true
        System.out.println(AlphabetOrder.isAlphabet("abcmhsw")); // Should return false
        System.out.println(AlphabetOrder.isAlphabet("aabbcc")); // Should return true
        System.out.println(AlphabetOrder.isAlphabet("xyz")); // Should return true
        System.out.println(AlphabetOrder.isAlphabet("zyx")); // Should return false
    }
}
