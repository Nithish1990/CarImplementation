import constant.color.Color;

import helper.CustomScanner;

public class Main{
    public static void main(String[] args){
        CustomScanner sc = CustomScanner.getInstanceOf();// used Scanner
        Car car = new CarBuilder().setModel("XUV").setColor(Color.BLUE).setPrice(1000).setCompanyName("JOGO").manufactureCar();//used
        int userInput = sc.scan("Enter 1 to Start the car");
        while (userInput!=1)
            userInput = sc.scan("Enter only 1 to Start the car");

        car.startCar();
        while (true) {
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println("Enter to " +
                    "\n 1.GearBox " +
                    "\n 2.Pedals " +
                    "\n 3.For Steering Control (lever control yet to implement) " +
                    "\n 4.To start the car Or To off the car" +
                    "\n 5.For exit");
            car.showStatusOfTheCar();
            userInput = sc.scan();

            switch (userInput) {
                case 1://hand break also come here
                    userInput = sc.scan("Enter the gear to change " );
                    car.changeGear(userInput);
                    break;
                case 2:
                    userInput = sc.scan("Enter" +
                                            "\n 1.Clutch" +
                                            "\n 2 Brake " +
                                            "\n 3 Acceleration");
                    System.out.println("press 1 to Press or any other int  to Release");
                    car.press(userInput,sc);
                    break;
                case 3:// steeringWheel fnc
                    userInput = sc.scan("ENTER 1 to turn right, -1 to left and 0 to horn");
                    if (userInput == 1) {
                        car.getSteeringWheel().turnRight();
                    }
                    else if (userInput == -1)
                        car.getSteeringWheel().turnLeft();
                    else
                        car.getSteeringWheel().horn();
                    break;
                case 4:
                    userInput = sc.scan("To Start the car press 1 or any to stop");
                    if(userInput == 1)
                        car.startCar();
                    else
                        car.stopCar();
                    break;
                case 5:
                    System.out.println("source code in  https://github.com/Nithish1990/Car/tree/master/src Thank you.... ");
                    return;
            }
        }
    }
}
