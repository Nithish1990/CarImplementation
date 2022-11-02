package wheel;

import constant.material.Material;

public final class Tyre{
    private final Material material  = Material.RUBBER;
    private int airPressure = 50;

    public Material getMaterial() {
        return material;
    }

    public int getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(int airPressure) {
        this.airPressure = airPressure;
    }
}
