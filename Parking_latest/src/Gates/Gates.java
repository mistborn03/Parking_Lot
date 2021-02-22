package Gates;

public class Gates {

    String name;

    int carCount;
    int bikeCount;
    int bicycleCount;

    public Gates(String name, int carCount, int bikeCount, int bicycleCount) {
        this.name = name;
        this.carCount = carCount;
        this.bikeCount = bikeCount;
        this.bicycleCount = bicycleCount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCarCount() {
        return carCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    public int getBikeCount() {
        return bikeCount;
    }

    public void setBikeCount(int bikeCount) {
        this.bikeCount = bikeCount;
    }

    public int getBicycleCount() {
        return bicycleCount;
    }

    public void setBicycleCount(int bicycleCount) {
        this.bicycleCount = bicycleCount;
    }
}
