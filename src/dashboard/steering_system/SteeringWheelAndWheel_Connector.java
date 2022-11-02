package dashboard.steering_system;


import wheel.FrontWheel;

public class SteeringWheelAndWheel_Connector implements SteeringWheelMechanism {
    private FrontWheel wheel;

    public void turnLeft() {
        wheel.turnLeft();
    }

    public void turnRight() {
        wheel.turnRight();
    }

    public SteeringWheelAndWheel_Connector(FrontWheel wheel) {
        this.wheel = wheel;
    }
}
