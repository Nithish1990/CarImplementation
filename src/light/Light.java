package light;

public abstract class Light{
    private Boolean lightIsOn = false;
    private int size;
    public void onLight(){
        lightIsOn = true;
    }
    public  void  offLight(){
        lightIsOn = false;
    }
}
