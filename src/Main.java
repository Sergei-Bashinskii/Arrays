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
        int arr1Size = arr1.length;
        int arr2Size = arr2.length;
        int arr3Size = arr3.length;
        for (int i = 0; i < arr1Size; i++){
            System.out.print(arr1[i]);
            if (i < arr1Size - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr2Size; i++){
            System.out.print(arr2[i]);
            if (i < arr2Size - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr3Size; i++){
            System.out.print(arr3[i]);
            if (i < arr3Size - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 3");
        for (int i = arr1Size - 1; i >= 0; i--){
            System.out.print(arr1[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr2Size - 1; i >= 0; i--){
            System.out.print(arr2[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr3Size - 1; i >= 0; i--){
            System.out.print(arr3[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 0; i < arr1Size; i++){
            arr1[i] = arr1[i] + 1;
        }
        System.out.println(Arrays.toString(arr1));
    }
}