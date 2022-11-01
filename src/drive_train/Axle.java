package drive_train;
import constant.material.Material;
import wheel.FrontWheel;
import wheel.Wheel;
public class Axle {
    private static Material material = Material.STEAL;
    private Wheel backWheel;
    private FrontWheel frontWheel;// reference of wheels to rotate



    public void spin(int rpm) {
        backWheel.rotate(rpm);
    }

    public void spinReverse(int rpm) {backWheel.rotate(rpm);}

    public Axle(FrontWheel frontWheel, Wheel backWheel) {
        this.backWheel =backWheel;
        this.frontWheel = frontWheel;
    }
}


