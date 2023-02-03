import java.util.Scanner;
public class Cricle {
    public static void main(String[] args) {
        final double PI=3.1415;
        Scanner in1 =new Scanner(System.in);
        System.out.print("Введите радиус: ");
        int r = in1.nextInt();
        System.out.print("Площадь площадь круга: "+PI*Math.pow(r,2));
    }
}
