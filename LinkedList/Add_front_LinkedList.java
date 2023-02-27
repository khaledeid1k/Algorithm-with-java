package LinkedList;

public class Add_front_LinkedList {
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
        public static Add_front_LinkedList insert_at_beginning(Add_front_LinkedList list, int data) {


            // Create a new node with given data
            Node new_node = new Node(data);

            new_node.next=list.head;
            list.head=new_node;


            // Return the list by head
            return list;
        }

        // Method to print the LinkedList.
        public static void printList(Add_front_LinkedList list) {
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
            Add_front_LinkedList list = new Add_front_LinkedList();

            //
            // ******INSERTION******
            //

            // Insert the values
            list = insert_at_beginning(list, 1);
            list = insert_at_beginning(list, 2);
            list = insert_at_beginning(list, 3);
            list = insert_at_beginning(list, 4);
            list = insert_at_beginning(list, 5);
            list = insert_at_beginning(list, 6);
            list = insert_at_beginning(list, 7);
            list = insert_at_beginning(list, 8);

            // Print the LinkedList
            printList(list);
        }
    }


