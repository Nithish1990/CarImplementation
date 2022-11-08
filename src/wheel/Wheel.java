package wheel;
import brake.Brake;

public class Wheel {


    private int circumference = 10;//size of wheel
    private int speed = 0;
    private int distanceTravelled = 0;
    private Brake brake = new Brake();
    private Tyre tyre = new Tyre();
    protected WheelSpeedSensor wheelSpeedSensor = new WheelSpeedSensor(this);

    //backWheel behavior
    public void rotate(int rpm){// this method will call by rearAxle with rpm speed
        this.speed = circumference * (rpm/brake.getFrictionToTheWheel());
        wheelSpeedSensor.setSpeed(speed);
    }
    public void rotate(){// why without rpm is rotating in ideal speed
        this.speed = this.speed/ brake.getFrictionToTheWheel();
        if(speed<0)speed = 0;
        wheelSpeedSensor.setSpeed(speed);
    }

    // getters setters
    public int getCircumference() {
        return circumference;
    }

    public void setCircumference(int circumference) {
        this.circumference = circumference;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
    public Brake getBrake() {
        return brake;
    }
    public void setBrake(Brake brake) {
        this.brake = brake;
    }

    public WheelSpeedSensor getWheelSpeedSensor() {
        return wheelSpeedSensor;
    }

    public void setWheelSpeedSensor(WheelSpeedSensor wheelSpeedSensor) {
        this.wheelSpeedSensor = wheelSpeedSensor;
    }
}