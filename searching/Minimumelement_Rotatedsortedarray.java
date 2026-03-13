package searching;

import java.util.Scanner;

public class Minimumelement_Rotatedsortedarray {
    static int minimum(int arr[], int beg, int end){
        if(beg>end){
            return beg;
        }
        int mid= beg+(end-beg)/2;
        if(arr[mid]>end){
            return minimum(arr,  mid+1, end);
        }
        else
            return minimum(arr, beg, mid-1);

    }
    public static void main(String[] args) {
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
        int ans = minimum(arr,beg,end);
        System.out.println("the minimum element of the rotated sorted array is "+arr[ans]);
    }
}

