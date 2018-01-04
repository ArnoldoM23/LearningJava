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
        super.eat();
        System.out.println("I eat everything");
    }
}
