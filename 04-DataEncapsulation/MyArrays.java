public class MyArrays {

    // Static method to count the number of positive odd values in the array
    public static int odd(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num > 0 && num % 2 != 0) { // Check if the number is positive and odd
                count++;
            }
        }
        return count;
    }

    // Static method to calculate the sum of numbers greater than the arithmetic mean
    public static int above(int[] array) {
        int sum = 0;
        double mean;
        int total = 0;
        
        // Calculate the total sum of elements to find the mean
        for (int num : array) {
            total += num;
        }
        mean = (double) total / array.length; // Calculate the arithmetic mean

        // Sum the elements that are greater than the mean
        for (int num : array) {
            if (num > mean) {
                sum += num;
            }
        }
        return sum;
    }

    // Main method to test the MyArrays class
    public static void main(String[] args) {
        int[] arr1 = {3, 2, -5, 4, 1, -7};
        int[] arr2 = {5, 2, 7, 4, 2};

        System.out.println("MyArrays.odd(arr1) returns: " + MyArrays.odd(arr1)); // Should print: 2
        System.out.println("MyArrays.above(arr2) returns: " + MyArrays.above(arr2)); // Should print: 12
    }
}

