package car_body;

public final class GasTank {
    private int capacity = 20;
    private int fuel = 0;
    // behavior

    public void addFuel(int fuel){
        this.fuel+=fuel;
        if(fuel>100)fuel = 100;
    }

    public int getFuel() {
        return fuel;
    }
    public void consumeFuel(){
        fuel--;
        if(fuel<0)fuel = 0;
    }
}
