package wheel;

public final class WheelSpeedSensor {
    private int speed;
    private boolean isBrake;
    private Wheel wheel;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isBrake() {
        return isBrake;
    }

    public void setBrake(boolean brake) {
        isBrake = brake;
    }
    public WheelSpeedSensor(Wheel wheel){
        this.wheel = wheel;
    }
}