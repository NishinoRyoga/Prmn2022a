package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("何行分入力しますか？");
        System.out.print(">");
        int size = input.nextInt();
        String empty = input.nextLine();

        for(int i = 0 ; i < size ; i++) {
            System.out.println((i+1) + "行目：");
            System.out.print(">");
            String str = input.nextLine();
            list.add(str);
        }

        System.out.println("入力した文字列：");
        for(int i = 0 ; i < list.size() ; i++){
            System.out.println("[" + i + "]" + list.get(i));
        }
    }
}
