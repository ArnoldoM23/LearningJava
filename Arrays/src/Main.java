import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed values was " + myIntegers[i]);
        }

        System.out.println(" the average is " + getAverage(myIntegers));

//        int[] sortedArray = sortDescinding(myIntegers);
        int[] copy = slice(myIntegers, 0);
        int[] sortedArray = sortRecursive(copy);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + sortedArray[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter "+ number + " interger vaues.");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }

    public static int[] sortDescinding(int[] numArray) {
        int[] copy = slice(numArray, 0);
        boolean hasChanged = true;
        int temp;

        while (hasChanged) {
            hasChanged = false;
            for (int i = 0; i < copy.length -1; i++) {
                if (copy[i] < copy[i + 1]) {
                    temp = copy[i];
                    copy[i] = copy[i + 1];
                    copy[i + 1] = temp;
                    hasChanged = true;
                }
            }
        }

        return copy;
    }


    public static int[] sortRecursive(int[] array) {
        boolean flag = false;
        int temp;
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] < array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                flag = true;
            }
        }

        return flag ? sortRecursive(array) : array;
    }

    public static int[] slice(int[] originalArray, int start) {
        int[] copy = new int[originalArray.length];

        for (int i = start; i < originalArray.length; i++) {
            copy[i] = originalArray[i];
        }

        return copy;
    }
}
