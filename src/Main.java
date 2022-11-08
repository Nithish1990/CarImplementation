
import constant.color.Color;

import helper.CustomScanner;
import pedal.Pedal;


public class Main{
    static Car car;
    public static void main(String[] args) {
        car = new CarManufacturer().setModel("JEEP").setColor(Color.BLUE).manufactureCar();//using Builder pattern
        int userInput = CustomScanner.scan("Enter 1 to Start the car");
        while (userInput!=1)
            userInput = CustomScanner.scan("Enter Only 1 to Start the car");

        car.startCar();
        while (true) {

            System.out.println("-----------------------------------------------------------------------------------------------------------------"+
                    "\nOption are " +
                    "\n 1.GearBox " +
                    "\n 2.Pedals " +
                    "\n 3.For Steering Control (lever control yet to implement) " +
                    "\n 4.To start the car Or To off the car" +
                    "\n -1.For exit");
            car.showStatusOfTheCar();
            userInput = CustomScanner.scan();
            switch (userInput) {
                case 1://hand break also come here
                    car.getGearBox().getGearBoxLever().changeGear();
                    break;
                case 2:
//                  PEDAL options...
                    userInput = CustomScanner.scan("Options are " +
                                            "\n 1.Clutch" +
                                            "\n 2.Brake " +
                                            "\n 3.Acceleration"+
                                            "\n -1 to Main Options");
                    if(userInput!=-1)
                        pressOrRelease(selectPedal(userInput),CustomScanner.scan("Enter 1 to press or 2 to release"));
                    break;
                case 3:// steeringWheel fnc
                    userInput = CustomScanner.scan("ENTER 1 to turn right, 2 to left else -1 to Main Options" );
                    if (userInput == 1)
                        car.getSteeringWheel().turnRight();
                    else if (userInput == 2)
                        car.getSteeringWheel().turnLeft();
                    else if(userInput == -1)
                        car.getSteeringWheel().horn();
                    break;
                case 4:
                    userInput = CustomScanner.scan("To Start the car press 1 or 2 to  stop else -1 to Main Option");
                    if(userInput == 1)
                        car.startCar();
                    else if(userInput ==2 )
                        car.stopCar();
                    break;
                case -1:
                    System.out.println("source code in  https://github.com/Nithish1990/CarImplementation/tree/master/src Thank you.... ");
                    return;
                default:
                    System.out.println("Enter Valid Input....");
            }
        }
    }
    public static Pedal selectPedal(int userInput){
        if(userInput == 1){
//            car.getAccelerationPedal().setPressingPercentage(0);// if we
            return car.getClutchPedal();
        }
        if(userInput == 2)return car.getBrakePedal();
        if(userInput == 3)return car.getAccelerationPedal();
        return selectPedal(CustomScanner.scan("Enter valid input"));
    }
    public static void pressOrRelease(Pedal pedal,int userInput){
        if(userInput == 1){
            pedal.press();
        }else if(userInput ==2 ){
            pedal.release();
        }
    }
}
