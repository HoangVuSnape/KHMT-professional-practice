import java.util.*;

public class Ex1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n - ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minarr = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < minarr) {
                minarr = arr[i];
            }
        }
        System.out.println("Min = " + minarr);


        int maxarr = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (maxarr < arr[i]) maxarr = arr[i];
        }
        System.out.print("Max = " + maxarr);
    }
}