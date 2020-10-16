package deqo.cgob.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    Item i1,i2,i3,i4,i5 ;


    @Before
    public void setUp() {
        i1 = new Item(5);
        i2 = new Item(5);
        i3 = new Item("item");
        i4 = new Item("item");
        i5 = new Item(3);
    }

    @Test
    public void getObj() {
        assertEquals(i1.getObj(),i2.getObj());
        assertEquals(i3.getObj(),i4.getObj());
        assertNotEquals(i1.getObj(),i5.getObj());
    }

    @Test
    public void setObj() {
        assertNotEquals(i1.getObj(),i5.getObj());
        i5.setObj(5);
        assertEquals(i1.getObj(),i5.getObj());

        assertEquals(i3.getObj(),i4.getObj());
        i3.setObj("Faux");
        assertNotEquals(i3.getObj(),i4.getObj());
    }
}