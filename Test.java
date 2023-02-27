
import java.io.*;

// Java program to implement
// a Singly Linked List

public class Test {


public static class LinkedListt {

    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it


    // Method to insert a new node
    public static LinkedListt insert(LinkedListt list, int data) {


        // Create a new node with given data
        Node new_node = new Node(data);

        new_node.next=list.head;
        list.head=new_node;


        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedListt list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    // Driver code
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedListt list = new LinkedListt();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        // Print the LinkedList
        printList(list);
    }
}


}