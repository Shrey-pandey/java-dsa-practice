package searching;

import java.util.Scanner;

public class Rotated_sorted_array_search {
    public static int rotatedsearch(int arr[],int k,int beg,int end){
        if(beg>end){
            return -1;
        }
        int mid = beg+(end-beg)/2;
        if(arr[mid]==k){
            return mid;
        }
        if(beg<=arr[mid]){
            if(k>=arr[beg]&&k<=arr[mid]){
                return rotatedsearch(arr,k,beg,mid-1);
            }
            else{
                return rotatedsearch(arr,k,mid+1,end);
            }
        }
        if(k>arr[mid]&&k<=arr[end]){
            return rotatedsearch(arr,k,mid+1,end);
        }
        else{
            return rotatedsearch(arr,k,beg,mid-1);
        }
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
        System.out.println("enter the element to be searched");
        k = sc.nextInt();
        int ans = rotatedsearch(arr,k,beg,end);
        System.out.println("the result of the rotated sorted array search is"+ans);
    }
}
