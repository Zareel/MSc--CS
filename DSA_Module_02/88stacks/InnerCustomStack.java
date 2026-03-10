class CustomStack {
    int[] A;
    int ptr;
    int size;
    CustomStack(int s2){
        A = new int[s2];
        ptr = -1;  
    } 
    
    // size()
    int size(int[] A){
        return A.length;
    }

    void push(int[] A, int x){
        if(ptr == A.length-1){
            System.out.println("stack overflow");
        }
        ptr++;
        A[ptr] = x;
    }
}
public class InnerCustomStack {

    public static void main(String[] args) {
     
        
    }
}
