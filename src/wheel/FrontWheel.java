package wheel;
import brake.Brake;
import wheel.WheelTurningSensor;
import wheel.Wheel;

public final class FrontWheel extends Wheel {
    private  int angleOfRotation = 90;
    private WheelTurningSensor wheelTurningSensor = new WheelTurningSensor();
    public void turnLeft(){
        angleOfRotation +=30;
        if(angleOfRotation>120)angleOfRotation = 120;
        wheelTurningSensor.setAngleOfRotation(angleOfRotation);
    }
    public void turnRight(){angleOfRotation -=30;
        if(angleOfRotation<60)angleOfRotation = 60;}
    public int getAngleOfRotation() {
        return angleOfRotation;
    }


    public WheelTurningSensor getWheelTurningSensor() {
        return wheelTurningSensor;
    }

    public void setWheelTurningSensor(WheelTurningSensor wheelTurningSensor) {
        this.wheelTurningSensor = wheelTurningSensor;
    }


}
