package car_body;

import drive_train.Engine;
import drive_train.EngineSenor;
import drive_train.GearBoxSensor;
import wheel.WheelSpeedSensor;
import wheel.WheelTurningSensor;


/*
yet to implement
 */
public class SafetyMechanism {
    private EngineSenor engineSenor;
    private WheelSpeedSensor speedSensor;
    private GearBoxSensor gearBoxSensor;
    private WheelTurningSensor wheelTurningSensor;


    private Engine engine;


    public SafetyMechanism(EngineSenor engineSenor, WheelSpeedSensor speedSensor, GearBoxSensor gearBoxSensor, WheelTurningSensor wheelTurningSensor, Engine engine) {
        this.engineSenor = engineSenor;
        this.speedSensor = speedSensor;
        this.gearBoxSensor = gearBoxSensor;
        this.wheelTurningSensor = wheelTurningSensor;
        this.engine = engine;
    }
}
