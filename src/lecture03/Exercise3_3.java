package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1つ目の整数を入力してください：");
        System.out.print(">");
        String a = scanner.nextLine();

        System.out.println("2つ目の整数を入力してください：");
        System.out.print(">");
        String b = scanner.nextLine();

        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        int sum = A + B;

        System.out.println(A + "+" + B + "=" + sum);
    }
}
