import constant.color.Color;

public class CarBuilder {
    private Color color = Color.BLUE;
    private String model = "Default";
    private String companyName = "Default";
    private long price = 1000;
    private int seat = 4;

    public CarBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public CarBuilder setPrice(long price) {
        this.price = price;
        return this;
    }

    public CarBuilder setSeat(int seat) {
        this.seat = seat;
        return this;
    }
    public Car manufactureCar(){
        return new Car(color,model,companyName,price,seat);
    }
}
