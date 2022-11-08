package dashboard.steering_system;


import wheel.FrontWheel;

public class SteeringWheelAndWheel_Connector{
    private FrontWheel wheelL,wheelR;

    protected void turnLeft() {

        wheelL.turnLeft();
        wheelR.turnLeft();
    }

    protected void turnRight() {

        wheelL.turnRight();
        wheelR.turnRight();
    }

    public SteeringWheelAndWheel_Connector(FrontWheel wheelL,FrontWheel wheelR) {
        this.wheelL = wheelL;
        this.wheelR = wheelR;
    }
}
