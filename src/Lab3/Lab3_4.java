package Lab3;


/**
 * Created by lleyn on 07.02.16.
 */
//Создать двумерный массив 8 на 5 из случафных чисел от 10 до 99
public class Lab3_4 {
    public static void main(String[] args) {
        int[][] a = new int[8][5];//Двумерный массив
        for (int j = 0;j < 8;j++ ) {//Цикл для строк
            for (int i = 0; i < 5; i++) {//Цикл для столбцов
                a[j][i] = (int) (Math.random() * 90 + 10);//Случайные величины
                System.out.format("%3d",a[j][i]);//Вывод массива параллельно заполнению
            }
            System.out.println();
        }
    }
}
