package light;

import constant.color.Color;

public final class HeadLight extends Light{
    public final Color color = Color.WHITE;


    public void highBeam(){}// on by user
    public  void lowBeam(){}//on by user

    @Override
    public void onLight() {
        setLightIsOn(true);
    }
    @Override
    public void offLight() {
        setLightIsOn(false);
    }
}
