package lecture03;

import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("任意の文字列を入力してください：");
        System.out.print(">");
        String str = input.nextLine();
        System.out.println("\"" + str + "\"" + "と入力されました");
    }
}