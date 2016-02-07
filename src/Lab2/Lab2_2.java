package Lab2;

/**
 * Created by lleyn on 06.02.16.
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Lab2_2 {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String Ns;
        String Ms;
        int N = 0;
        int M = 0;
        try {
            Ns = bufferedReader.readLine();//читаем строку с клавиатуры
            N = Integer.parseInt(Ns);//проверка на правильность ввода
        } catch (Exception ex) {
            System.out.println("Произшлв ощибка при попытке ввода N.");
            return;
        }

        try {
            Ms = bufferedReader.readLine();//читаем строку с клавиатуры
            M = Integer.parseInt(Ms);//проверка на правильность ввода
        } catch (Exception ex) {
            System.out.println("Произшлв ощибка при попытке ввода M.");
            return;
        }

        if ((N>0)&&(M>0)){
            for (int j = 1; j<=M;j++){

                for (int i = 1; i <= N; i++) {
                    System.out.print("8");
                }
                System.out.println();
            }
        }

    }
}