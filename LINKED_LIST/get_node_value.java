import java.util.Scanner;

class LL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add to front of the list
    public static Node addFront(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    // Get node value from the position counted from the tail
    public static int getNodeFromTail(Node head, int posFromTail) {
        Node fast = head;
        Node slow = head;

        for (int i = 0; i < posFromTail; i++) {
            if (fast != null) {
                fast = fast.next;
            }
        }

        // Move both fast and slow till fast reaches the last node
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow.data;
    }
}

public class get_node_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for (int t = 0; t < testCases; t++) {
            int n = sc.nextInt(); // number of elements
            LL.Node head = null;

            // Read the elements and insert at end to preserve order
            LL.Node tail = null;
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                LL.Node newNode = new LL.Node(val);
                if (head == null) {
                    head = tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }

            int posFromTail = sc.nextInt(); // position from tail
            int result = LL.getNodeFromTail(head, posFromTail);
            System.out.println(result);
        }

        sc.close();
    }
}
