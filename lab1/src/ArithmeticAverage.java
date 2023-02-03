import java.util.Scanner;

public class ArithmeticAverage {
    public static void main(String[] args) {
        int sum;
        Scanner in1 =new Scanner(System.in);
        System.out.print("Введите первое значение: ");
        int num1 = in1.nextInt();

        Scanner in2 =new Scanner(System.in);
        System.out.print("Введите первое значение: ");
        int num2 = in2.nextInt();

        Scanner in3 =new Scanner(System.in);
        System.out.print("Введите первое значение: ");
        int num3 = in3.nextInt();
        sum=(num1+num2+num3)/3;
        System.out.printf("среднее арифметическое равно: %d", sum);
    }
}
