public class ConcreteHouseBuilder implements HouseBuilder {
    Home home;

    ConcreteHouseBuilder() {
        home = new Home();
    }

    @Override
    public void setBasementOfTheHouse() {
        this.home.setBasement("Basement");

    }

    @Override
    public void setRoofOFTheHouse() {
        this.home.setRoof("Roof");
    }

    @Override
    public void setWallsOfTheHouse() {
        this.home.setWalls("Walls");

    }

    @Override
    public void setFloorOfTheHouse() {
        this.home.setFloor("Floor");

    }
    @Override
    public Home returnHome() {
        return this.home;
    }
}
