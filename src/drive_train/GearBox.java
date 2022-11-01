package drive_train;

import drive_train.Axle;

public class GearBox{



    private int gear = 0;
    private int gearRatio[] = {0,1,2,4,5,7};// if gear increase the gear shaft the position to higher gear and increase torque
    private boolean isClutchApplied = false;
    private Axle axle;//has reference
    private int gearPositionX = 0,getGearPositionY = 0;
    private int rpm = 0;

    //behavior
    public void shiftRight(){}
    public void shiftLeft(){}
    public void shiftUp(){}
    public void shiftDown(){}

    public void rotate(int rpm){

        if (gear != 6)
            axle.spin(rpm * gearRatio[gear]);
        else {
            axle.spinReverse(rpm * 1);
        }
        this.rpm = rpm;
    }

    //getter setters constructor
    public int getGear() {
        return gear;
    }
    public GearBox (Axle axle){
        this.axle = axle;
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