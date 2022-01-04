/*
URL: https://www.codewars.com/kata/550f22f4d758534c1100025a
Difficulty: 5-Kyu
Time Complexity: O(N)
Space Complexity: O(N)
 */

package CodeWars;
import java.util.Stack;

public class DirectionsReduction {

    public static String[] directionReduction(String[] arr) {

        // Local Declarations
        Stack<String> my_stack = new Stack<>();

        // Iterate Through String Array
        for(int i = 0; i < arr.length; i++) {

            // Check if the Stack is Empty
            if(my_stack.empty()) {
                my_stack.push(arr[i]);
            } else {
                switch(arr[i]) {
                    case "NORTH":
                        if(my_stack.peek() == "SOUTH") {
                            my_stack.pop();
                        } else {
                            my_stack.push(arr[i]);
                        }
                        break;
                    case "SOUTH":
                        if(my_stack.peek() == "NORTH") {
                            my_stack.pop();
                        } else {
                            my_stack.push(arr[i]);
                        }
                        break;
                    case "EAST":
                        if(my_stack.peek() == "WEST") {
                            my_stack.pop();
                        } else {
                            my_stack.push(arr[i]);
                        }
                        break;
                    case "WEST":
                        if(my_stack.peek() == "EAST") {
                            my_stack.pop();
                        } else {
                            my_stack.push(arr[i]);
                        }
                        break;
                } // end of Switch
            }
        } // end of For Loop

        return my_stack.stream().toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] arr = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        directionReduction(arr);
    }
}
