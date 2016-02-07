package Lab3;


/**
 * Created by lleyn on 07.02.16.
 */
public class Lab3_2 {
    public static void main(String[] args) {
        int[] a = new int[50];
        int k = 0;
        for(int i = 1;i<=99;i++){
            if (i%2 != 0) {
                a[k] = i;
                k++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int j=a.length-1;j > 0;j--){
            System.out.print(a[j]+" ");
        }
    }
}
