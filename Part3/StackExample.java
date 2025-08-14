package Part3;
import java.util.*;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); 

        stack.push(10);
        stack.push(8);
        stack.push(13);
        stack.push(122);
        stack.push(132);

        int topElement = stack.pop();
        System.out.println("First: " + topElement);

        int size = stack.size();
        System.err.println("Size : " + size);

        boolean isEmpty = stack.empty();
        System.err.println("Empty: "+ isEmpty);

        int topEl_Peek = stack.peek();
        System.err.println("peek: " + topEl_Peek);
    }
}
