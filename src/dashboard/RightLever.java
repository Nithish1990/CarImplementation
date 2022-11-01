package dashboard;

import light.Indicator;

class RightLever {

    public void offRightIndicator(Indicator rightIndicators[]){// if offRightIndicator called all the light are off
        for(int i = 0;i<rightIndicators.length;i++)
            rightIndicators[i].offLight();
    }
    public void onRightIndicator(Indicator rightIndicators[]){
        for(int i = 0;i<rightIndicators.length;i++)
            rightIndicators[i].onLight();
    }
    public void offLeftIndicator(Indicator leftIndicators[]){
        for(int i = 0;i<leftIndicators.length;i++)
            leftIndicators[i].offLight();
    }
    public void onLeftIndicator(Indicator leftIndicators[]){
        for(int i = 0;i<leftIndicators.length;i++)
            leftIndicators[i].onLight();
    }
}