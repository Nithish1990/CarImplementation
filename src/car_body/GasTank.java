package car_body;

public class GasTank {
    private int capacity = 20;
    private int fuel = 100;
    // behavior

    public void addFuel(int fuel){
        this.fuel+=fuel;
    }

    public int getFuel() {
        return fuel;
    }
    public void consumeFuel(){
        fuel--;
    }
}
