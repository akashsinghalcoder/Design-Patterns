public class Main {

    public static void main(String[] args) {

        HouseBuilder houseBuilder = Architect.returnTypeOfHouseBuilder(0);
        if(houseBuilder == null) {
            System.out.print("This type of house is not supported right not");
            return;
        }
        Architect a = new Architect(houseBuilder);
        a.constructHouse();
        Home home = a.returnHome();
        System.out.print(home.getRoof() + home.getBasement() + home.getFloor() + home.getWalls());

    }
}
