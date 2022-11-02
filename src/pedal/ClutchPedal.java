package pedal;

import drive_train.Clutch;

public final class ClutchPedal extends Pedal{
    private Clutch clutch;
    @Override
    public void press() {
        clutch.setEngage(true);
    }
    @Override
    public void release() {
        clutch.setEngage(false);
    }
    public int getClutch(){
        return super.getPressingPercentage();
    }
    public void setClutch(boolean stateOfClutch){
        super.setPressingPercentage(stateOfClutch?1:0);
    }
    public ClutchPedal(Clutch clutch){
        this.clutch = clutch;
    }
}
