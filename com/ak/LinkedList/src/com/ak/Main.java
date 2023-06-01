package com.ak;

import com.ak.LinkedList.CircularLinkedList;
import com.ak.LinkedList.DoublyLinkedList;
import com.ak.LinkedList.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        SinglyLinkedList list=new SinglyLinkedList();
//        list.insertFirst(5);
//        list.insertFirst(4);
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(1);
//        //list.display();
//        list.insertAtPos(3,5);
//        list.display();
//        System.out.println(list.delFirst());
//        list.display();

//        DoublyLinkedList dl=new DoublyLinkedList();
//        dl.insertFirst(56);
//        dl.insertFirst(55);
//        dl.insertFirst(54);
//        dl.insertFirst(53);
//        dl.display();
//        dl.revDisplay();
//        dl.insertLast(54);
//        dl.display();
//        dl.insertAtPos(52,0);
//        dl.display();
//        dl.insertAtPos(2,4);
//        dl.display();
//        dl.insertAtPos(-1,99);

        CircularLinkedList cl=new CircularLinkedList();

        cl.addLast(2);
        cl.addLast(3);
        cl.addLast(4);
        cl.addFirst(1);
        cl.addFirst(0);
        cl.display();
        cl.delete(3);
        cl.display();




    }
}
