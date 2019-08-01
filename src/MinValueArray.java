import java.util.Scanner;

public class MinValueArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;
        int min;
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a element: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("List array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("\nValue min of array: " + min);
    }
}
