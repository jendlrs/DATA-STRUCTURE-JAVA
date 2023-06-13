import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Prompt the user to enter the value of N
    System.out.print("\nEnter the number of binary numbers: ");
    int numBinaryNumbers = scanner.nextInt();
    
    // Process each binary number and convert it to decimal
    for (int i = 0; i < numBinaryNumbers; i++) {

        // Prompt the user to enter a binary number
        System.out.print("\nEnter binary number " + (i + 1) + ": ");
        String binary = scanner.next();

        // Validate the binary number
        boolean valid = true;
        for (char digit : binary.toCharArray()) {
            if (digit != '0' && digit != '1') {
                valid = false;
                break;
            }
        } 

        // Convert the binary number to decimal or display an error message
        if (valid) {
            int decimal = Integer.parseInt(binary, 2);
            System.out.println("Decimal representation: " + decimal);
        } else {
            System.out.println("Invalid binary number: " + binary);
        }
    }

        scanner.close();
    }
}