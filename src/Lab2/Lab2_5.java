package Lab2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lleyn on 06.02.16.
 * Сравнение имен
 */


public class Lab2_5 {
    public static void main(String[] args) {

        String a = Staff.Input.string();
        String b = Staff.Input.string();

        if (match(a) && match(b)) {//условие соответсвия заданию
            if (a.equalsIgnoreCase(b)) {
                System.out.println("Имена идентичны");
            } else if (a.length() == b.length()) {
                System.out.println("Длины имен равны");
            } else System.out.println("Имена не равны");

        }
        else System.out.println("Ошибка.В имени могут присутствовать только буквы.");
    }

    /**
     * Проверка на правльность введенного имени
     * @param s Проверяемое имя
     * @return True если имя введено без ошибок, иначе false
     */
    public static boolean match(String s){
        Pattern p = Pattern.compile("^[a-zA-ZА-Яа-я]+");//создаем регулярное выражение
        Matcher m = p.matcher(s);//Анализируем строку на совпадение с шаблоном
        return m.matches();//Возвращаем значение. обозначающее совпадение или несовпадение с шаблоном
    }
}
