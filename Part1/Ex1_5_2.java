import java.util.Scanner;

public class Ex1_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thập phân: ");
        int n = sc.nextInt();
        int temp = n;
        String hex = "";
        
        if (n == 0) {
            hex = "0";
        } else {
            while (n > 0) {
                int remainder = n % 16;
                char hexChar;
                
                if (remainder < 10) {
                    hexChar = (char)('0' + remainder);
                } else {
                    hexChar = (char)('A' + remainder - 10);
                }
                
                hex = hexChar + hex;
                System.out.println(n + " ÷ 16 = " + (n/16) + " ... " + remainder + " (" + hexChar + ")");
                n = n / 16;
            }
        }
        
        System.out.println(temp + " (thập phân) = " + hex + " (thập lục phân)");
    }
}
