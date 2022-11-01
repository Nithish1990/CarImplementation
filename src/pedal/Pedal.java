package pedal;

public abstract class Pedal {
    private int pressingPercentage = 1;
    public abstract void press();
    public abstract void release();


    public int getPressingPercentage(){
        return pressingPercentage;
    }
    public void setPressingPercentage(int pressingPercentage){
        this.pressingPercentage = pressingPercentage;
    }
}
