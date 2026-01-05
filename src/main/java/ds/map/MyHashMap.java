package ds.map;

public class MyHashMap {
    private Entry[] buckets;
    private int capacity;

    public MyHashMap(int capacity) {
        this.capacity = capacity;
        this.buckets = new Entry[capacity];
    }

    private int getHash(int key) {
        return key % capacity;
    }

    public void put(int key, Object value) {
        int index = getHash(key);
        Entry newEntry = new Entry(key, value);

        if (buckets[index] == null) {
            buckets[index] = newEntry;
        } else {
            Entry current = buckets[index];
            while (current.next != null) {
                if (current.key == key) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            if (current.key == key) {
                current.value = value;
            } else {
                current.next = newEntry;
            }
        }
    }

    public Object get(int key) {
        int index = getHash(key);
        Entry current = buckets[index];
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }
}