import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args){
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};//unsorted array
        radixSort(arr,arr.length);
        System.out.println("Sorted array is:");
        for(int a:arr) {
            System.out.print(a+" ");
        }
    }

    public static void radixSort(int[] arr, int n){
        int max=arr[0];
        for(int a:arr){
            if(a>max){
                max=a;
            }
        }
        for(int pos=1; max/pos>0; pos *= 10){
            countSort(arr, pos, n);
        }
    }

    public static void countSort(int[] arr, int pos, int n){
        int[] b = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
        for(i=0; i<n; i++){
            count[(arr[i]/pos)%10]++;
        }
        for(i=1; i<10; i++){
            count[i] = count[i] + count[i-1];
        }
        for(i=n-1 ; i>=0; i--){
            b[count[(arr[i]/pos)%10]-1] = arr[i];
            count[(arr[i]/pos)%10]--;
        }
        for(i=0; i<n; i++){
            arr[i] = b[i];
        }
    }
}
