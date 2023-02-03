public class Z4 {
    public static void main(String[] args)
    {
        int x = 2;
        int y = 4;
        int t1 = 2*x;
        int t2 = Math.abs(x-y);
        double t3 = 4.5;
        int t4 =  (x + y)/3;
        double c = maxFunction(t1,t2,t3,t4);
        System.out.println("Минимальное значение = " + c);
    }
    public static double maxFunction( int t1, int t2, double t3,int t4)
    {
        double max=0;
        if(t1>t2){
            max = t1;
        }
        if(max<t2){
            max = t2;
        }
        if(max<t3){
            max = t3;
        }
        if(max<t4){
            max = t4;
        }
        return max;
    }
}