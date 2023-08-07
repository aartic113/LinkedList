package com.linkedlist;

import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LinkedListNode {

//    Method to merge two Linked-Lists into one sorted Linked-List
    public static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2){
//    Add all nodes from both Linked-Lists into one ArrayList
        ArrayList<SinglyLinkedListNode> sortList = new ArrayList<>();

//    Method to add all nodes from Linked-List into arraylist
        sortList = add(sortList,head1,head2);

//   Re-writing the sort function to sort the Array-List
        Collections.sort(sortList, new Comparator<SinglyLinkedListNode>() {
            @Override
            public int compare(SinglyLinkedListNode o1, SinglyLinkedListNode o2) {
                return Integer.compare(o1.data,o2.data);
            }
        });

//   Assigning the sorted Array-List into an Linked-List to return
        SinglyLinkedListNode head = assign(sortList);

        return head;
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
