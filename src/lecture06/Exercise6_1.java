package lecture06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Float num;
        System.out.print("小数を入力してください：");

        //例外処理
        try {
            num = input.nextFloat();
            System.out.print("入力した値：" + num);
        }catch (InputMismatchException e){
            System.out.println("エラー.");
        }
    }
}
