package car_body;

import constant.material.Material;
import light.BackLight;
import light.HeadLight;
import light.Indicator;

public class CarBody {
    public Material material = Material.ALUMINIUM;
    public Door door = new Door();
    private Indicator rightIndicators = new Indicator();
    private Indicator leftIndicators = new Indicator();
    private HeadLight headLight = new HeadLight();
    private BackLight backLight = new BackLight();
    public Material getMaterial() {
        return material;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Indicator getRightIndicators() {
        return rightIndicators;
    }

    public void setRightIndicators(Indicator rightIndicators) {
        this.rightIndicators = rightIndicators;
    }

    public Indicator getLeftIndicators() {
        return leftIndicators;
    }

    public void setLeftIndicators(Indicator leftIndicators) {
        this.leftIndicators = leftIndicators;
    }

    public HeadLight getHeadLight() {
        return headLight;
    }

    public void setHeadLight(HeadLight headLight) {
        this.headLight = headLight;
    }

    public BackLight getBackLight() {
        return backLight;
    }

    public void setBackLight(BackLight backLight) {
        this.backLight = backLight;
    }
}
