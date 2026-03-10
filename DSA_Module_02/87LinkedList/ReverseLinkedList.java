class Node{
    int val;
    Node next;
    Node(int x){
        val = x;
        next = null;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
           // create a linked list
        Node head = new Node(10);
        Node two = new Node(20);
        Node three = new Node(30);
        Node four = new Node(40);
        Node five = new Node(50);
        Node six = new Node(60);

        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        printList(reverseList(head));
    }

    public static Node reverseList(Node A){
        Node curr = A;
        Node prev = null;

        while(curr != null){
            Node forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
            
        }
        return prev;
    }

        public static void printList(Node A){
        Node curr = A;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    
}
