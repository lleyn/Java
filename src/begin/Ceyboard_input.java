package Lab3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by lleyn on 07.02.16.
 */
public class Ceyboard_input {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String a, b;
        try {
            a = bufferedReader.readLine();//читаем строку с клавиатуры
            b = bufferedReader.readLine();
        } catch (Exception ex) {
            System.out.println("Произшлв ощибка при попытке ввода имен.");
            return;
        }

    }
}
