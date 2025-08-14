import java.util.*;

public class Ex1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap string: ");

        String input = sc.nextLine();
        String[] words = input.trim().split("\\s+");
        if(words.length == 0) {
            System.out.println("Khong co tu nao trong chuoi.");
            return;
        }

        String longestFirst = words[0];
        String shortestLast = words[0];

        for(int i = 1; i < words.length; i++) {
            if(words[i].length() > longestFirst.length()) {
                longestFirst = words[i];
            }
        }

        for(int i = words.length -1; i >=0; i--){
            if(words[i].length() < shortestLast.length()) {
                shortestLast = words[i];
            }
        }

        System.out.println("Tu dai nhat: " + longestFirst);
        System.out.println("Tu ngan nhat: " + shortestLast);
    }
}
