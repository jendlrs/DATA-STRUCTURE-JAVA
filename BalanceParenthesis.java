import java.util.Scanner;
import java.util.Stack;

public class BalanceParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the number of sets of parentheses: ");
        int numberOfSets = scanner.nextInt(); // Number of sets of parentheses
        
        for (int i = 0; i < numberOfSets; i++) {
            System.out.print("\nEnter the Parentheses Set " + (i + 1) + ": "); //Prompt for each set of parentheses
            String parentheses = scanner.next(); // Read each set of parentheses
            
            if (isBalanced(parentheses)) { //method to be defined later
                System.out.println("\nBALANCED");
            } else {
                System.out.println("\nNOT BALANCED");
            }
        }
        
        scanner.close();
    }

        public static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < parentheses.length(); i++) {
            char parenthesisChar = parentheses.charAt(i);
            
            if (parenthesisChar == '(' || parenthesisChar == '{') {
                stack.push(parenthesisChar);
            } else if (parenthesisChar == ')' || parenthesisChar == '}') {
                if (stack.isEmpty()) {
                    return false; // Unbalanced
                }
                
                char matchingOpeningParenthesis = stack.pop();
                
                if ((parenthesisChar == ')' && matchingOpeningParenthesis != '(') || 
                    (parenthesisChar == '}' && matchingOpeningParenthesis != '{')) {
                    return false; // Unbalanced
                }
            }
        }
        
        return stack.isEmpty(); // Balanced if stack is empty at the end
    }
}