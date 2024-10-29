public class MyArray {

    // a. Return the number of even values in the array
    public static int even(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // b. Return the number of positive odd numbers in the array
    public static int positiveOdd(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num > 0 && num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // c. Return the array in reverse order
    public static int[] reverse(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    // d. Return true if both arrays are identical
    public static boolean compare(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false; // Different lengths mean they can't be identical
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; // Found a difference
            }
        }
        return true; // No differences found
    }

    // e. Return numbers from the first array that do not appear in the second array
    public static int[] different(int[] array1, int[] array2) {
        int count = 0;

        // Count how many numbers are different
        for (int num1 : array1) {
            boolean found = false;
            for (int num2 : array2) {
                if (num1 == num2) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                count++; // Increment count for each unique number
            }
        }

        // Create an array for different numbers
        int[] result = new int[count];
        int index = 0;
        for (int num1 : array1) {
            boolean found = false;
            for (int num2 : array2) {
                if (num1 == num2) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[index++] = num1; // Add unique number to result array
            }
        }
        return result;
    }

    // f. Return true if the number is present in the array
    public static boolean exist(int number, int[] array) {
        for (int num : array) {
            if (num == number) {
                return true; // Number found
            }
        }
        return false; // Number not found
    }

    // g. Return the second largest number in the array
    public static int secondMax(int[] array) {
        int first = Integer.MIN_VALUE; // Initialize first largest
        int second = Integer.MIN_VALUE; // Initialize second largest

        for (int num : array) {
            if (num > first) {
                second = first; // Update second largest
                first = num;    // Update first largest
            } else if (num > second && num != first) {
                second = num; // Update second largest if not equal to first
            }
        }
        return second; // Return the second largest number
    }

    // h. Return the sum of values in the last column of a 2D array
    public static int lastColumn(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][array[i].length - 1]; // Sum last column
        }
        return sum;
    }

    // i. Return the array with the first and last column swapped
    public static int[][] swap(int[][] array) {
        int[][] swapped = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            swapped[i][0] = array[i][array[i].length - 1]; // Swap first column
            swapped[i][array[i].length - 1] = array[i][0]; // Swap last column
            for (int j = 1; j < array[i].length - 1; j++) {
                swapped[i][j] = array[i][j]; // Copy middle columns
            }
        }
        return swapped;
    }

    // j. Return the 2D array converted to a 1D array
    public static int[] two2one(int[][] array) {
        int totalLength = 0;
        for (int[] row : array) {
            totalLength += row.length; // Calculate total length
        }

        int[] oneDArray = new int[totalLength];
        int index = 0;
        for (int[] row : array) {
            for (int num : row) {
                oneDArray[index++] = num; // Fill 1D array
            }
        }
        return oneDArray; // Return the 1D array
    }




    public static void main(String[] args) {
        // Example arrays for testing
        int[] array1 = {1, 2, 3, 4, 5, 6}; // Simple 1D array
        int[] array2 = {4, 5, 6, 7, 8}; // Another 1D array
        int[][] twoDArray = { // Simple 2D array
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // a. Count even numbers in array1
        int evenCount = MyArray.even(array1);
        System.out.println("Number of even values in array1: " + evenCount);

        // b. Count positive odd numbers in array1
        int positiveOddCount = MyArray.positiveOdd(array1);
        System.out.println("Number of positive odd numbers in array1: " + positiveOddCount);

        // c. Reverse array1
        int[] reversedArray = MyArray.reverse(array1);
        System.out.print("Reversed array1: ");
        printArray(reversedArray);

        // d. Compare array1 and array2
        boolean areIdentical = MyArray.compare(array1, array2);
        System.out.println("Are array1 and array2 identical? " + areIdentical);

        // e. Find numbers in array1 not in array2
        int[] differentNumbers = MyArray.different(array1, array2);
        System.out.print("Numbers in array1 not in array2: ");
        printArray(differentNumbers);

        // f. Check if a number exists in array1
        int numberToCheck = 3;
        boolean exists = MyArray.exist(numberToCheck, array1);
        System.out.println("Does " + numberToCheck + " exist in array1? " + exists);

        // g. Find the second largest number in array1
        int secondLargest = MyArray.secondMax(array1);
        System.out.println("Second largest number in array1: " + secondLargest);

        // h. Sum of the last column in twoDArray
        int lastColumnSum = MyArray.lastColumn(twoDArray);
        System.out.println("Sum of the last column in twoDArray: " + lastColumnSum);

        // i. Swap the first and last columns of twoDArray
        int[][] swappedArray = MyArray.swap(twoDArray);
        System.out.println("Array after swapping first and last columns:");
        for (int i = 0; i < swappedArray.length; i++) {
            printArray(swappedArray[i]);
        }

        // j. Convert twoDArray to a 1D array
        int[] oneDArray = MyArray.two2one(twoDArray);
        System.out.print("2D array converted to 1D array: ");
        printArray(oneDArray);
    }

    // Method to print arrays
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println();
    }

    // Method to print 2D arrays
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            printArray(array[i]);
        }
    }
}
