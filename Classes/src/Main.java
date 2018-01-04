public class Main {

    public static void main(String [] args) {
        Car porsche = new Car();
        Car bmw = new Car();

        porsche.setModel("GTR2");

        System.out.println(porsche.getModel());

        BankAccounts myAccount = new BankAccounts();
        myAccount.setBalance(1000);
        myAccount.setName("Arnoldo");
        myAccount.deposit(350.50);
        myAccount.withdral(150.5);

        VipCustomer person = new VipCustomer("Jessica", "jessica@gmail.com", 23000);

        System.out.println(person.getName());
    }
}
