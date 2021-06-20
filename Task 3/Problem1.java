// Find given element in given array (might be unsorted)


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr = {3, 6, 2, 8, 7, 10};
        int ele = 7;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                System.out.println("Element is present");
                break;
            }
            if(i==arr.length-1){
                System.out.println("Element is not present");
            }
        }
	}
}
