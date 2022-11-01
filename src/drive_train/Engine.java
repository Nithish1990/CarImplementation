package drive_train;

import car_body.GasTank;
import constant.engine_type.EngineType;

public  class Engine {
    private boolean engineOn = false;
    private int horsePowerCC = 1000;//max threshold will be 100 for an eg....
    private final EngineType engineType = EngineType.ELECTRIC;

    //reference
    private Clutch clutch;//connected to gear
    private GasTank gasTank;//pipe line
    //methods
    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }
    public void changeRPM(int percentage){
        if(engineOn) {
            if (gasTank.getFuel() > 0) {
                gasTank.consumeFuel();
                clutch.spin(horsePowerCC/1000 * percentage/10);
            }else{
                clutch.spin(0);
            }
        }
    }

    //SETTER GETTERS
    public void setHorsePowerCC(int horsePowerCC){
        this.horsePowerCC = horsePowerCC;
    }
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
}
