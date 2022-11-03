package dashboard.steering_system;


import wheel.FrontWheel;

public class SteeringWheelAndWheel_Connector implements SteeringWheelMechanism {
    private FrontWheel wheelL,wheelR;

    public void turnLeft() {

        wheelL.turnLeft();
        wheelR.turnLeft();
    }

    public void turnRight() {

        wheelL.turnRight();
        wheelR.turnRight();
    }

    public SteeringWheelAndWheel_Connector(FrontWheel wheelL,FrontWheel wheelR) {
        this.wheelL = wheelL;
        this.wheelR = wheelR;
    }
}
