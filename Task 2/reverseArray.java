public class reverseArray {
    public static void main(String[] args){
        int[] arr={1, 2, 3, 4};
        int[] ar = new int[arr.length];
        int x=0;
        for(int i=(arr.length-1);i>=0;i--){
            ar[x] = arr[i];
            System.out.print(ar[x]+" ");
            x++;
        }
    }
}
//recursion method
/*
public class reverseArray {
public static void reverse(int arr[], int initialInd, int len)
    {
        int temp;
        if (initialInd >= len)
            return;
        temp = arr[initialInd];
        arr[initialInd] = arr[len];
        arr[len] = temp;
        reverse(arr, initialInd+1, len-1);
    }
    public static void main(String[] args){
        int[] arr={1, 2, 3, 4};
        reverse(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/
