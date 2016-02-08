package Lab3;


/**
 * Created by lleyn on 07.02.16.
 */
public class Lab3_5 {
    public static void main(String[] args) {
        int[][] a = new int[7][4];
        int max = 0;
        int m = 0;
        for (int j = 0;j < 7;j++ ) {
            int k = 1;
            for (int i = 0; i < 4; i++) {
                a[j][i] = (int) (Math.random() * 11 -5);
                System.out.format("%3d",a[j][i]);
                k = k * Math.abs(a[j][i]);
            }
            if (k > max){
                max = k;
                m = j+1;
            }
            System.out.println();
        }
        System.out.println(m);
    }
}
