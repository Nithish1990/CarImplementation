package pedal;

import brake.Brake;

public class BrakePedal extends Pedal{
    private Brake brake;
    //behavior
    @Override
    public void press() {
        super.setPressingPercentage(super.getPressingPercentage()*10);
        if(super.getPressingPercentage()>100)
            super.setPressingPercentage(100);
        brake.increaseFriction(super.getPressingPercentage());
    }
    @Override
    public void release() {
        super.setPressingPercentage(super.getPressingPercentage()/10);
        if(super.getPressingPercentage()<1)
            super.setPressingPercentage(1);

        brake.increaseFriction(super.getPressingPercentage());
    }

    // Setters and Getter
    public int getBrake() {
        return super.getPressingPercentage();
    }
    public void setBrake(int brake) {
        super.setPressingPercentage(brake);
    }

    public BrakePedal(Brake brake){
        this.brake = brake;
    }
}