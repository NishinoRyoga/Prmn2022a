package lecture02;

public class Excise2_1 {
    public static void main(String[] args) {
        Human[] human = {
                new Human("たかし", 18),
                new Human("ひろし", 20),
                new Human("あつし", 23),
        };

        for(int i = 0 ; i < human.length ; i++) {
            human[i].print();
        }
    }
}
