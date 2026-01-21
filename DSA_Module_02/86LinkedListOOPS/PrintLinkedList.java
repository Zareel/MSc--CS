class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }

    
}


public class PrintLinkedList {
    public static void main(String[] args) {
        // create node
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);

        // connect nodes
        head.next = second;
        second.next = third;

        // print linked list
        printList(head);
        
        
    }
    public static void printList(ListNode A){
        ListNode curr = A;
        while (curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }   
    
}

/*
* you are given A which is the head of the linkedList, print the linked list in space seperated manner
* note the last node value must also be succeeded by a space and after printing the entire list,  you shold print a new line
*/