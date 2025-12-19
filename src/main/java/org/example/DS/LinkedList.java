package org.example.DS;

public class LinkedList<T> {

    private Node<T> head;
    private int size;
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(T value) {
        if (head == null) {
            head = new Node<>(value, null);
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        Node<T> newNode = new Node<>(value, current.next);
        current.next = newNode;
        size++;
    }



    public int search(T value) {
        if (head == null) {
            return -1;
        }
        Node<T> current = head;
        int counter = 0;
        while (current.next != null) {
            if (current.data.equals(value)) {
                return counter;
            }
            current = current.next;
            counter++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public void print_forward() {
        if(head == null){
            return;
        }
        Node<T> current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }


    public Node GetHead(){
        return head;
    }


}
