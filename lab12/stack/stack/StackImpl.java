package stack;
import java.util.Stack;

public class StackImpl extends Stack {
    private stack.StackItem top;
    @Override
    public Object push(Object item) {
        stack.StackItem newItem = new stack.StackItem(item);
        newItem.setNext(top);
        top = newItem;
        return item;
    }

    @Override
    public Object pop() {
        if (empty()) {
            throw new IllegalStateException("The stack is empty!");
        }
        Object item = top .getItem();
        top = top.getNext();
        return item;
    }

    @Override
    public boolean empty() {
        return top == null;
    }
}