public class Z1 {

    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int c = minFunction(x, y);
        System.out.println("Минимальное значение = " + c);
    }
    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
        return min;
    }
}