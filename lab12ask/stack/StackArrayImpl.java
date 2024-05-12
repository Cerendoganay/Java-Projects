public class StackArrayImpl implements Stack{
    ArrayList stack = new ArrayList();
    @Override
    public void push(Object item) {
        stack.add(item);
    }

    @Override
    public Object pop() {
        if (empty()) {
            throw new IllegalStateException("The stack is empty!");
        }
        return stack.remove(stack.size()-1);
    }

    @Override
    public boolean empty() {
        return stack.isEmpty();
    }
}