public class StringsMethods {
    public static void main(String[] args) {
        String text = "Have a nice day!";


         
         int numberOfCharacters = text.length();
         System.out.println("Number of characters: " + numberOfCharacters);
 
        
         String firstNineCharacters = text.substring(0, 9); // Index 0 to 8
         System.out.println("First 9 characters: " + firstNineCharacters);
 
         
         boolean endsWithDay = text.endsWith("day!");
         System.out.println("Ends with 'day!': " + endsWithDay);
 
        
         boolean isNotEmpty = !text.isEmpty();
         System.out.println("Text is not empty: " + isNotEmpty);
 
         
         int lastIndexOfE = text.lastIndexOf('e');
         System.out.println("Index of the last occurrence of 'e': " + lastIndexOfE);
 
        
         String textWithMinus = text.replace(' ', '-');
         System.out.println("Text with spaces replaced by '-': " + textWithMinus);
 
        
         String textUpperCase = text.toUpperCase();
         System.out.println("Text in upper case: " + textUpperCase);
    }

}
