package deqo.cgob.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StackPTest {

    StackP st = new StackP();

    @Test
    public void isEmpty() {
        assertTrue(st.isEmpty() && st.getSize() == 0);
        st.push(new Item(5));
        assertFalse(st.isEmpty());
    }

    @Test
    public void getSize() {
        assertEquals(st.getSize() , 0);
        for (int i = 0; i < 10; i++) {
            st.push(new Item(i));
        }
        assertEquals(st.getSize() , 10);
        for (int i = 0; i < 5; i++) {
            st.pop();
        }
        assertEquals(st.getSize() , 5);

    }

    @Test
    public void push() {
        String phraseTest = "test push";

        assertEquals(st.getSize() , 0);
        for (int i = 0; i < 10; i++) {
            st.push(new Item(i));
        }
        assertEquals(st.getSize() , 10);
        for (int i = 0; i < 10; i++) {
            st.pop();
        }
        assertEquals(st.getSize() , 0);

        st.push(new Item(phraseTest));

        assertEquals(st.peek().getObj() , phraseTest);

    }

    @Test(expected = EmptyStackException.class)
    public void peek_Exception() {
        assertTrue(st.isEmpty());
        st.peek();
    }

    @Test
    public void peek() {
        st.push(new Item(1));
        assertEquals(st.peek().getObj(), 1);
        assertEquals(st.peek().getObj(), 1);

        st.push(new Item(2));
        assertEquals(st.peek().getObj(), 2);
        assertEquals(st.peek().getObj(), 2);

        st.pop();
        assertEquals(st.peek().getObj(), 1);
        assertEquals(st.peek().getObj(), 1);

        st.pop();
        assertTrue(st.isEmpty());
    }

    @Test(expected = EmptyStackException.class)
    public void pop_Exception() {
        assertTrue(st.isEmpty());
        st.pop();
    }

    @Test
    public void pop() {
        assertTrue(st.isEmpty());

        for (int i = 0; i <= 5; i++) {
            st.push(new Item(i));
            assertEquals(st.getSize(),i+1);
        }



        for (int i = 5; i >= 0; i--) {
            assertEquals(st.pop().getObj(),i);
            assertEquals(st.getSize(),i);
        }

        assertTrue(st.isEmpty());
    }
}