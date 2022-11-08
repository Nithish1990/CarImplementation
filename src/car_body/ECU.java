package car_body;

import light.BackLight;
import power_train.EngineSenor;
import power_train.GearBoxSensor;
import wheel.WheelSpeedSensor;
import java.time.LocalTime;

/*
yet to implement
 */
public class ECU {
    private int distanceTraveled;
    private int speed;
    private int currentGear;
    private int torque;
    private int fuel;
    private boolean clutchEngage;
    private EngineSenor engineSenor;
    private WheelSpeedSensor wheelSpeedSensor;
    private GearBoxSensor gearBoxSensor;
    private BackLight backLight;
    private LocalTime currentTime,tempTime;

    public boolean checkForGearSpeed(){
        currentGear = gearBoxSensor.getCurrentGear();
        speed = wheelSpeedSensor.getSpeed()/10;
        if(gearBoxSensor.isClutchEngage())
            return false;
        if(currentGear == 5 && speed<80){// where gear is no matching with speed so engine cannot produce more torque engine get failed
            return true;
        }
        if(currentGear == 4 && speed < 60) return  true;
        if(currentGear == 3 && speed < 20) return  true;
        return  false;
    }

    public ECU(EngineSenor engineSenor, GearBoxSensor gearBoxSensor,WheelSpeedSensor wheelSpeedSensor) {
        this.engineSenor = engineSenor;
        this.gearBoxSensor = gearBoxSensor;
        this.wheelSpeedSensor = wheelSpeedSensor;
    }

    public String toString(){
        return "From ecu Speed = "+speed+", Current Gear: "+ gearBoxSensor.getCurrentGear();
    }
    public boolean isClutchEngage() {
        return clutchEngage;
    }

    public void setClutchEngage(boolean clutchEngage) {
        this.clutchEngage = clutchEngage;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}
/*
    private int distanceCalculator(){
        distanceTraveled = speed * currentTime - tempTime;
        currentTime = tempTime;
        return -1;
    }
        public boolean checkForBrakeAndClutch(){
//        if(engineSenor.isEngineIsOn() && !clutchEngage &&  )
        return true;
    }
*/