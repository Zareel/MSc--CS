class Node{
    int val;
    Node next;
    Node(int x){
        val = x;
        next = null;
    }
}

public class SearchInLinkedList {
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
;        four.next = five;
        five.next = six;

        printList(head);
        System.out.println(isPresent(head, 40));
        
    }

    public static boolean isPresent(Node A, int x){
        Node temp = A;
        while (temp != null) {
            if(temp.val == x){
                return true;
                
            }
            temp = temp.next;
           
            
        }
         return false;
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

/*
find if k is present in the list
*/
