import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        double PI=3.1314;
        System.out.print("Найти V и S \n");
        Scanner in1 =new Scanner(System.in);
        System.out.print("Введите радиус: ");
        int R = in1.nextInt();

        Scanner in2 =new Scanner(System.in);
        System.out.print("Введите высоту: ");
        int h = in2.nextInt();
        System.out.print("Объём: "+PI*Math.pow(R,2)*2 );
        System.out.print("\nПлощадь поверхности целиндра: "+2*PI*R*(R+h));
    }
}
