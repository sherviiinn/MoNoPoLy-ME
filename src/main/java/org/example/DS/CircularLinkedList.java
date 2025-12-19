package org.example.DS;

public class CircularLinkedList<T> {
    Node<T> head;
    private int size;
    public CircularLinkedList() {
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
    public Node<T> getHeadNode() {
        return head;
    }

    public Node<T> next(Node<T> node) {
        return node.next;
    }
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            head.next = head;
        } else {
            Node<T> current = head;

            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
        size++;
    }
}
