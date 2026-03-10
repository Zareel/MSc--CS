class Node{
    int val;
    Node next;
    Node(int x){
        val = x;
        next = null;
    }
}

public class InsertInLinkList {
    public static void main(String[] args) {
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

        printList(inserInList(head, 3, 100));

        

    }

    public static Node inserInList(Node A, int position, int newNode){
        Node nn = new Node(newNode);
        Node temp = A;
        int i = 1;
        while(i < position ){
            temp = temp.next;
            i++;
        }
        nn.next = temp.next;
        temp.next = nn;

        return A;

    }
    public static void printList(Node A){
        Node curr = A;
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    
}
