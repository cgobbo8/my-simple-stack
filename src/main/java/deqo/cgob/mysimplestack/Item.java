package deqo.cgob.mysimplestack;

public class Item {
    private Object obj ;

    public Item(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Item{" +
                "obj=" + obj +
                '}';
    }



}
