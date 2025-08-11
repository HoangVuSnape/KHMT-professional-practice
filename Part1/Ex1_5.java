import java.util.Scanner;

public class Ex1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int n = sc.nextInt();
        int num = n;
        int i = 0;
        String binary = "";
        if (n == 0) {
            binary = "0";
        } else {
            while (n > 0) {
                binary = (n % 2) + binary;
                n = n / 2;
                System.out.println("s" + i + " "+ (n % 2) + " n = " + n + " binar = " + binary);
                i++;
            }
        }
        System.out.println("Dạng nhị phân: " + binary);
    }
}
