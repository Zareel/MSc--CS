class Stack{
    int[] A;
    int ptr;
    Stack(int s2){
        A = new int[s2];
        ptr = -1;
    }
    int size(int[] A){
        return A.length;
    }

    void push(int[] A, int x){
        if(ptr == A.length-1){
            System.out.print("Stack overflow");
        }
        ptr++;
        A[ptr] = x;
    }

    int pop(int[] A){
        if(ptr == -1){
            System.out.print("Stack underflow"); 
        }
        int val = A[ptr];
        ptr = ptr-1;
        return val;
    }

    int peek(int[] A){
        if(ptr == -1){
            System.out.print("Stack empty");
        }
        return A[ptr];
    }
}

public class CustomStack {
    public static void main(String[] args) {
        
    }
}
