public class Dog extends Animal {

    private int eyes;
    private int tail;
    private int legs;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int tail, int legs, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.tail = tail;
        this.legs = legs;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("I eat everything");
    }

    public void walk() {
        System.out.println("Dog is walking");
        super.move(5); //when using super instead of calling the method move it will call the move method from the main class
    }

    public void run() {
        System.out.println("Dog is running");
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog has to move at speed " + speed);
        super.move(speed);
    }
}
