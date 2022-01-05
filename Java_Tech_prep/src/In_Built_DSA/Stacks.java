package In_Built_DSA;
import java.util.Stack;
import java.util.Iterator;
import java.util.ListIterator;

public class Stacks {

    public static void main(String[] args) {

        Stack<Integer> my_stack = new Stack<>();

        my_stack.push(10);
        my_stack.push(20);
        my_stack.push(30);
        my_stack.push(40);
        my_stack.push(50);
        my_stack.push(60);
        my_stack.push(70);
        my_stack.push(80);
        my_stack.push(90);
        my_stack.push(100);

        // Using an Iterator to Fetch Stack Elements
        Iterator<Integer> iterator = my_stack.iterator();

        while(iterator.hasNext()) {
            Object element = iterator.next();
            System.out.print(element + "\t");
        }

        System.out.println("\n\n");

        // Using the for-each Iterator to Fetch Stack Elements
        for(Integer x : my_stack) {
            System.out.print(x + "\t");
        }

        System.out.println("\n\n");

        // Using a List-Iterator to Fetch Stack Elements
        ListIterator<Integer> list_iterator = my_stack.listIterator(my_stack.size());
        while(list_iterator.hasPrevious()) {
            Object element = list_iterator.previous();
            System.out.print(element + "\t");
        }
    }
}
