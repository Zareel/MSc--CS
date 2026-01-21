import java.util.ArrayList;

public class MergeTwoSortedArrays{
public static void main(String[] args) {
    int[] arr = {2,5,4,8,11,13,10,15,21};
    mergeArr(arr);

}
public static int[] mergeArr(int[] A){
    int n = A.length;
    ArrayList<Integer> even = new ArrayList<>();
    ArrayList<Integer> odd = new ArrayList<>();
    for(int i = 0; i < n; i++){
        if(A[i] % 2 == 0){
            even.add(A[i]);
        }else{
            odd.add(A[i]);
        }
    }
    int i = 0, j = 0, index = 0;
    while(i < even.size() && j < odd.size()){
        int ele1 = even.get(i), ele2 = odd.get(i);
        if(ele1 < ele2){
            A[index] = ele1;
            i++;
        }else{
            A[index] = ele2;
            j++;
        }
    }
    while (i<even.size()) {
        A[index] = even.get(i);
        i++;
        index++;
    }
    while(j < odd.size()){
        A[index] = odd.get(i);
        i++;
        j++;
    }
    return A;

}


}

/*
given an integer array where all the odd elements are sorted and all the even elements are sorted
*/