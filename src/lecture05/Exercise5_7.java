package lecture05;

import java.util.ArrayList;
import java.util.List;

public class Exercise5_7 {
    public static void main(String[] args) {
        List<Insect> insectList = new ArrayList<>();

        //Listへの格納
        insectList.add(new Insect());
        insectList.add(new Butterfly());
        insectList.add(new Locust());
        insectList.add(new SwallowtailButterfly());

        //Listの表示
        for (Insect insect : insectList){
            insect.move();
        }
    }
}
