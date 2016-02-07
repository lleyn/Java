package Lab3;


/**
 * Created by lleyn on 07.02.16.
 */
public class Lab3_3 {
    public static void main(String[] args) {
        int[] a = new int[15];
        for(int i = 0;i<a.length;i++){
                a[i] = (int)(Math.random()*10);
                System.out.print(a[i] + " ");
            }
        int k = 0;
        System.out.println();
        for (int j = 0;j<a.length;j++){
            if (a[j]%2==0) {
                k++;
            }
        }
        System.out.println(k+" четных чисел в массиве.");
    }
}
