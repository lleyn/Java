package Lab2;

/**
 * Created by lleyn on 06.02.16.
 * Минимум 4-х чисел
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Lab2_6 {

    public static void main(String[] args) {
        int a = Staff.Input.integer();
        int b = Staff.Input.integer();
        int c = Staff.Input.integer();
        int d = Staff.Input.integer();

        System.out.println(Lab2_4.min(Lab2_4.min(a, b), Lab2_4.min(c, d))+ " минимальое число");

}

}