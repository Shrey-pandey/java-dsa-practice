package arrays;

import java.util.Scanner;

public class maximumElement {
    static int maximum(int arr[],int n){
        int max=arr[0];
        for (int i = 0; i <n ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }return max;
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
        int ans = maximum(arr, n);
        System.out.println("the maximum element is " + ans);
}
}
