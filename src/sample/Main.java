package sample;

public class Main  {



    public static void main(String[] args) {


        MyLinkedList myLinkedList = new MyLinkedList();


       // Node <Integer>
        Node n1 = new Node("filop");
        Node n2 = new Node("Peter");
        Node n3 = new Node("Katarina");
        Node n4 = new Node("Erik");
        Node n5 = new Node("Katarina");
        Node n6 = new Node("ASUS ");

        myLinkedList.addToFront(n1);
        myLinkedList.addToFront(n2);
        myLinkedList.addToFront(n3);
        myLinkedList.addToEnd(n5);
        myLinkedList.addToEnd(n4);
        //myLinkedList.add(n6, 3);
        myLinkedList.print();
        System.out.println("====================");
        myLinkedList.remove(myLinkedList.findByName("filop"));
        myLinkedList.print();

       // System.out.println(myLinkedList.getSize());

    }
}
