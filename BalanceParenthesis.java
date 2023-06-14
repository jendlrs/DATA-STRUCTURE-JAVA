import java.util.Scanner;
import java.util.Stack;

public class BalanceParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the number of sets of parentheses: ");
        int numberOfSets = scanner.nextInt(); // Number of sets of parentheses
        scanner.nextLine();

        String [] setsOfParentheses = new String[numberOfSets]; //Store the sets of parentheses
        for (int i = 0; i < numberOfSets; i++) {
            System.out.print("\nEnter the Parentheses Set " + (i + 1) + ": "); //Prompt for each set of parentheses
            setsOfParentheses[i] = scanner.nextLine(); // Get the set of parentheses and store to parentheses array
        }

        // Check each set of parentheses for balance
        for (String parentheses : setsOfParentheses) {
            if (isBalanced(parentheses)) {
                System.out.println("\nBALANCED");
            } else {
                System.out.println("\nNOT BALANCED");
            }
        }

        scanner.close();
    }

    public static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the parentheses string
        for (int i = 0; i < parentheses.length(); i++) {
            char parenthesisChar = parentheses.charAt(i);
            
            if (parenthesisChar == '(' || parenthesisChar == '{') { // Push the opening parenthesis onto the stack
                stack.push(parenthesisChar);
            } else if (parenthesisChar == ')' || parenthesisChar == '}') {
                if (stack.isEmpty()) {
                    return false; // Unbalanced: Missing opening parenthesis.
                }
                
                char matchingOpeningParenthesis = stack.pop();
                
                if ((parenthesisChar == ')' && matchingOpeningParenthesis != '(') || 
                    (parenthesisChar == '}' && matchingOpeningParenthesis != '{')) {
                    return false; // Unbalanced: Mismatched closing parenthesis
                }
            }
        }
        
        return stack.isEmpty(); // Balanced if stack is empty at the end
    }
}