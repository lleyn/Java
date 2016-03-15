package Lab4;

import Staff.Input;
import Lab2.Lab2_4;


/**
 * @author Lleyn
 */
public class Lab4 {
    public static void main(String[] args) {
        System.out.println("Введите границы случайных чисел для заполнения массива:");
        int a = Input.integer();
        int b = Input.integer();
        int[] c = new int[20];
        for (int i = 0; i < 20; i++) {
            c[i] = rand(a, b);
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }

    /**
     *
     * @param a 1-я граница промежутка
     * @param b 2-я граница промежутка
     * @return  Случайное число в промежутке от а до b
     */
    public static int rand(int a, int b){
        return (Lab2_4.min(a,b) + (int)(Math.random()*(Math.abs(a-b)+1)) );
    }

    /**
     * Выводит заданный массив
     * @param a Номер строки в 2-у мерном массиве для вывода
     * @param d 2-у мрный массив
     */
    public static void arr_p(int[][] d,int a) {
        for (int i = 0; i < d[a-1].length; i++) {
            System.out.print(d[a-1][i] + " ");
        }
    }

    /**
     * Сортировка массива
     * @param a Массив для сортировки
     * @return Отсортированный массив
     */
    public static int[] sort(int[][] a, int b) {
        b = b-1;
        for(int i = 0; i<a[b].length;i++) {
            for(int j = i; j<a[b].length;j++){
                if (a[b][i]>a[b][j]) {
                    int c = a[b][i];
                    a[b][i] = a[b][j];
                    a[b][j] = c;
                }
            }

        }
        return a[b];
    }



}