public class Z2 {

    public static void main(String[] args)
    {
        int x = 2;
        int y = 3;
        int t1 = 2*y-x;
        int t2 = 5*x+3*y;
        int c = maxFunction(x,y,t1,t2);
        System.out.println("Минимальное значение = " + c);
    }
    public static int maxFunction(int x, int y, int t1, int t2) {
        int max1;
        if (x < t1)
            max1 = t1;
        else
            max1 = x;
        return max1;

        int max2;
        if (t2 < y)
            max2 = y;
        else
            max2 = t2;
        return max2;


    }
}