package sample;

public class Node {

    private String name;
    private Node next;


    // set
    public void setNext(Node next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public Node getNext() {
        return next;
    }

    public Node(String name) {
        this.name = name;
        this.next = null;
    }




}
