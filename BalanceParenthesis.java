import java.util.Scanner;
import java.util.Stack;

public class BalanceParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sets of parentheses: ");
        int numberOfSets = scanner.nextInt(); // Number of sets of parentheses
        
        for (int i = 0; i < numberOfSets; i++) {
            System.out.print("Enter the Parentheses Set " + (i + 1) + ": "); //Prompt for each set of parentheses
            String parentheses = scanner.next(); // Read each set of parentheses
            
            if (isBalanced(parentheses)) { //method to be defined later
                System.out.println("BALANCED");
            } else {
                System.out.println("NOT BALANCED");
            }
        }
        
        scanner.close();
    }
}