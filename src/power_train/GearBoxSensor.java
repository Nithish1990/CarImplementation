package power_train;

public final class GearBoxSensor {
    private int currentGear;
    private int torque;
    private boolean isClutchEngage;
    private GearBox gearBox;
    public int getCurrentGear() {
        return  gearBox.getGear();
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public boolean isClutchEngage() {
        return  gearBox.isClutchApplied();
    }

    public void setClutchEngage(boolean clutchEngage) {
        isClutchEngage = clutchEngage;
    }
    public GearBoxSensor(GearBox gearBox){
        this.gearBox = gearBox;
    }
}
