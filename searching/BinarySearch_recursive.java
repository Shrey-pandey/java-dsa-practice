package searching;

import java.util.Scanner;

public class BinarySearch_recursive {
    public static int binarysearch(int arr[], int k, int beg, int end){
        if( beg>end){
            return -1;
        }
        int mid=beg+(end-beg)/2;
        if(k==arr[mid]){
            System.out.println("element found at index "+mid);
        }
        if(k<mid){
            return binarysearch(arr,k,beg,mid-1 );
        }
        return binarysearch(arr,k,mid+1,end);
    }
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements in the array");
        for (int i = 0; i < n; i++) {
            System.out.println("enter the element at the index" + i);
            arr[i] = sc.nextInt();
        }
        int beg = 0, end = arr.length - 1;
        int k;
        System.out.println("enter the element to be searched");
        k = sc.nextInt();
        int ans = binarysearch(arr,k,beg,end);
    }
}
