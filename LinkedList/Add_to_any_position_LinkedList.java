package LinkedList;

public class Add_to_any_position_LinkedList {

    static class Node {

        int data;
        Node next;
        int position;

        // Constructor
        Node(int d,int p)
        {
            position=p;
            data = d;
            next = null;
        }
    }
    static Node head; // head of list


    // if insert number in same position it will add after it
    public  void insert_at_any_position( int data,int position) {
        // Create a new node with given data
        Node new_node = new Node(data, position);


        // If the Linked List is empty,
        // then make the new node as head
        if (position == 1) {
            new_node.next=head;
            head = new_node;
        }
        else {

            int i = 1;
            Node after = head;
            while (i < position) {
                after =after.next ;
                i++;
            }
            new_node.next = after;

            Node before = head;
            int j = 1;
            while (j + 1 < position) {
                before = before.next;
                j++;
            }
            before.next = new_node;

            // Return the list by head
        }

    }
    public  void delete_element( int position){

        if (position == 1) {
            head = head.next;
        }
        else {

            int i = 0;
            Node after = head;
            while (i < position) {
                after =after.next ;
                i++;
            }

            Node before = head;
            int j =2;
            while (j < position) {
                before = before.next;
                j++;
            }
           before.next = after;

            // Return the list by head
        }
    }
    public static void printList(Add_to_any_position_LinkedList list)
    {
       Node currNode = head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }
    public static void main(String[] args) {
        Add_to_any_position_LinkedList list = new Add_to_any_position_LinkedList();
        list.    insert_at_any_position(5, 1);
        list.    insert_at_any_position(7, 2);
        list.    insert_at_any_position(8, 3);
        list.    insert_at_any_position(10, 4);
        list.    insert_at_any_position(22, 5);
        list. delete_element(1);
        list.delete_element(3);
        list.delete_element(1);
        list.delete_element(2);

        printList(list);
    }
}
