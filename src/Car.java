import brake.BrakeSystem;
import brake.HandBrake;
import constant.color.Color;
import dashboard.steering_system.SteeringWheel;
import dashboard.steering_system.SteeringWheelAndWheel_Connector;
import power_train.RearAxle;
import power_train.Clutch;
import power_train.Engine;
import dashboard.music_player.*;
import power_train.GearBox;
import power_train.AccelerationPedal;
import pedal.BrakePedal;
import pedal.ClutchPedal;
import pedal.Pedal;
import wheel.FrontWheel;
import wheel.Wheel;
import car_body.*;

public class Car{
    //properties
    private Color color = Color.BLUE;
    private final String model;
    private final String companyName;
    private final long price;
    private final int seat;
    private int distanceTraveled;

    // objects
    public Wheel backWheelLeft = new Wheel(),backWheelRight = new Wheel();
    public FrontWheel frontWheelLeft = new FrontWheel(),frontWheelRight = new FrontWheel();
    private RearAxle rearAxle = new RearAxle(backWheelLeft,backWheelRight);
    private GearBox gearBox = new GearBox(rearAxle);
    private FuelTank fuelTank = new FuelTank();
    private Clutch clutch = new Clutch( gearBox);
    private Engine engine = new Engine(clutch,fuelTank);
    private MusicSystem musicSystem = new MusicSystem();

    private HandBrake handBrake = new HandBrake();
    private SteeringWheelAndWheel_Connector steeringWheelAndWheel_Connector = new SteeringWheelAndWheel_Connector(frontWheelLeft,frontWheelRight);
    private SteeringWheel steeringWheel = new SteeringWheel(steeringWheelAndWheel_Connector);
    private CarBody carBody = new CarBody();

    private BrakeSystem brakeSystem = new BrakeSystem(frontWheelLeft.getBrake(),frontWheelRight.getBrake(),backWheelLeft.getBrake(),backWheelRight.getBrake());
    //pedals
    private Pedal accelerationPedal = new AccelerationPedal(engine),clutchPedal = new ClutchPedal(clutch),brakePedal = new BrakePedal(brakeSystem);
    private ECU ecu = new ECU(engine.getEngineSenor(), gearBox.getGearBoxSensor(),backWheelLeft.getWheelSpeedSensor());
    // behavior
    protected void startCar(){
        engine.setEngineOn(true);
    }//start the car which starts engine
    protected void stopCar(){
        engine.setEngineOn(false);
    } //stop the car and engine
    public void doorFunctions(){}//door fnc
    public void addFuel(int fuel){
        fuelTank.addFuel(fuel);
    }
    public void showStatusOfTheCar(){
        if(ecu.checkForGearSpeed()){
            System.out.println("Engine failure");
            engine.setEngineOn(false);
        }
        backWheelRight.rotate();//rotate the wheel
        backWheelLeft.rotate();
        System.out.println(ecu);
        System.out.println(this);// show the like meter bars eg speed distance fuel
    }

    @Override
    public String toString(){

        String tyre = frontWheelLeft.getAngleOfRotation() == 120?"\\\\":frontWheelLeft.getAngleOfRotation() == 90?"||":"//",direction = getGearBox().getGear() != 6?"^":"\\/";
        return " Speed: "+backWheelLeft.getSpeed()/10+
                ", Distance Travelled: "+backWheelLeft.getDistanceTravelled()+
                ", Fuel: "+fuelTank.getFuel()+
                "\n"+tyre+
                " Current Gear "+getGearBox().getGear()+
                ", Clutch "+(clutch.isEngage()?"//":"||")+
                ", Acceleration "+accelerationPedal.getPressingPercentage()+
                ", Brake "+backWheelLeft.getBrake().getFrictionToTheWheel()+
                ", Engine status:"+engine.isEngineOn()+
                ", "+tyre+", "+direction;
    }
    public Car(Color color, String model, String companyName, long price, int seat) {
        this.color = color;
        this.model = model;
        this.companyName = companyName;
        this.price = price;
        this.seat = seat;
    }



    //getter Setter
    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    public MusicSystem getMusicSystem() {
        return musicSystem;
    }
    public HandBrake getHandBrake() {
        return handBrake;
    }

    public void setHandBrake(HandBrake handBrake) {
        this.handBrake = handBrake;
    }
    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public RearAxle getRearAxle() {
        return rearAxle;
    }
    public void setRwd(RearAxle axle) {
        this.rearAxle = axle;
    }

    public Clutch getClutch(){
        return clutch;
    }

    public Pedal getAccelerationPedal() {
        return accelerationPedal;
    }

    public void setAccelerationPedal(Pedal accelerationPedal) {
        this.accelerationPedal = accelerationPedal;
    }

    public Pedal getClutchPedal() {
        return clutchPedal;
    }

    public void setClutchPedal(Pedal clutchPedal) {
        this.clutchPedal = clutchPedal;
    }

    public Pedal getBrakePedal() {
        return brakePedal;
    }

    public void setBrakePedal(Pedal brakePedal) {
        this.brakePedal = brakePedal;
    }

    public void setClutch(ClutchPedal clutch){
        this.clutchPedal = clutch;
    }


}