package power_train;

import helper.CustomScanner;
import power_train.GearBox;

public final class GearBoxLever {
    private GearBox gearBox; // has reference to get clutch is enable or not
    private int gearPositionX = 1,gearPositionY = 0;// why private only it can set by change gear method
    public  void changeGear(){
        while (true) {
            if(gearBox.isClutchApplied()) {
                switch (CustomScanner.scan("Enter 1.Shift left 2.Shift right, 3.Shift Up, 4. Shift down,or -1 return back menu")) {
                    case 1:
                        if(gearPositionX==1) {
                            gearPositionY--;
                            if (gearPositionY < 0) gearPositionY = 0;
                        }
                        break;
                    case 2:
                        if(gearPositionX==1) {
                            gearPositionY++;
                            if (gearPositionY > 2) gearPositionY = 2;
                        }
                        break;
                    case 3:
                        gearPositionX--;
                        if(gearPositionX<0)gearPositionX=0;
                        break;
                    case 4:
                        gearPositionX++;
                        if(gearPositionX>2)gearPositionX=2;
                        break;
                    case -1:
                        return;
                }
            }
            else{
                System.out.println("Clutch not applied...!!!!");
                return;
            }
        }
    }
    public GearBoxLever(GearBox gearBox){
       this.gearBox = gearBox;
    }

    public int getGearPositionX() {
        return gearPositionX;
    }

    public int getGearPositionY() {
        return gearPositionY;
    }
}