package sample;

public class Node<T> {

    private T data;
    private Node next;


    // set
    public void setNext(Node next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public Node(T name) {
        this.data = name;
        this.next = null;
    }


//  poviem pocitacu

}
