package drive_train;


public final class GearBox{



    private int gear = 1;
    private int gearRatio[] = {1,4,7,10,14,2};// if gear increase the gear shaft the position to higher gear and increase torque
    private boolean isClutchApplied = false;
    private RearAxle rearAxle;//has reference
    private int gearPositionX = 0,getGearPositionY = 0;
    private int torque;

    //behavior
    public void shiftRight(){}
    public void shiftLeft(){}
    public void shiftUp(){}
    public void shiftDown(){}



    //behavior
    protected void rotate(int torque){

        rearAxle.spin(torque* gearRatio[gear]);
        this.torque = torque;
    }

    //getter setters constructor
    public int getGear() {
        return gear;
    }
    public GearBox (RearAxle axle){
        this.rearAxle = axle;
    }

    public void setGear(int gear){
        if (gear <= 6 &&
                gear >= 0 &&
                isClutchApplied
        ) {
            this.gear = gear;
        }
    }

    public void setClutchApplied(boolean clutchApplied) {
        isClutchApplied = clutchApplied;
    }
}