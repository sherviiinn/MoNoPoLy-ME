package ds.list;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }

    public Node getHead() {
        return head;
    }

    public Node move(Node startNode, int steps) {
        if (startNode == null) return null;
        Node current = startNode;
        for (int i = 0; i < steps; i++) {
            current = current.next;
        }
        return current;
    }

    public int size() {
        return size;
    }
}