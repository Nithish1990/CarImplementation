package drive_train;

import car_body.*;
import constant.engine_type.EngineType;

public final class Engine {
    private boolean engineOn = false;
    private final int horsePowerCC = 1000;//max threshold will be 100 for an eg....
    private final EngineType engineType = EngineType.ELECTRIC;
    private int torque;

    private EngineSenor engineSenor = new EngineSenor();
    //reference
    private Clutch clutch;//connected to gear
    private GasTank gasTank;//pipe line
    //methods
    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
        engineSenor.setEngineIsOn(engineOn);
    }
    protected void changeTorque(int percentage){
        if(engineOn) {
            if (gasTank.getFuel() > 0) {
                gasTank.consumeFuel();
                clutch.spin(horsePowerCC/1000 * percentage/10);
                torque = horsePowerCC/1000 * percentage/10;
            }else{
                engineOn = false;
                torque = 0;
            }
        }
        engineSenor.setTorqueProducing(torque);
    }

    //SETTER GETTERS
    public int getHorsePowerCC(){
        return horsePowerCC;
    }
    public EngineType getEngineType(){
        return  engineType;
    }
    public Engine(Clutch clutch, GasTank gasTank){
        this.clutch = clutch;
        this.gasTank = gasTank;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public EngineSenor getEngineSenor() {
        return engineSenor;
    }

    public void setEngineSenor(EngineSenor engineSenor) {
        this.engineSenor = engineSenor;
    }

    public int getTorque() {
        return torque;
    }
}
