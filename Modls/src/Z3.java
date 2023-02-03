public class Z3 {
    public static void main(String[] args)
    {
        int x = 2;
        int y = 4;
        int t1 = 2*x;
        int t2 = Math.abs(x-y);
        double t3 = 4.5;
        int t4 =  (x + y)/3;
        double c = minFunction(t1,t2,t3,t4);
        System.out.println("Минимальное значение = " + c);
    }
    public static double minFunction( int t1, int t2, double t3,int t4)
    {
        double min=0;
        if(t1<t2){
            min = t1;
        }
        if(min>t2){
            min = t2;
        }
        if(min>t3){
            min = t3;
        }
        if(min>t4){
            min = t4;
        }
        return min;
    }
}
