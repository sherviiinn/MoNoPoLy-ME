package ds.map;

public class Entry {
    public int key;
    public Object value;
    public Entry next;

    public Entry(int key, Object value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}