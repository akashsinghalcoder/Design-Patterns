public class Architect {
    HouseBuilder houseBuilder;

    Architect(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;

    }

    public void constructHouse() {
        houseBuilder.setBasementOfTheHouse();
        houseBuilder.setFloorOfTheHouse();
        houseBuilder.setRoofOFTheHouse();
        houseBuilder.setWallsOfTheHouse();
    }

    public Home returnHome() {
        return this.houseBuilder.returnHome();
    }

    public static HouseBuilder returnTypeOfHouseBuilder(int type) {
        if(type == 0) {
            return new ConcreteHouseBuilder();
        } else {
            return null;
        }

    }


}
