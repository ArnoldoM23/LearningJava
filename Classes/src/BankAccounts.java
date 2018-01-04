public class BankAccounts {

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phone;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public void deposit(double amount) {
        if (amount < 0)
            return;
        this.balance += amount;
        System.out.println("Your new balance is " + this.balance);
    }

    public double withdral(double amount) {
        if (this.balance < amount) {
            System.out.println("Insufficient funds");
            return -1;
        } else {
            this.balance -= amount;
            System.out.println("Your new balance is " + this.balance);
            return amount;
        }
    }
}
