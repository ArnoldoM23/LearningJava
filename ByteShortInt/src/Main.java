public class Main {

    public static void main(String[] args) {

    //1. Creatre byte variable

        byte byteNumber = 127;

    // Create a short variable

        short ShortNumber = 2345;

    // create an int variable
        int intNumber = 234;

    // create a long variable
        long longNumber = 50000L + 10L * (byteNumber + ShortNumber + intNumber);

        System.out.println(longNumber);
    }
}
