public class mergeSort {
    public static void main(String[] args){
        int[] arr = {5, 3, 8, 1, 10, 9, 7};//unsorted array
        sort(arr, 0 , arr.length-1, arr.length);
        System.out.println("Sorted array is:");
        for(int a:arr) {
            System.out.print(a+" ");
        }
    }
    public static void sort(int[] arr, int s, int e, int n){
        if(s>=e){
            return;
        }
        int mid = s+(e-s)/2;
        sort(arr, s, mid, n);
        sort(arr, mid+1, e, n);
        merge(arr, s, e, n);
    }

    public static void merge(int[] arr, int s, int e, int n){
        int mid = s+(e-s)/2;
        int i=s;
        int j= mid+1;
        int k = 0;
        int[] temp = new int[n];
        while(i<=mid && j<=e){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while (j <= e) {
                temp[k++] = arr[j];
                j++;
            }
        while (i <= mid) {
                temp[k++] = arr[i];
                i++;
            }
        k=0;
        for(int p=s; p<=e; p++){
            arr[p] = temp[k];
            k++;
        }
    }
}
/*
OUTPUT:-
Sorted array is:
1 3 5 7 8 9 10
*/
