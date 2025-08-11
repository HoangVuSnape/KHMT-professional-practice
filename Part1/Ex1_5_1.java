import java.util.Scanner;

public class Ex1_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();
        int temp = n;
        int exp = 0;
        String result = "";

        // Tìm số chữ số của n
        int digits = (n == 0) ? 1 : (int)Math.log10(n) + 1;
        System.out.println("digit " + digits);
        // Duyệt từng chữ số từ trái sang phải
        for (int i = digits - 1; i >= 0; i--) {
            int divisor = (int)Math.pow(10, i);
            int digit = temp / divisor;
            result += digit + " * 10^" + i;
            if (i != 0) result += " + ";
            temp = temp % divisor;
        }

        System.out.println(n + " = " + result);
    }
}
