package com.linkedlist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//      TEST METHOD
//      Below I've created three groups of nodes which I will assign to three separate Linked-Lists

        SinglyLinkedListNode groupOneValueOne = new SinglyLinkedListNode(9);
        SinglyLinkedListNode groupOneValueTwo = new SinglyLinkedListNode(7);
        SinglyLinkedListNode groupOneValueThree = new SinglyLinkedListNode(12);

        SinglyLinkedListNode groupTwoValueOne = new SinglyLinkedListNode(4);
        SinglyLinkedListNode groupTwoValueTwo = new SinglyLinkedListNode(3);

        SinglyLinkedListNode groupThreeValueOne = new SinglyLinkedListNode(4);
        SinglyLinkedListNode groupThreeValueTwo = new SinglyLinkedListNode(5);
        SinglyLinkedListNode groupThreeValueThree = new SinglyLinkedListNode(1);


//      Here I've created three separate Linked-Lists
        SinglyLinkedListNode head = groupOneValueOne;
        head.next = groupOneValueTwo;
        SinglyLinkedListNode current = head.next;
        current.next = groupOneValueThree;

        SinglyLinkedListNode head1 = groupTwoValueOne;
        head1.next = groupTwoValueTwo;

        SinglyLinkedListNode head2 = groupThreeValueOne;
        head2.next = groupThreeValueTwo;
        SinglyLinkedListNode current1 = head2.next;
        current1.next = groupThreeValueThree;


//      Here I'm executing all the three methods
//      First method is for merging two LinkedLists
        LinkedListNode.mergeLists(head,head1);
        System.out.println();
//      Second method is for merging three LinkedLists
        LinkedListNodeThree.mergeLists(head,head1,head2);
        System.out.println();
//      Third method is for merging any number of LinkedLists
        LinkedListNodeNumber.mergeLists(head,head2);
        System.out.println();
        LinkedListNodeNumber.mergeLists(head,head1,head2);
        System.out.println();
        LinkedListNodeNumber.mergeLists(head1);




    }
}
