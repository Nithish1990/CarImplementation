package dashboard.steering_system;


public final class SteeringWheel implements Steerable {


    //attribute
    private  int angelOfRotation = 90;


    //reference
    private SteeringWheelAndWheel_Connector steeringWheelAndWheel_connector;

    //Behavior or methods
    public void turnLeft(){ //change the angle of in steering wheel which turn the FrontWheel
        angelOfRotation+=30;
        steeringWheelAndWheel_connector.turnLeft();
    }
    public void turnRight(){//change the angle of in steering wheel which turn the FrontWheel
        angelOfRotation-=30;
        steeringWheelAndWheel_connector.turnRight();
    }
    public void horn(){
        System.out.println("Horn sound");
    }


    //constructor
    public SteeringWheel(SteeringWheelAndWheel_Connector steeringWheelAxle){
        this.steeringWheelAndWheel_connector = steeringWheelAxle;
    }



    //getters Setters
    public  void setAngelOfRotation(int angelOfRotation){
        this.angelOfRotation = angelOfRotation;
    }
    public int getAngelOfRotation(){
        return angelOfRotation;
    }
}


