package wheel;
import brake.Brake;
public class Wheel {

    private int circumference = 10;//size of wheel
    private int speed = 0;
    private int distanceTravelled = 0;
    private Brake brake = new Brake();
    private Tyre tyre = new Tyre();

    //backWheel behavior
    public void rotate(int rpm){
        this.speed = circumference * (rpm/brake.getFrictionToTheWheel());
    }
    public void rotate(){
        this.speed = this.speed/ brake.getFrictionToTheWheel();
    }



    // getters setters
    public int getCircumference() {
        return circumference;
    }

    public void setCircumference(int circumference) {
        this.circumference = circumference;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
    public Brake getBrake() {
        return brake;
    }
    public void setBrake(Brake brake) {
        this.brake = brake;
    }
}