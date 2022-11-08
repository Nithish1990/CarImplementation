package power_train;

public final class EngineSenor {


    //attribute
    private boolean isEngineIsOn;
    private int torqueProducing;






    public void setEngineIsOn(boolean engineIsOn) {
        isEngineIsOn = engineIsOn;
    }

    public boolean isEngineIsOn() {
        return isEngineIsOn;
    }
    public int getTorqueProducing(){
        return torqueProducing;
    }

    public void setTorqueProducing(int torqueProducing) {
        this.torqueProducing = torqueProducing;
    }
}
