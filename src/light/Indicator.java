package light;
import constant.color.Color;

public final class Indicator extends Light{
    private final Color color = Color.YELLOW;

    @Override
    public void onLight(){
        setLightIsOn(true);
    }

    @Override
    public void offLight() {
        setLightIsOn(false);
    }
}