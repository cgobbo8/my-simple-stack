package deqo.cgob.mysimplestack;

import java.util.EmptyStackException;


public interface ISimpleStack {

     boolean isEmpty();

     int getSize();

     void push(Item item);

     Item peek() throws EmptyStackException;

     Item pop() throws EmptyStackException;
}
