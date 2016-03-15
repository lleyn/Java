package Lab4;

/**
 * @author
 */
public class Lab4_2 {

    public static void main(String[] args) {
        System.out.println("Введите a и b для заполнения массива случайными числами:");
        int a = Staff.Input.integer();
        int b = Staff.Input.integer();
        int[][] c = new int[5][10];
        for (int i = 0; i<5;i++){
            for (int j = 0; j<10;j++){
                c[i][j] = Lab4.rand(a,b);
                System.out.format("%3d",c[i][j]);
            }
            System.out.println();
        }
        System.out.println("Введите номер строки для сортировки и вывода:");
        int d = Staff.Input.integer();
        Lab4.arr_p(c,d);
        System.out.println();
        c[d] = Lab4.sort(c,d);
        Lab4.arr_p(c,d);
    }
}