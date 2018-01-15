//import java.util.Scanner;
//
//public class SortArray {
//
//    public static Scanner  scanner = new Scanner(System.in);
//
//    public static int[] getInteger(int number) {
//        System.out.println("Enter " + number + ", and press enter");
//        int[] values = int[number];
//
//        for(int i = 0; i < values.length; i++){
//            values[i] = scanner.nextInt();
//        }
//
//        return values;
//    }
//
//    public static int[] sortDescinding(int[] numArray) {
//        int[] copy = slice(numArray, 0);
//        boolean hasChanged = true;
//        int temp;
//
//        while (hasChanged) {
//            hasChanged = false;
//            for (int i = 0; i < copy.length -1; i++) {
//                if (copy[i] < copy[i + 1])
//                    temp = copy[i];
//                    copy[i] = copy[i + 1];
//                    copy[i + 1] = temp;
//                    hasChanged = true;
//            }
//        }
//    }
//
//    public static int[] slice(int[] originalArray, int start) {
//        int[] copy = int[originalArray.length];
//
//        for (int i = start; i < originalArray.length; i++) {
//            copy[i] = originalArray[i];
//        }
//
//        return copy;
//    }
//}
