package Data_Structure_Implementation;

public class Test {
    public static void main(String[] args) {

        // Fixed Length Stack Tests

        Stack_Fixed_Size_Array my_fixed_stack = new Stack_Fixed_Size_Array(10);
        System.out.println("Stack is Empty: " + my_fixed_stack.isEmpty());

        System.out.println(my_fixed_stack.getSize());

        System.out.println("Empty Stack as String: " + my_fixed_stack.toString());

        my_fixed_stack.push(100);
        my_fixed_stack.push(200);
        my_fixed_stack.push(300);
        my_fixed_stack.push(400);
        my_fixed_stack.push(500);
        my_fixed_stack.push(600);
        my_fixed_stack.push(700);
        my_fixed_stack.push(800);
        my_fixed_stack.push(900);
        my_fixed_stack.push(1000);

        System.out.println("Which Index is 300 Located in the Stack: " + my_fixed_stack.search(300));

        System.out.println("Stack as String: " + my_fixed_stack.toString());
        my_fixed_stack.pop();
        System.out.println("Stack as String: " + my_fixed_stack.toString());
        my_fixed_stack.pop();
        System.out.println("Stack as String: " + my_fixed_stack.toString());
        my_fixed_stack.pop();
        System.out.println("Stack as String: " + my_fixed_stack.toString());
        my_fixed_stack.pop();
        System.out.println("Stack as String: " + my_fixed_stack.toString());
        my_fixed_stack.pop();
        System.out.println("Stack as String: " + my_fixed_stack.toString());
        my_fixed_stack.pop();
        System.out.println("Stack as String: " + my_fixed_stack.toString());
        my_fixed_stack.pop();
        System.out.println("Stack as String: " + my_fixed_stack.toString());
        my_fixed_stack.pop();
        System.out.println("Stack as String: " + my_fixed_stack.toString());
        my_fixed_stack.pop();
        System.out.println("Stack as String: " + my_fixed_stack.toString());
        my_fixed_stack.pop();
        System.out.println("Stack as String: " + my_fixed_stack.toString());

        System.out.println("\n\n");

        // Stack w/ Resizable Array

        Stack_Resizable_Array resizable_stack = new Stack_Resizable_Array(10);

        System.out.println("Empty Array: " + resizable_stack.isEmpty());

        System.out.println("Size of Resizable Stack: " + resizable_stack.getSize());

        resizable_stack.push(1000);
        resizable_stack.push(2000);
        resizable_stack.push(3000);
        resizable_stack.push(4000);
        resizable_stack.push(5000);
        resizable_stack.push(6000);
        resizable_stack.push(7000);
        resizable_stack.push(8000);
        resizable_stack.push(9000);
        resizable_stack.push(10000);

        System.out.println("Which Index Contains 7000: " + resizable_stack.search(7000));

        System.out.println("Resizable Stack as String: " + resizable_stack.toString());
        resizable_stack.pop();
        System.out.println("Resizable Stack as String: " + resizable_stack.toString());
        resizable_stack.pop();
        System.out.println("Resizable Stack as String: " + resizable_stack.toString());
        resizable_stack.pop();
        System.out.println("Resizable Stack as String: " + resizable_stack.toString());
        resizable_stack.pop();
        System.out.println("Resizable Stack as String: " + resizable_stack.toString());
        resizable_stack.pop();
        System.out.println("Resizable Stack as String: " + resizable_stack.toString());
        resizable_stack.pop();
        System.out.println("Resizable Stack as String: " + resizable_stack.toString());
        resizable_stack.pop();
        System.out.println("Resizable Stack as String: " + resizable_stack.toString());
        resizable_stack.pop();
        System.out.println("Resizable Stack as String: " + resizable_stack.toString());
        resizable_stack.pop();
        System.out.println("Resizable Stack as String: " + resizable_stack.toString());
        resizable_stack.pop();
        System.out.println("Resizable Stack as String: " + resizable_stack.toString());

        System.out.println("\n\n");

        Stack_Fixed_Size_Array random_stack_1 = new Stack_Fixed_Size_Array(5);
        random_stack_1.push(900);
        random_stack_1.push(100);
        random_stack_1.push(800);
        random_stack_1.push(500);
        random_stack_1.push(300);

        Stack_Resizable_Array random_stack_2 = new Stack_Resizable_Array(5);
        random_stack_2.push(50);
        random_stack_2.push(10);
        random_stack_2.push(30);
        random_stack_2.push(20);
        random_stack_2.push(70);

        System.out.println("Unsorted Stack # 1 : " + random_stack_1.toString());
        System.out.println("Unsorted Stack # 2 : " + random_stack_2.toString());

        random_stack_1.sortStack();
        random_stack_2.sortStack();
        System.out.println();

        System.out.println("sorted Stack # 1 : " + random_stack_1.toString());
        System.out.println("sorted Stack # 2 : " + random_stack_2.toString());





    }
}
