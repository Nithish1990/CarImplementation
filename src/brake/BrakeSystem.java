package brake;

public class BrakeSystem { // which connects all the wheel brakes
    private Brake brake[] = new Brake[4];
    public void applyBrake(int percentage){ // this is connected to brake pedal and have connection to

        for(int i = 0;i<4;i++)
            brake[i].increaseFriction(percentage);
    }
    public BrakeSystem(Brake frontWheelLeftBrake, Brake frontWheelRightBrake, Brake rearWheelLeftBrake, Brake rearWheelRightBrake) {


        this.brake[0]= frontWheelLeftBrake;
        this.brake[1]= frontWheelRightBrake;
        this.brake[2]= rearWheelLeftBrake;
        this.brake[3]= rearWheelRightBrake;
    }
}
