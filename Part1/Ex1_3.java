import java.util.*;
public class Ex1_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int arr_nd[] = new int[n];
        for(int i = 0; i <n; i++) {
            arr_nd[i] = arr[n-1-i];
            
        }
        for(int i = 0; i <n; i++) {
            System.out.print(arr_nd[i] + " ");
            
        }
    }
}
