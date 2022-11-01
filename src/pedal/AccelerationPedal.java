package pedal;

import drive_train.Engine;

public  class AccelerationPedal extends Pedal {
    private Engine engine;
    @Override
    public void press() {
        super.setPressingPercentage(super.getPressingPercentage()+10);
        if(super.getPressingPercentage()>100)super.setPressingPercentage(100);
        engine.changeRPM(super.getPressingPercentage());
    }

    @Override
    public void release() {
        super.setPressingPercentage(super.getPressingPercentage()-10);
        if(super.getPressingPercentage()<0)super.setPressingPercentage(0);
        engine.changeRPM(super.getPressingPercentage());
    }

    public AccelerationPedal(Engine engine){
        this.engine = engine;
    }
}
