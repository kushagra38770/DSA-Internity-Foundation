public class quickSort {
    public static void main(String[] args){
        int[] arr = {5, 3, 8, 1, 10, 9, 7};//unsorted array
        sort(arr, 0, arr.length-1);
            System.out.println("Sorted array is:");
            for(int a:arr) {
            System.out.print(a+" ");
        }
    }

    public static void sort(int[] arr, int low, int high){
        if(low<high) {
            int part = partition(arr, low, high);
            sort(arr, low, part-1);
            sort(arr, part+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
/*
OUTPUT:-
Sorted array is:
1 3 5 7 8 9 10
*/
