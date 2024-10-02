public abstract class Vehicle {
    private  final String Make="Ford";
    private String model;
    private String vin;
    private int horsepower;

    public Vehicle(String model, String vin, int horsepower) {
        this.model = model;
        this.vin = vin;
        this.horsepower = horsepower;
    }

    public Vehicle() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getMake() {
        return Make;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Make='" + Make + '\'' +
                ", model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", horsepower=" + horsepower +
                '}';
    }
}
