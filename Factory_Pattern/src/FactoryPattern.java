public class FactoryPattern {
    Car car;

    FactoryPattern(int type) {
        car = Car.createCarFactoryMethod(type);
    }
    Car getVehicle() {
        return car;
    }

}
