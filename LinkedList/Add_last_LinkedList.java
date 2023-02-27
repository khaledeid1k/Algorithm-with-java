package LinkedList;

// Java program to implement
// a Singly Linked List
public class Add_last_LinkedList {

    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it


    // Method to insert a new node
    public static Add_last_LinkedList insert_at_last(Add_last_LinkedList list, int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);


        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(Add_last_LinkedList list)
    {
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
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        Add_last_LinkedList list = new Add_last_LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert_at_last(list, 1);
        list = insert_at_last(list, 2);
        list = insert_at_last(list, 3);
        list = insert_at_last(list, 4);
        list = insert_at_last(list, 5);
        list = insert_at_last(list, 6);
        list = insert_at_last(list, 7);
        list = insert_at_last(list, 8);

        // Print the LinkedList
        printList(list);
    }
}
