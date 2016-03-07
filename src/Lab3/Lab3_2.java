package Lab3;


/**
 * Created by lleyn on 07.02.16.
 * Создание массива из нечетных чесел от 1 до 99
 */

public class Lab3_2 {
    public static void main(String[] args) {
        int[] a = new int[50];//Массив нечетных чесел
        int k = 0;//Номер чесел в новом массиве
        for(int i = 1;i<=99;i++){
            if (i%2 != 0) {//Проверка на нечетность
                a[k] = i;
                k++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int j=a.length-1;j > 0;j--){//Вывод массива в обратном порядке
            System.out.print(a[j]+" ");
        }
    }
}
