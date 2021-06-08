public class minMaxArray {
    public static class Pair{
        int max;
        int min;
    }
    public static Pair getMaxMin(int[] arr, int n){
        Pair minmax = new Pair();
        int i;
        if(n%2==0){
            if(arr[0]>arr[1]) {
                minmax.max = arr[0];
                minmax.min = arr[1];
            }
            else{
                minmax.max = arr[1];
                minmax.min = arr[0];
            }
            i=2;
        }
        else{
            minmax.max = arr[0];
            minmax.min = arr[0];
            i=1;
        }

        while(i<n-1){
            if(arr[i]>arr[i+1]){
                if(arr[i]>minmax.max){
                    minmax.max=arr[i];
                }
                if(minmax.min>arr[i+1]){
                    minmax.min=arr[i+1];
                }
            }
            else{
                if(arr[i+1]>minmax.max){
                    minmax.max=arr[i+1];
                }
                if(minmax.min>arr[i]){
                    minmax.min=arr[i];
                }
            }
            i+=2;
        }
        return minmax;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 7, 4, 9, 5};
        int size = 6;
        Pair result = getMaxMin(arr, size);
        System.out.println("Minimum : "+result.min);
        System.out.println("Maximum : "+result.max);
    }

}
