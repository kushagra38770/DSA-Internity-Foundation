//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algorithm.

import java.util.*;
import java.lang.*;
import java.io.*;
 

public class main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] a = {0, 2, 1, 2, 0};
		int c1=0, c2=0, c3=0;
		int n = a.length;
    for(int i=0;i<n;i++){
        if(a[i]==0){
            c1++;
            continue;
        }
        if(a[i]==1){
            c2++;
            continue;
        }
        if(a[i]==2){
            c3++;
            continue;
        }
    }
    for(int j=0;j<c1;j++){
        a[j]=0;
    }
    for(int k=c1;k<c1+c2;k++){
        a[k]=1;
    }
    for(int l=c1+c2;l<c1+c2+c3;l++){
        a[l]=2;
    }
    for(int x=0;x<n;x++){
        System.out.print(a[x]+" ");
    }
	}
}
