import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Prompt the user to enter the value of N
    System.out.print("Enter the number of binary numbers: ");
    int numBinaryNumbers = scanner.nextInt();
    
    // Process each binary number and convert it to decimal
    for (int i = 0; i < numBinaryNumbers; i++) {

        // Prompt the user to enter a binary number
        System.out.print("Enter binary number " + (i + 1) + ": ");
        String binary = scanner.next();
    }
    
    scanner.close();
    }
}