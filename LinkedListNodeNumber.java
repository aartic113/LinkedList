package com.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LinkedListNodeNumber {

    public static SinglyLinkedListNode mergeLists(SinglyLinkedListNode...nodes){

        ArrayList<SinglyLinkedListNode> values = new ArrayList<>();

        values = add(values,nodes);

        Collections.sort(values, new Comparator<SinglyLinkedListNode>() {
            @Override
            public int compare(SinglyLinkedListNode o1, SinglyLinkedListNode o2) {
                return (Integer.compare(o1.data,o2.data));
            }
        });

//        for (SinglyLinkedListNode nde: values){
//            System.out.print(nde.data + " ");
//        }

        SinglyLinkedListNode node = assign(values);

        return node;


    }

    //    Method to add nodes to ArrayList
    public static ArrayList<SinglyLinkedListNode> add(ArrayList<SinglyLinkedListNode> nodesList, SinglyLinkedListNode...nodes)
    {
        for (SinglyLinkedListNode n: nodes) {
            while (n != null) {
                nodesList.add(n);
                n = n.next;
            }
        }
        return nodesList;
    }

    //    Method to assign nodes to LinkedList
    public static SinglyLinkedListNode assign(ArrayList<SinglyLinkedListNode> sortList)
    {
        SinglyLinkedListNode head = null;
        SinglyLinkedListNode current = head;

        for (SinglyLinkedListNode node : sortList)
        {
            if (head == null)
            {
                head = new SinglyLinkedListNode(node.data);
                current = head;
            } else {
                current.next = new SinglyLinkedListNode(node.data);
                current = current.next;
            }
        }

        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        return head;
    }

}
