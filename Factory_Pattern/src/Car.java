public abstract class Car {
    public abstract String printTheTypeOfCar();
    public static Car createCarFactoryMethod(int type) {
        if(type == 0) {
            return new Maruti();
        } else if(type == 1) {
            return  new Audi();
        } else if(type == 2) {
            return new Honda();
        }
        return null;


    }
}
