import constant.color.Color;

import helper.CustomScanner;


public class Main{

    public static void main(String[] args) {
        Car car = new CarManufacturer().setModel("XUV").setColor(Color.BLUE).setCompanyName("JOGO").manufactureCar();//using Builder pattern
        int userInput = CustomScanner.scan("Enter 1 to Start the car");
        while (userInput!=1)
            userInput = CustomScanner.scan("Enter Only 1 to Start the car");

        car.startCar();
        while (true) {
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println("Option are " +
                    "\n 1.GearBox " +
                    "\n 2.Pedals " +
                    "\n 3.For Steering Control (lever control yet to implement) " +
                    "\n 4.To start the car Or To off the car" +
                    "\n 5.For exit");
            car.showStatusOfTheCar();
            userInput = CustomScanner.scan();
            switch (userInput) {
                case 1://hand break also come here
                    userInput = CustomScanner.scan("Enter the gear to change 0,1,2,3,4,5,6" );
                    car.getGearBox().setGear(userInput);
                    break;
                case 2:
                    userInput = CustomScanner.scan("Options are " +
                                            "\n 1.Clutch" +
                                            "\n 2.Brake " +
                                            "\n 3.Acceleration"+
                                            "\n -1 to Main Options");
                    System.out.println("Enter 1 to Press or 2 to Release");
                    if(userInput!=-1)
                    car.selectPedal(userInput);
                    break;
                case 3:// steeringWheel fnc
                    userInput = CustomScanner.scan("ENTER 1 to turn right, 2 to left, 0 to horn else -1 to Main Options" );
                    if (userInput == 1) {
                        car.getSteeringWheel().turnRight();
                    }
                    else if (userInput == 2)
                        car.getSteeringWheel().turnLeft();
                    else if(userInput == 0)
                        car.getSteeringWheel().horn();
                    break;
                case 4:
                    userInput = CustomScanner.scan("To Start the car press 1 or 2 to  stop else -1 to Main Option");
                    if(userInput == 1)
                        car.startCar();
                    else if(userInput ==2 )
                        car.stopCar();
                    break;
                case 5:
                    System.out.println("source code in  https://github.com/Nithish1990/CarImplementation/tree/master/src Thank you.... ");
                    return;
                default:
                    System.out.println("Enter Valid Input....");
            }
        }
    }
}
