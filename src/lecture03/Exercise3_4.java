package lecture03;

import java.util.ArrayList;

public class Exercise3_4 {
    public static void main(String[] args) {
        ArrayList<Vegetable[]> arraylist = new ArrayList<>();

        Vegetable[] vegetables = {
                new Vegetable("にんじん",117),
                new Vegetable("じゃがいも", 120),
                new Vegetable("たまねぎ", 154),
        };

        arraylist.add(vegetables);

        for(Vegetable list : vegetables){
            list.print();
        }
    }
}
