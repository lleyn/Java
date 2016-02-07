package Lab3;


/**
 * Created by lleyn on 07.02.16.
 */
public class Lab3_1 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int k = 0;
    for(int i = 2;i<=20;i++){
        if (i%2 == 0) {
            a[k] = i;
            k++;
            System.out.print(i + " ");
        }
    }
        System.out.println();
        for (int j = 0;j < a.length;j++){
            System.out.println(a[j]);
        }
    }
}
