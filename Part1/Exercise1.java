
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n = ");
        int n = sc.nextInt();
        System.out.print("Input array elements: ");
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        boolean unique;

        for (int i = 0; i < arr.length; i++) {
            unique = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                count++;
            }
        }  

        System.out.println("result: " + count);
    }
}