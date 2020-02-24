package sample;

public class Node<T> {

    private T name;
    private Node next;


    // set
    public void setNext(Node next) {
        this.next = next;
    }

    public T getData() {
        return name ;
    }

    public Node getNext() {
        return next;
    }

    public Node(T name) {
        this.name = name;
        this.next = null;
    }




}
