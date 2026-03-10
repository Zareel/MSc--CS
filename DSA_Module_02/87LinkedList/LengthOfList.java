class Node{
    int val;
    Node next;
    Node(int x){
        val = x;
        next = null;
    }
}
public class LengthOfList {
    public static void main(String[] args) {
        // create LinkedList
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
        System.out.println(lenOfList(head));    
        
    }

    public static int lenOfList(Node A){
        Node curr = A;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }


    
}
