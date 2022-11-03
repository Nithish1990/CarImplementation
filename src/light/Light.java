package light;

public abstract class Light{
    private Boolean lightIsOn = false;
    public void onLight(){}
    public void  offLight(){}
    public boolean isLightIsOn(){
        return lightIsOn;
    }
}
