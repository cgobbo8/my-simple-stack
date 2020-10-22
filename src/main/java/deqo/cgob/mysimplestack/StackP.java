package deqo.cgob.mysimplestack;

import java.util.EmptyStackException;
import java.util.Stack;


public class StackP implements ISimpleStack {

    private  Stack<Item> stack;

    public StackP() {
        this.stack = new Stack<>();
    }

    @Override
    public boolean isEmpty() {
        return this.stack.empty() ;
    }

    @Override
    public int getSize() {
        return this.stack.size();
    }

    @Override
    public void push(Item e) {
        this.stack.push(e);
    }


    @Override
    public Item peek() throws EmptyStackException {
        return this.stack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return this.stack.pop();
    }

    public static void main(String[] args) {
        StackP test = new StackP();
        Item i1 = new Item("i1");
        test.getSize();
        test.push(i1);
        test.push(new Item(6));
    }
}
