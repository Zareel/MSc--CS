class ListNode {
int val;
ListNode next;
ListNode (int x)
{
    val = x;
    next = null;
}    
}

public class PrintLinkedList {
  
    public static void printList(ListNode A){
        ListNode temp = A;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
}

// you are given a, which is the head of linkedList. print the linked list in the space seperated manner
// Note : The last node value must also be succeeded by a space and after printing the entire list you should print a new line
