package Staff;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by lleyn on 07.02.16.
 */
public class Input {
    public static void main(String[] args){

    }
    public static int integer(){
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int a = 0;
        String a_s;
        try {
            a_s = bufferedReader.readLine();//читаем строку с клавиатуры
            a = Integer.parseInt(a_s);

        } catch (Exception ex) {
            System.out.println("Произошла ошибка при попытке ввода числа.");
        }
        return a;
    }

}