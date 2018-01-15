public class Car extends Vehicle {

    private int wheels;
    private int horsePower;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public Car(String color, int doors, int wheels, int horsePower) {
        super(color, doors);
        this.wheels = wheels;
        this.horsePower = horsePower;
    }

    @Override
    public void gearChange(int gear) {
        gearChange(gear);
        System.out.println("In gear " + gear);
    }

}
