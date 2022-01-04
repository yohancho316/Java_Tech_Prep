package Data_Structure_Implementation;

public class StackObject {

    // Member Attributes
    private int[] stack;
    private int current_position;
    private static final int MAX_SIZE = 1000;

    // Default Method Constructor
    public StackObject() {
        this.stack = new int[MAX_SIZE];
        this.current_position = -1;
    }

    // isEmpty() Method Definition
    public boolean isEmpty() {
        if(current_position == -1) {
            return true;
        }
        return false;
    }

    // getSize() Method Definition
    public int getSize() {
        return current_position;
    }

    // push() Method Definition
    public void push(int value) {
        if(current_position <= MAX_SIZE) {
            ++current_position;
            stack[current_position] = value;
        } else {
            System.out.println("Stack Overflow!");
        }
    }

    // pop() Method Definition
    public void pop() {
        if(current_position == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println(stack[current_position - 1]);
            --current_position;
        }
    }

    // peek() Method Definition
    public int peek() {
        if(current_position == -1) {
            System.out.println("Stack is Empty!");
        } else {
            return stack[current_position];
        }
        return -1;
    }

    // search() Method Definition
    public int search(int val) {
        for(int i = 0; i < stack.length; i++) {
            if(stack[i] == val) {
                return i;
            }
        }
        return - 1;
    }

    // toString() Method Definition
    public String toString() {
        String string_stack = "[\t";
        for(int i = 0; i <= current_position; i++) {
            string_stack += stack[i] + "\t";
        }

        return string_stack += "]";
    }

    public static void main(String[] args) {
        StackObject my_stack = new StackObject();
        my_stack.push(10);
        my_stack.push(20);
        my_stack.push(30);
        my_stack.push(40);
        my_stack.push(50);
        System.out.println("Current Stack: \t" + my_stack.toString());
        System.out.println("Value Stored at the Top of Stack is: " + my_stack.peek());
        System.out.println("Value of 30 is Found in Index #: " + my_stack.search(30));
    }
}
