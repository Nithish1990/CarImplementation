package pedal;

import brake.Brake;
import brake.BrakeSytem;

public final class BrakePedal extends Pedal{
    private BrakeSytem brakeSytem;
    //behavior
    @Override
    public void press() {
        super.setPressingPercentage(super.getPressingPercentage()*10);
        if(super.getPressingPercentage()>100)
            super.setPressingPercentage(100);
        brakeSytem.applyBrake(super.getPressingPercentage());
    }
    @Override
    public void release() {
        super.setPressingPercentage(super.getPressingPercentage()/10);
        if(super.getPressingPercentage()<1)
            super.setPressingPercentage(1);

        brakeSytem.applyBrake(super.getPressingPercentage());
    }

    // Setters and Getter
    public int getBrake() {
        return super.getPressingPercentage();
    }
    public void setBrake(int brake) {
        super.setPressingPercentage(brake);
    }

    public BrakePedal(BrakeSytem brakeSytem){
        this.brakeSytem = brakeSytem;
    }
}