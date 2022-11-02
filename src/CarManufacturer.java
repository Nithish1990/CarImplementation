import constant.color.Color;

public class CarManufacturer {
    private Color color = Color.BLUE;
    private String model = "Default";
    private String companyName = "Default";
    private long price = 1000;
    private int seat = 4;

    public CarManufacturer setColor(Color color) {
        this.color = color;
        return this;
    }

    public CarManufacturer setModel(String model) {
        this.model = model;
        return this;
    }

    public CarManufacturer setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public CarManufacturer setSeat(int seat) {
        this.seat = seat;
        return this;
    }
    public Car manufactureCar(){
        return new Car(color,model,companyName,price,seat);
    }
}
