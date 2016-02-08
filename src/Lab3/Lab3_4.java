package Lab3;


/**
 * Created by lleyn on 07.02.16.
 */
public class Lab3_4 {
    public static void main(String[] args) {
        int[][] a = new int[8][5];
        for (int j = 0;j < 8;j++ ) {
            for (int i = 0; i < 5; i++) {
                a[j][i] = (int) (Math.random() * 90 + 10);
                System.out.format("%3d",a[j][i]);
            }
            System.out.println();
        }
    }
}
