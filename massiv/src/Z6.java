import java.util.Arrays;
import java.util.Scanner;
class Z6 {
    public static void main(String args[]) {
        Scanner mas = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int z = mas.nextInt();
        int a[] = new int[z];
        int i;
        System.out.println("Введите значения массива: ");
        for (i = 0; i < z; i++) {
            a[i] = mas.nextInt();
        }
        System.out.println("Чётные числа: ");
        Arrays.sort(a);{
        for (i = 0; i < z; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
        }
        System.out.println("Нечётные числа");
        Arrays.sort(a);
        for (i = 0; i < z; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }

        }
    }
}