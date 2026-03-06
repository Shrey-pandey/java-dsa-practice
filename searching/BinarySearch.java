package searching;

import java.util.Scanner;

public class BinarySearch {
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
        int flag = 0;
        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            if (k == arr[mid]) {
                flag = 1;
                System.out.println("entered element is found at" + mid);
                break;
            } else if (k < arr[mid]) {
                end = mid - 1;
            }
            else{
                beg = mid + 1;
            }
        }
        if (flag == 0) {
            System.out.println("element not found");
        }
    }
}
