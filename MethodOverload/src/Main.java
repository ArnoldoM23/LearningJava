public class Main {

    public static void main(String [] args) {

        System.out.println("Feet and Inches to cent " + calcFeetAndInchesToCentemeters(157));
    }

    public static double calcFeetAndInchesToCentemeters(double feet, double inches) {
//        System.out.println("Feet and Inches to cent " + feet + " ich " + inches);
        if (feet < 0 || inches > 12 || inches < 0)
            return -1;

        double totalInches = (feet * 12) + inches ;

        return  totalInches * 2.54;
    }

    public static double calcFeetAndInchesToCentemeters(double inches) {

        if (inches < 0)
            return -1;

        double feet = (int) inches / 12;
        double inc = (int) inches % 12;

        return calcFeetAndInchesToCentemeters(feet, inc);
    }
}
