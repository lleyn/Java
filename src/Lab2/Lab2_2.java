package Lab2;

/**
 * Created by lleyn on 06.02.16.
 * Вывод прямоугольника m на n из "8"
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Lab2_2 {

    public static void main(String[] args) {
        int N = Staff.Input.integer();
        int M = Staff.Input.integer();

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