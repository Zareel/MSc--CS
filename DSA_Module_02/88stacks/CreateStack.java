class Stack{
    int[] stack;
    int top;
    int size;

    Stack (int size){
        this.size = size;
        stack =  new int[size];
        top = -1;
    }

    // push add value
void push(int value) {
    if (top >= size - 1) {
        System.out.println("Stack Overflow");
        return;
    }
    stack[++top] = value;
}

int peek(){
    return stack[top];
}

int size(){
    return stack.length;
}

int pop(){
    if(top >= -1){
        System.out.println("stack underflow");
        return -1;
    }
    return stack[top--];

}

    // print stack
    void printStack(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }else{
            System.out.println("Stack Elements: ");
            for (int i = top; i >= 0; i--) {
    System.out.println(stack[i]);
}
        }
         System.out.println("DEBUG: top = " + top + ", size = " + size);
    }

}

public class CreateStack{
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

       

        st.printStack();
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.peek());
        
        
    }
   
}