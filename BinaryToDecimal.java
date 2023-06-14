import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of binary numbers
        System.out.print("Enter the number of binary numbers to be tested: ");
        int numBinaryNumbers = scanner.nextInt();
        int[] binaryArray = new int[numBinaryNumbers];

        // Process each binary number and convert it to decimal
        for (int i = 0; i < numBinaryNumbers; i++) {
            // Prompt the user to enter a binary number
            System.out.print("Enter binary number " + (i + 1) + ": ");
            int binary;

            //to make sure that user will enter correct binary numbers only.
            while (true) {
                binary = scanner.nextInt();
                if (isValidBinary(binary)) {
                    break;
                } else {
                    System.out.println("Invalid binary number. Please enter a binary number containing only 0s and 1s.");
                    System.out.print("Enter binary number " + (i + 1) + ": ");
                }
            }
            binaryArray[i] = binary;
        }

        scanner.close();

        //convert binary numbers to decimal
        int[] decimalResultArray = binaryToDecimal(binaryArray);

        for (int i = 0; i < decimalResultArray.length; i++) {
            int decimal = decimalResultArray[i];
            System.out.println("Decimal number " + (i + 1) + ": " + decimal);
        }
    }
    //check if a binary number is valid
    public static boolean isValidBinary(int binary) {
        String binaryString = String.valueOf(binary);
        for (char digit : binaryString.toCharArray()) {
            if (digit != '0' && digit != '1') {
                return false;
            }
        }
        return true;
    }

    //convert an array of binary numbers to decimal
    public static int[] binaryToDecimal(int[] binaryArray) {
        int[] decimalResultArray = new int[binaryArray.length];

        for (int i = 0; i < binaryArray.length; i++) {
            String binaryString = String.valueOf(binaryArray[i]);
            decimalResultArray[i] = Integer.parseInt(binaryString, 2);
        }

        return decimalResultArray;
    }
}