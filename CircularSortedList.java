class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularSortedList {

    // Function to insert into a sorted circular linked list
    public static Node insertSortedList(Node start, int n) {
        Node newNode = new Node(n);

        // Case 1: Empty list
        if (start == null) {
            newNode.next = newNode; // Points to itself
            return newNode;
        }

        Node current = start;

        // Case 2: Insertion before the head (smallest value)
        if (n <= start.data) {
            // Find last node to maintain circular property
            while (current.next != start) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = start;
            return newNode; // New node becomes the new start
        }

        // Case 3: Insertion in the middle or end
        while (current.next != start && current.next.data < n) {
            current = current.next;
        }

        // Insert new node after 'current'
        newNode.next = current.next;
        current.next = newNode;

        return start; // Head remains unchanged
    }

    // Helper method to print the circular list
    public static void printCircularList(Node start) {
        if (start == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = start;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != start);
        System.out.println("(back to " + start.data + ")");
    }

    public static void main(String[] args) {
        Node start = null;

        // Example usage
        int[] values = {10, 20, 30};
        for (int val : values) {
            start = insertSortedList(start, val);
        }

        System.out.println("Original list:");
        printCircularList(start);

        start = insertSortedList(start, 25);
        System.out.println("After inserting 25:");
        printCircularList(start);

        start = insertSortedList(start, 5);
        System.out.println("After inserting 5:");
        printCircularList(start);

        start = insertSortedList(start, 35);
        System.out.println("After inserting 35:");
        printCircularList(start);
    }
}
