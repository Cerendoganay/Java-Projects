
import stack.Stack;
import stack.StackArrayImpl;
import stack.StackImpl;

public class StackDemo {
    public static void main(String[]args){
        Stack stack = new StackArrayImpl();
        //stack.pop();
        stack.push("A");
        stack.push("B");
        stack.push(5);
        stack.push("C");
        stack.push("D");
        stack.push(6);
        stack.push(7);
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}