public class VipCustomer {

    private String name;
    private String email;
    private double creditLimit;


    public VipCustomer() {
        this("Charlie", "charlie@gmail.com", 1500);
    }

    public VipCustomer(String name, String email) {
        this(name, email, 1500);
    }

    public VipCustomer(String name, String emial, double creditLimit) {
        this.name = name;
        this.email = emial;
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
