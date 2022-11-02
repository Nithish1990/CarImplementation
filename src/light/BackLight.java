package light;
import constant.color.Color;

public final class BackLight extends  Light{
    public final Color color = Color.RED;



    public void highBeam(){}//on when on brake applied

    @Override
    public void onLight() {
        setLightIsOn(true);
    }
    @Override
    public void offLight() {
        setLightIsOn(false);
    }
}
