package lecture02;

public class Car {
    Tire[] tires = {
            new Tire(),new Tire(),new Tire(),new Tire()
    };
    Engine engine = new Engine();

    int fuel;

    Car(Tire[] tires,Engine engine) {
        this.fuel = 0;
    }

    void run(){
        if(fuel > 0){
            System.out.println("燃料を1消費して走りました。");
        }
        else{
            System.out.println("燃料が足りないため走れませんでした。");
        }
    }

    void startEngine(){
        engine.start();
    }
}
