import java.util.*;

public class Ex1 {

    public static int sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i; 
        }
        return sum;
    }

    public static int sumRecurisive(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumRecurisive(n-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n = ");
        int n = sc.nextInt();

        int result = sum(n);
        System.out.println("Result = " + result );

        int result_re = sumRecurisive(n);
        System.out.println("Result recursice = " + result_re );

    }   
}