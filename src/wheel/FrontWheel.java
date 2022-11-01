package wheel;
import brake.Brake;
public class FrontWheel extends  Wheel{
    private  int angleOfRotation = 90;
    public void turnLeft(){
        angleOfRotation +=30;
        if(angleOfRotation>120)angleOfRotation = 120;
    }
    public void turnRight(){angleOfRotation -=30;
        if(angleOfRotation<60)angleOfRotation = 60;}
    public int getAngleOfRotation() {
        return angleOfRotation;
    }
    @Override
    public Brake getBrake(){
        return  super.getBrake();
    }

    @Override
    public void setBrake(Brake brake) {
        super.setBrake(brake);
    }
}
