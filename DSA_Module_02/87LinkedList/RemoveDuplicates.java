class Node{
    int val;
    Node next;
    Node(int x){
        val = x;
        next = null;
    }
}

public class RemoveDuplicates{
    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(20);
        Node fourth = new Node(40);
        Node fifth = new Node(40);
        Node sixt = new Node(60);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixt;
        printLit(cleanUp(head));
        
    }

    public static Node cleanUp(Node A){
        Node curr = A;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }

        }
        return A;
    }

    public static void printLit(Node A){
        Node curr = A;
        
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr =  curr.next;
        }
        System.out.println();
    }
}


/*
Remove duplicates from Linked list
Given a sorted linked list, delete all the duplicates such that each elements appears only once
*/