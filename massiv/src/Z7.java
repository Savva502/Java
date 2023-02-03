public class Z7 {
    public static void main(String[] args)
    {
        int[] array = {2, 5, 7, 8, 3, 1};
        int index = 0;

        int max = array[0];
        for (int j : array) {
            if (j > max)
                max = j;
        }

        int min = array[0];
        for (int a : array) {
            if (a < min)
                min = a;
        }
        System.out.println("Разность между максимальным и минимальным числом="+ (max-min) );
    }

}