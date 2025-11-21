public class House {
    private String walls;
    private String roof;
    private String garden;

    public void setWalls(String walls) { this.walls = walls; }
    public void setRoof(String roof) { this.roof = roof; }
    public void setGarden(String garden) { this.garden = garden; }

    @Override
    public String toString() {
        return "House with " + walls + ", " + roof + " and " + garden;
    }
}

interface HouseBuilder {
    void buildWalls();
    void buildRoof();
    void buildGarden();
    House getResult();
}

class WoodenHouseBuilder implements HouseBuilder {
    private House house = new House();

    public void buildWalls() { house.setWalls("wooden walls"); }
    public void buildRoof() { house.setRoof("wooden roof"); }
    public void buildGarden() { house.setGarden("small garden"); }
    public House getResult() { return house; }
}


class Director {
    private HouseBuilder builder;

    public Director(HouseBuilder builder) { this.builder = builder; }

    public House construct() {
        builder.buildWalls();
        builder.buildRoof();
        builder.buildGarden();
        return builder.getResult();
    }
}
