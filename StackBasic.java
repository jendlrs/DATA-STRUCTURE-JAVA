public class StackBasic {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // constructor
    public StackBasic(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // initially stack is empty
    }

    // Add element to top of stack
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Unable to push " + value + ". The stack is already full.");
        }
    }
    

    // Remove element from top of stack
    public void pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println("Popped: " + poppedValue);
        } else {
            System.out.println("Unable to perform pop operation. The stack is already empty.");
        }
    }

    // Return top of stack
    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. No top element available.");
            return -1;
        }
    }

    public static void main(String args[]) {
        StackBasic stack = new StackBasic(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4); //to check if it will push when the stack is full.
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); //to check if it will pop when the stack is empty.
        System.out.println("Top element: " + stack.peek());
    }
}