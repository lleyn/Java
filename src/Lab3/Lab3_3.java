package Lab3;


/**
 * Created by lleyn on 07.02.16.
 * *
 */
public class Lab3_3 {
    public static void main(String[] args) {
        int[] a = new int[15];
        for(int i = 0;i<a.length;i++){//Заполнение массива случайными числами от 0 до 9
                a[i] = (int)(Math.random()*10);
                System.out.print(a[i] + " ");
            }
        int k = 0;
        System.out.println();
        for (int j = 0;j<a.length;j++){//Подсчет четных эллементов массива
            if (a[j]%2==0) {
                k++;//Счетчик четныых чисел
            }
        }
        System.out.println(k+" четных чисел в массиве.");
    }
}
