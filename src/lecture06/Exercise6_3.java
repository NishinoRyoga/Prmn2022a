package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_3 {
    public static void main(String[] args) {
        ArrayList<Integer> dice = new ArrayList<>();
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        //diceに1~6の値を格納
        System.out.println("さいころを5つ振りました。");
        for(int i=0;i<5;i++){
            dice.add(random.nextInt(6)+1);
        }

        //index番目のdiceの値を表示
        try {
            System.out.println("何番目のさいころの値を確認しますか?");
            int index = input.nextInt();
            System.out.println(index + "番目のさいころの値：" + dice.get(index));
        //例外処理（Listの上限を超えたindex）
        } catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました。");
            System.out.println("プログラムを終了します。");
        //例外処理（整数値以外のindexを入力）
        } catch (InputMismatchException e){
            System.out.println("整数以外の値を入力されました。");
            System.out.println("プログラムを終了します。");
        }
    }

}
