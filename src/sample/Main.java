package sample;

public class Main  {



    public static void main(String[] args) {


        MyLinkedList myLinkedList = new MyLinkedList();

        Node<String> n1=new Node<>("Filop");
        Node<String> n2=new Node<>("Peter");
        Node<String> n3=new Node<>("Kristian");
        Node<String> n4=new Node<>("Laco");
        Node<String> n5=new Node<>("fico");
        Node<String> n6=new Node<>("Heureka");


        myLinkedList.addToEnd(n1);
        myLinkedList.addToEnd(n2);
        myLinkedList.addToEnd(n3);
        myLinkedList.addToEnd(n4);
        myLinkedList.addToEnd(n5);
        //myLinkedList.add(n6, 3);
        myLinkedList.print();
        System.out.println("====================");
        myLinkedList.remove(myLinkedList.findByName("filop"));
        myLinkedList.print();


        System.out.println("Next after=========== ");
        System.out.println(myLinkedList.findByName("Peter").getNext().getData());

       // System.out.println(myLinkedList.getSize());

    }
}
