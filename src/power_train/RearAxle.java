package power_train;
import constant.material.Material;
import wheel.Wheel;
public final class RearAxle {

    //attribute
    private Material material = Material.STEAL;

    //references
    private Wheel backWheelL,backWheelR;


    //behavior
    protected void spin(int rpm) {

        backWheelL.rotate(rpm);
        backWheelR.rotate(rpm);
    }

    public RearAxle( Wheel backWheelL,Wheel backWheelR) {

        this.backWheelL = backWheelL;
        this.backWheelR = backWheelR;
    }
}


