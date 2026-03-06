package searching;
import java.util.*;
public class LinearSearch {
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
        int k;
        System.out.println("enter the element to be searched");
        k = sc.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (k == arr[i]) {
                index=i;
                break;
            }
        }
        if (index!= -1) {
            System.out.println("element found at index" + index);
        } else {
            System.out.println("element not found");
        }
    }
}