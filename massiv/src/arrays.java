import java.util.Arrays;
import java.util.Collections;
class arrays {
    public static void main(String[] args) {
        Integer[] arr = {5,3,2,5,7,3,6,1,0,1};
        Arrays.sort(arr, Collections.reverseOrder());

        for (int values : arr) {
            System.out.print(values + ", ");}
    }}