package Stacks;
import java.util.Stack;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Stack <String> stack = new Stack<>();
        stack.push("apple");
        stack.push("pinapple");
        stack.push("orange");
        stack.push("grapes");
        stack.push("banana");
        // System.out.println(stack.empty());
        // System.out.println(stack);
        // // System.out.println
        // stack.pop();
        // System.out.println(stack);
        // System.out.println(stack.peek());
        String myfavfruit = stack.pop();
        System.out.println(myfavfruit);
    }
}