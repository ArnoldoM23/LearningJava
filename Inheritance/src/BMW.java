public class BMW extends Car {

    private String model;

    public BMW(String color, int doors, int wheels, int horsePower, String model) {
        super(color, doors, wheels, horsePower);
        this.model = model;
    }

    public BMW(String model) {
        super("Red", 2, 4, 550);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
