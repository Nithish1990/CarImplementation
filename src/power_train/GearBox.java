package power_train;


public class GearBox {
    private int gear = 0;
    private boolean isClutchApplied = false;
    private RearAxle rearAxle;//has reference
    private GearBoxSensor gearBoxSensor = new GearBoxSensor(this);
    private GearBoxLever gearBoxLever = new GearBoxLever(this);
    private static  int gearPosition[][] = {
            {1,3,5},
            {0,0,0},
            {2,4,6}
    };
    private int gearRatio[] = {0,1,4,7,10,14,2};// if gear increase the gear shaft the position to higher gear and increase torque
    //behavior


    //behavior
    protected void gearSpin(int torque){
        rearAxle.spin(torque * gearRatio[getGear()]);
    }

    //getter setters constructor
    public int getGear(){
        return gearPosition[gearBoxLever.getGearPositionX()][gearBoxLever.getGearPositionY()];
    }
    public void setClutchApplied(boolean clutchApplied) {
        isClutchApplied = clutchApplied;
        gearBoxSensor.setClutchEngage(clutchApplied);
    }

    public GearBoxSensor getGearBoxSensor() {
        return gearBoxSensor;
    }

    public void setGearBoxSensor(GearBoxSensor gearBoxSensor) {
        this.gearBoxSensor = gearBoxSensor;
    }
    public GearBox(RearAxle rearAxle){
        this.rearAxle = rearAxle;
    }

    public GearBoxLever getGearBoxLever() {
        return gearBoxLever;
    }

    public void setGearBoxLever(GearBoxLever gearBoxLever) {
        this.gearBoxLever = gearBoxLever;
    }

    public boolean isClutchApplied() {
        return isClutchApplied;
    }
}