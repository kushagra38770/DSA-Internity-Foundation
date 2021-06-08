//find kth(index) smallest element in array(we can find answer after
// sorting array i.e. we will output kth index element from sorted array)


import java.util.*;

public class KthSmallestElement {
    public static void main(String[] args){
        int[] arr = {1, 3, 2, 5, 7};
        int[] ar;
        int k=3;
        Arrays.sort(arr);
        System.out.print(arr[k]);
    }
}
    
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        quickSort(arr, 0, n - 1);
        System.out.println(arr[k]);
    }

    // Below is Complete implementation of quick sort algorithm
    public static void quickSort(int[] arr, int lb, int ub) {
        //lb ="lower bound or index"; ub="upper bound or index"
        //int loc=0;//location index for pivot element after partition
        if (lb < ub) {
            int loc = partition(arr, lb, ub);
            quickSort(arr, lb, loc - 1);
            quickSort(arr, loc + 1, ub);
        }
    }

    public static int partition(int[] arr, int lb, int ub) {
        int start = lb;
        int end = ub;
        int pivot = arr[lb];
        while (start < end) {
//            while (arr[start] <= pivot) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                /*swapping of elements smaller than pivot to right of pivot
                and greater than pivot to left of pivot*/
//                swap(arr[start], arr[end]);
 /*               swap(arr, start, end);
            }
        }
//        swap(pivot, arr[end]);
        arr[end] = pivot;
        return end;
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}*/
