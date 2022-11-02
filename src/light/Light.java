package light;

public abstract class Light{
    private Boolean lightIsOn = false;
    public abstract void onLight();
    public  abstract void  offLight();
    protected void setLightIsOn(Boolean lightIsOn) {
        this.lightIsOn = lightIsOn;
    }
    public boolean isLightIsOn(){
        return lightIsOn;
    }
}
