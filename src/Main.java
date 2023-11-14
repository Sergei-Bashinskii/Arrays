import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = new int[3];
        int a = 4;
        int b = 5;
        int c = 6;
        arr3[0] = a;
        arr3[1] = b;
        arr3[2] = c;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println("Задача 2");
        System.out.println(arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
        System.out.println(arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
        System.out.println(arr3[0] + ", " + arr3[1] + ", " + arr3[2]);
        System.out.println("Задача 3");
        System.out.println(arr1[2] + ", " + arr1[1] + ", " + arr1[0]);
        System.out.println(arr2[2] + ", " + arr2[1] + ", " + arr2[0]);
        System.out.println(arr3[2] + ", " + arr3[1] + ", " + arr3[0]);
        System.out.println("Задача 4");
        for (int i = 0; i < 3; i++) {
            if (arr1[i] % 2 == 0) {
                System.out.println(arr1[i]);
            } else {
                arr1[i] = arr1[i] + 1;
                System.out.println(arr1[i]);
            }
        }
    }
}