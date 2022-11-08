package car_body;

public final class FuelTank {
    private int capacity = 100;
    private int fuel = 100;
    // behavior

    public void addFuel(int fuel){
        this.fuel+=fuel;
        if(fuel>capacity)fuel = capacity;
    }

    public int getFuel() {
        return fuel;
    }
    public void consumeFuel(){
        fuel--;
        if(fuel<0)fuel = 0;
    }
}
