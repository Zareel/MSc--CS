class Node{
      int val;
    Node next;
    Node(int x){
         val = x;
        next = null;
    }
}

public class LinkedList{
   public static void main(String[] args) {
    Node head = new Node(30);
    System.out.println(head.val);
    System.out.println(head.next);

    Node second = new Node(40);
    Node third = new Node(50);
    Node fourth = new Node(60);
    Node fifth = new Node(70);
    Node sixth = new Node(80);

    head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;

    printLinkedList(head);

        
    }

    public static void printLinkedList(Node A){
        Node curr = A;
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();


    }
}