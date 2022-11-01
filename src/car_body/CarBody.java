package car_body;

import constant.material.Material;
import light.BackLight;
import light.HeadLight;
import light.Indicator;

public class CarBody {
    public final Material material = Material.ALUMINIUM;
    public Door DriverDoor = new Door();
    public Door door[] = new Door[3];
    private Indicator rightIndicators[] = new Indicator[3];
    private Indicator leftIndicators[] = new Indicator[3];
    private HeadLight rightHeadLight = new HeadLight();

    public Material getMaterial() {
        return material;
    }
    public Door getDriverDoor() {
        return DriverDoor;
    }

    public void setDriverDoor(Door driverDoor) {
        DriverDoor = driverDoor;
    }

    public Door[] getDoor() {
        return door;
    }

    public void setDoor(Door[] door) {
        this.door = door;
    }

    public Indicator[] getRightIndicators() {
        return rightIndicators;
    }

    public void setRightIndicators(Indicator[] rightIndicators) {
        this.rightIndicators = rightIndicators;
    }

    public Indicator[] getLeftIndicators() {
        return leftIndicators;
    }

    public void setLeftIndicators(Indicator[] leftIndicators) {
        this.leftIndicators = leftIndicators;
    }

    public HeadLight getRightHeadLight() {
        return rightHeadLight;
    }

    public void setRightHeadLight(HeadLight rightHeadLight) {
        this.rightHeadLight = rightHeadLight;
    }

    public HeadLight getLeftHeadLight() {
        return leftHeadLight;
    }

    public void setLeftHeadLight(HeadLight leftHeadLight) {
        this.leftHeadLight = leftHeadLight;
    }

    public BackLight getLeftBackLight() {
        return leftBackLight;
    }

    public void setLeftBackLight(BackLight leftBackLight) {
        this.leftBackLight = leftBackLight;
    }

    public BackLight getRightBackLight() {
        return rightBackLight;
    }

    public void setRightBackLight(BackLight rightBackLight) {
        this.rightBackLight = rightBackLight;
    }

    private HeadLight leftHeadLight = new HeadLight();
    private BackLight leftBackLight = new BackLight();
    private BackLight rightBackLight = new BackLight();

}
