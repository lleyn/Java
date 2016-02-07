package Lab2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lleyn on 06.02.16.
 */
public class Lab2_5 {
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
        if (match(a) && match(b)) {//условие соответсвия заданию
            if (a.equals(b)) {
                System.out.println("Имена идентичны");
            } else if (a.length() == b.length()) {
                System.out.println("Длины имен равны");
            } else System.out.println("Имена не равны");

        }
        else System.out.println("Ошибка.В имени не могут присутствовать цифры.");
    }
    public static boolean match(String s){
        Pattern p = Pattern.compile("^[a-zA-ZА-Яа-я]+");//создаем регулярное выражение
        Matcher m = p.matcher(s);//Анализируем строку на совпадение с шаблоном
        return m.matches();//Возвращаем значение. обозначающее совпадение или несовпадение с шаблоном
    }
}
