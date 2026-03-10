class Stack{
    char[] arr;
    int top;
    Stack(int size){
        arr = new char[size];
        top = -1;
    }
    // push
    void push(char ch){
        if(top == arr.length-1){
            System.out.println("Stack overflow");
            return;
        }
        top++;
        arr[top] = ch;

    }

    // pop
    char pop(){
        if(top == -1){
            return '\0';
        }
        return arr[top--];

    }

    char peek(){
        if(top == -1){
            return '\0';
        }
        return arr[top];
    }

    int size(){
        return top+1;
        }
}
public class BalancedParanthesis {
    public static void main(String[] args) {
        String str = "{([]))}";
        if(checkParanthesis(str)){
            System.out.println("Balanced");
        }else{
            System.out.println("Unbalanced");
        }
        
        
    }
    public static boolean checkParanthesis(String str){
        int n = str.length();
        Stack st = new Stack(n);
    
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if (ch == '(' || ch == '{' || ch == '[') {
            st.push(ch);
        } 
        else if (ch == ')' || ch == '}' || ch == ']') {
            if (st.size() == 0) return false;

            char top = st.peek();

            if ((ch == ')' && top == '(') ||
                (ch == '}' && top == '{') ||
                (ch == ']' && top == '[')) {
                st.pop();
            } else {
                return false;
            }
        }
    }
return st.size() == 0;


    }
}
