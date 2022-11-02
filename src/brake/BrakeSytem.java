package brake;

public class BrakeSytem {
    private Brake brake[] = new Brake[4];
    public void applyBrake(int percentage){

        for(int i = 0;i<4;i++)brake[i].increaseFriction(percentage);
    }
    public BrakeSytem(Brake frontWheelLeftBrake, Brake frontWheelRightBrake, Brake rearWheelLeftBrake, Brake rearWheelRightBrake) {


        this.brake[0]= frontWheelLeftBrake;
        this.brake[1]= frontWheelRightBrake;
        this.brake[2]= rearWheelLeftBrake;
        this.brake[3]= rearWheelRightBrake;
    }
}
