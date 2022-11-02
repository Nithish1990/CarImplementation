package drive_train;

import drive_train.Engine;
import pedal.Pedal;

public final class AccelerationPedal extends Pedal {
    private Engine engine;
    @Override
    public void press() {
        super.setPressingPercentage(super.getPressingPercentage()+10);
        if(super.getPressingPercentage()>100)super.setPressingPercentage(100);
        engine.changeTorque(super.getPressingPercentage());
    }

    @Override
    public void release() {
        super.setPressingPercentage(super.getPressingPercentage()-10);
        if(super.getPressingPercentage()<0)super.setPressingPercentage(0);
        engine.changeTorque(super.getPressingPercentage());
    }

    public AccelerationPedal(Engine engine){
        this.engine = engine;
    }
}
