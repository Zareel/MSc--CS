import java.util.ArrayList;

public class SmallestNum {
    public static void main(String[] args) {
        int[] A = {6,3,4,2,7,2,1};
        int n = A.length;
        mergeSort(A, 0, n-1);
       
    }
    public static void mergeSort(int[] A, int s, int e){
        

        if(s==e) return;

        int mid = (s + e)/2;
        mergeSort(A, s, mid);
        mergeSort(A, mid+1, e);

        mergeSortedParts(A, s, mid, e);

    }

    public static int[] mergeSortedParts(int[] A, int s, int mid, int e){
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        for(int i = s; i <= mid; i++){
            first.add(A[i]);
        }

         for(int i = mid+1; i <= e; i++){
            second.add(A[i]);
        }

        int i = 0; 
        int j = 0;
        int index = s;
        while(i < first.size() && j < second.size()){
            int ele1 = first.get(i), ele2 = second.get(i);
            if(ele1 < ele2){
                A[index] = ele1;
                i++;
                index++;
            }else{
                A[index] = ele2;
                j++;
                index++;
            }
        }
        while (i < first.size()) {
            A[index] = first.get(i);
            i++;
            index++;
        }
        while (j < second.size()) {
            A[index]= second.get(j);
            j++;
            index++;
            
        }
        return A;


    }
    
}

/*

find the smallest number that can be formed by rearranging the digits of the given number in the array return the smallest number in the form of an array

*/
