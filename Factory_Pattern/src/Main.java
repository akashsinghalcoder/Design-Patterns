public class Main {
    public static void main(String[] args) {
        FactoryPattern factory = new FactoryPattern(0);
        System.out.print(factory.getVehicle().printTheTypeOfCar());
    }
}
