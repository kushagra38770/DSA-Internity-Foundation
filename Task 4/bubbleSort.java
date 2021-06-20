public class bubbleSort {
    public static void main(String[] args){
        int[] arr = {5, 3, 8, 1, 10, 9, 7};//unsorted array
        sort(arr);
        System.out.println("Sorted array is:");
        for(int a:arr) {
            System.out.print(a+" ");
        }
    }
    public static void sort(int[] arr){
        int n = arr.length; //n is length of array
        for(int i=0; i<n-1; i++){
            boolean flag = false;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    //swapping of both elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
        }
    }
}
/*
OUTPUT:-
Sorted array is:
1 3 5 7 8 9 10
*/
