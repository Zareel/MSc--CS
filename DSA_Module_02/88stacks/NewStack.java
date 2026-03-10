import javax.sound.midi.SysexMessage;

class Stack{
    int[] stack;
    int top;
    int size;

    Stack(int size){
        size = this.size;
        stack = new int[size];
        top = -1;
    }

    // size
    int size(){
        return stack.length;
    }

    // push
    void push(int x){
        if(top >= size-1){
            System.out.print("Stack overflow");
            return;
        }
        stack[++top] = x;

    }

    // pop
    int pop(){
        if(size <= 0){
            System.out.println("System underflow");
            return -1;
        }
        return stack[top--];
    }

    int peek(){
        if(size <= 0){
            return -1;
        }
        return stack[top];
    }

    
}
public class NewStack {
    public static void main(String[] args) {
        
    }
    
}
