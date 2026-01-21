class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    } 
}

public class KthNode {
    public static void main(String[] args) {
        // create linked list
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);

        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        // print listnode
        printList(head);

        // kth val
        System.out.println(findKthVal(head, 3));

        
    }

    public static int findKthVal(ListNode A, int B){
        ListNode curr = A;
        int index = 0;
        while (curr != null) {
            if(index == B){
                return curr.val;
            }
            curr = curr.next;
            index++;
        } 

        return -1;
    }


    public static void printList(ListNode A){
        ListNode curr = A;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
            
        }
        System.out.println();
    }
}

/*
* you are given a singly linked list and an integer k, your task is to access the node at the kth index in the list and return its value. if the index is out of bounds return -1
*/