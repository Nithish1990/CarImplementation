import brake.HandBrake;
import car_body.CarBody;
import car_body.GasTank;
import constant.color.Color;
import dashboard.SteeringWheel;
import dashboard.SteeringWheelAndWheel_Connector;
import drive_train.Axle;
import drive_train.Clutch;
import drive_train.Engine;
import drive_train.GearBox;
import dashboard.music_player.*;
import helper.CustomScanner;
import pedal.AccelerationPedal;
import pedal.BrakePedal;
import pedal.ClutchPedal;
import pedal.Pedal;
import wheel.FrontWheel;
import wheel.Wheel;

import java.util.Scanner;


public class Car{
    //properties
    private Color color = Color.BLUE;
    private String model;
    private String companyName;
    private long price;
    private int seat;
    private int distanceTraveled;


    // objects
    private Wheel backWheel = new Wheel();
    private FrontWheel frontWheel = new FrontWheel();
    private Axle axle = new Axle(frontWheel,backWheel);
    private GearBox gearBox = new GearBox(axle);
    private GasTank gasTank = new GasTank();
    private Clutch clutch = new Clutch(gearBox);
    private Engine engine = new Engine(clutch,gasTank);
    private MusicSystem musicSystem = new MusicSystem();

    private HandBrake handBrake = new HandBrake();
    private SteeringWheelAndWheel_Connector steeringWheelAndWheel_Connector = new SteeringWheelAndWheel_Connector(frontWheel);
    private SteeringWheel steeringWheel = new SteeringWheel(steeringWheelAndWheel_Connector);
    private CarBody carBody = new CarBody();
    //pedals
    private Pedal accelerationPedal = new AccelerationPedal(engine),clutchPedal = new ClutchPedal(clutch),brakePedal = new BrakePedal(backWheel.getBrake());

    // behavior
    public void startCar(){
        engine.setEngineOn(true);
    }//start the car which starts engine
    public void stopCar(){
        engine.setEngineOn(false);
    } //stop the car and engine

    public void changeGear(int gear){
        /*
            as of now user can change gear by giving input later on user only can change gear by shifting the gear lever
         */
        gearBox.setGear(gear);

    }// user can swipe the gear handle
    public void handBrake(){}
    public void doorFunctions(){}//door fnc

    public void showStatusOfTheCar(){
        backWheel.rotate();
        System.out.println(toString());// show the like meter bars eg speed distance fuel
    }

    @Override
    public String toString(){

        String tyre = frontWheel.getAngleOfRotation() == 120?"\\\\":frontWheel.getAngleOfRotation() == 90?"||":"//",direction = gearBox.getGear() != 6?"^":"\\/";
        return tyre +" Speed: "+backWheel.getSpeed()/10+
                ", Distance Travelled: "+backWheel.getDistanceTravelled()+
                ", Fuel: "+gasTank.getFuel()+
                " Current Gear "+gearBox.getGear()+
                ", Clutch "+(clutch.isEngage()?"//":"||")+
                ", Acceleration "+accelerationPedal.getPressingPercentage()+
                ", Brake "+backWheel.getBrake().getFrictionToTheWheel()+
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

    public Wheel getBackWheel() {
        return backWheel;
    }

    public void setBackWheel(Wheel backWheel) {
        this.backWheel = backWheel;
    }

    public FrontWheel getFrontWheel() {
        return frontWheel;
    }

    public void setFrontWheel(FrontWheel frontWheel) {
        this.frontWheel = frontWheel;
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

    public Axle getRwd() {
        return axle;
    }
    public void setRwd(Axle axle) {
        this.axle = axle;
    }

    public Pedal getClutch(){
        return clutchPedal;
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
    public void press(int userInput, CustomScanner sc){
        switch (userInput){
            case 1:// in future method overloading will be implemented
                userInput = sc.scan("");
                press(getClutchPedal(),userInput);
                break;
            case 2:// brake
                userInput = sc.scan("");
                press(getBrakePedal(),userInput);
                break;
            case 3:// acceleration
                userInput = sc.scan("");
                press(accelerationPedal,userInput);
                break;
        }//switch
    }
    public static void press(Pedal pedal,int userInput){
        if(userInput == 1){
            pedal.press();
        }else{
            pedal.release();
        }
    }
}