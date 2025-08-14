import java.util.*;
public class Ex1_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập so nguyen: ");
        int n = sc.nextInt();

        boolean isPrime = checkPrime(n);

        if(isPrime) System.out.println(n + " là sô nguyen");
        else System.out.println(n + " không là sô nguyen");
    }
    public static boolean checkPrime(int n) {
        if (n <=1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        for (int i = 3; i * i <= n; i+=2){
            if(n % i == 0) return false;
        }
        return true;
    }
}
