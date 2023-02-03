import java.util.Scanner;
class CustomerArray {
    public static void main(String[] args) {

        Scanner arr = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");

        int size = arr.nextInt();
        int array[] = new int[size];
        System.out.println("Задайте каждому жлементу значение: ");

        for (int i = 0; i < size; i++) {
            array[i] = arr.nextInt();
        }
        System.out.print ("Итоговый массив: ");

        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        int max = array[0];
        for (int j : array) {
            if (j > max)
                max = j;
        }
        System.out.println("\nМаксимальное значение = " + max);

        int min = array[0];
        for (int a : array) {
            if (a < min)
                min = a;
        }
        System.out.println("Минимальное значение = " + min);

        int sum = 0;
        for (int k : array) {
            sum = sum + k;
        }
        System.out.println("Сумма всех элементов: "+sum);

        double ar = 0;
        if (array.length > 0)
        {
            double sum1 = 0;
            for (int i : array) {
                sum1 += i;
            }
            ar = sum1 / size;
            System.out.println("Среднее арифметическое: "+ar);
        }
    }
}