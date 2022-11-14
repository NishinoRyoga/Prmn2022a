package lecture02;

public class Exsize2_3 {
    public static void main(String[] args) {
        Tire[] tires = {
                new Tire(),new Tire(),new Tire(),new Tire()
        };
        Engine engine = new Engine();
        Car car = new Car(tires,engine);
        GasStation gasStation = new GasStation();
        gasStation.refuel(car);
        car.startEngine();
        car.run();
    }
}
