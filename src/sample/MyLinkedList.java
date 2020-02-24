package sample;

public class MyLinkedList {

    private Node head;

    public MyLinkedList(Node head) {
        this.head = head;
    }

    public MyLinkedList() {

    }

//
    public void addToFront(Node node) {
        if (node == null) {
            return;
        }

        if (head == null) {
            head = node;
        } else {
            node.setNext(head);
            head=node;
        }

        //node.setNext();  // hhhhh&&&&&&&&& sdfsdfłłłłłłłł
    }
    public void addToEnd(Node node) {
        if (node == null) { // provision
            return;
        }

        if (head == null) {
            head = node;
        } else {
            Node tmp = head; // pomocna premmena
            int count = 0;
            while (tmp.getNext()!= null) {
                tmp = tmp.getNext();
                count++;
                System.out.println("pocitadlo " + count);
            }
            tmp.setNext(node);

        }
    }

    public int getSize() {
       // return 1;

        if (head == null) {
            return 0;
        } else {
            Node tmp = head; // help value
            int count = 0;

            while (tmp != null) {
                tmp = tmp.getNext();
                count++;
            }
            return count;
        }
    }


    public void add(Node node , int index) {/// dosnt work I dont know why
        if (node == null){
            return;
        }
        if (index <= 0){
            addToFront(node);
        }else if (index >= getSize()){
            addToEnd(node);
        }else {

            Node node1 = head;
            for (int i = 1; i < index; i++) {
                node1 = node1.getNext(); // hello
            }
            node.setNext(node1.getNext());
            node1.setNext(node);
        }

    }

    public void print() {
        if (head == null) {
            System.out.println("LInkd list is empty ");

        } else {// potrebuje prechadza listom pomocou  pomocnej premenej

            Node tmp = head; // pomocna premmena

            while (tmp != null) {
                System.out.println(tmp.getData());
                tmp = tmp.getNext();
            }
        }
    }

    public boolean remove(Node node) {
        if (head == null || node == null) {
            return false ;
        }

        if (head == node) {
            head = node.getNext();
            return true;
        }

        Node tmp = head;

        while (tmp.getNext() != node) {
            tmp = tmp.getNext();

            if (tmp == null) {
                return false;
            }
        }

        tmp.setNext(tmp.getNext().getNext());
        return true;
    }

    public void removeAll() {
        head = null;

    }//

    public Node findByName(String name ) {
        if (head == null || name== null) {

            return null;
        }

        Node tmp = head;
        while (tmp != null) {
            if (tmp.getData().equals(name)) {
                return tmp;
            }
            tmp = tmp.getNext();

        }
        return null;
    }

}
