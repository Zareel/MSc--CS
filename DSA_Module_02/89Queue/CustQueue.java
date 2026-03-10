class Queue{
    int[] arr;
    // f => front where elements need to remove
    int f = -1;
    // r => rear where elements need to enter
    int r = -1;
    int sz = 0;
    Queue(int N){
        arr = new int[N];
    }
    void add(int x){
        if(sz == arr.length){
            r = (r + 1) % arr.length;
            arr[r] = x;
            sz++;
        }
    }
    int size(){
        return sz;
    }

    int remove(){
        if(sz == 0) return -1;
        f = (f+1)% arr.length;
        int val = arr[f];
        sz--;

        return val;

    }

    int peek(){
        if(sz == 0) return -1;
        int idx = (f + 1) % arr.length;
        return idx;
    }
}

public class custQueue{
    public static void main(String[] args){
        
    }
}