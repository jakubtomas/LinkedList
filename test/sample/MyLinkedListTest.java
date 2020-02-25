package sample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addToFront() {
    }

    @Test
    void addToEnd() {
    }

    @Test
    void getSizeTest() {
        MyLinkedList myLinkedList = new MyLinkedList();
        assertEquals(0,myLinkedList.getSize(),"Has to be zero");

        Node<String> n1=new Node<>("Filop");
        Node<String> n2=new Node<>("Filop");
        Node<String> n3=new Node<>("Filop");
        Node<String> n4=new Node<>("Filop");

        myLinkedList.addToFront(n1);
        assertEquals(1,myLinkedList.getSize(),"Has to be 1");

        myLinkedList.addToFront(n2);
        assertEquals(2,myLinkedList.getSize(),"Has to be 2");
        myLinkedList.addToEnd(n3);
        assertEquals(3,myLinkedList.getSize(),"Has to be 3");
        myLinkedList.add(n4,1);
        assertEquals(4,myLinkedList.getSize(),"Has to be 4");

        myLinkedList.remove(n1);
        assertEquals(3,myLinkedList.getSize(),"Has to be 3");

        myLinkedList.removeAll();

        assertEquals(0,myLinkedList.getSize(),"Has to be 0");


    }

    @Test // The computer know that this is  test
    void addTest() {
        MyLinkedList myLinkedList = new MyLinkedList();


        Node<String> n1=new Node<>("Filop");
        Node<String> n0=new Node<>(null);
        Node<Integer> n2=new Node<>(1);
        Node<Integer> n3=new Node<>(1);
        Node<Integer> n4=new Node<>(1);
        Node<String> n5=new Node<>("Peter");
        Node<String> n6=new Node<>("dano");
        Node<Date> n7=new Node<>(new Date());
        Node<Object> n8=new Node<>(new Object());

        assertEquals(0,myLinkedList.getSize(),"Has to be 0");

        myLinkedList.addToFront(n1);
        assertEquals(1,myLinkedList.getSize(),"Has to be 1");

        assertNotNull(myLinkedList.findByName("Filop"));
        assertNull(myLinkedList.findByName("Peter"));

        myLinkedList.addToFront(null);
        assertEquals(1,myLinkedList.getSize(),"Has to be 1");


        myLinkedList.addToFront(n5);
        assertEquals(n5, myLinkedList.getHead());


        Node tmp = myLinkedList.getHead();

        while (tmp.getData() != null) { //
            tmp = tmp.getNext(); // add to tmp the last Node

        }
        assertNotEquals(n4, tmp);// na poslednej pozici by to namelo byt
        //assertEquals(n7,tmp );

        myLinkedList.removeAll();
       // assertnu



        // na zaciatku list

        // check the position the object the name

        myLinkedList.add(n5, 3);
        assertEquals(n5,myLinkedList.getHead().getNext().getNext());





    }

    @Test
    void print() {
    }

    @Test
    void remove() {
        MyLinkedList myLinkedList = new MyLinkedList();


        Node<String> n1=new Node<>("Filop");
        Node<String> n0=new Node<>(null);
        Node<Integer> n2=new Node<>(1);

        myLinkedList.add(n1,2);
        assertEquals(n1,myLinkedList.getHead());
        myLinkedList.remove(n1);


        myLinkedList.add(n2,4);
        myLinkedList.remove(n2);
        assertEquals(0,myLinkedList.getSize());
        assertNull(myLinkedList.getHead());



    }

    @Test
    void removeAll() {

        MyLinkedList myLinkedList = new MyLinkedList();
        Node<String> n1=new Node<>("Filop");
        Node<String> n2=new Node<>("Filop");
        Node<String> n3=new Node<>("Filop");
        Node<String> n4=new Node<>("Filop");
        Node<String> n5=new Node<>("Filop");
        Node<String> n6=new Node<>("Filop");

        myLinkedList.addToFront(n1);
        myLinkedList.addToFront(n2);
        myLinkedList.addToFront(n3);
        myLinkedList.addToFront(n4);

        myLinkedList.removeAll();
        myLinkedList.removeAll();


        assertNull(myLinkedList.getHead());

        assertEquals(0, myLinkedList.getSize());

        myLinkedList.add(n4,455500555);
        assertEquals(n4,myLinkedList.getHead());


    }

    @Test
    void findByName() {
    }
}