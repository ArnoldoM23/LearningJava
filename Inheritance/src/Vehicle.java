public class Vehicle {

    private String color;
    private int doors;

    public Vehicle(String color, int doors) {
        this.color = color;
        this.doors = doors;
    }

    public void steering(String direction) {
        if (direction == "Left") {
            System.out.println("Turning left");
        } else {
            System.out.println("Turning right");
        }
    }

    public void gearChange(int gear) {
        System.out.println("System changing gears");
    }

    public void speed(int speed) {
        System.out.println("Your speed is " + speed);
    }

    public void brake() {
        System.out.println("Braking!!");
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
