package ru.avalon.java.j20.labs.tasks;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Loader;
import ru.avalon.java.j20.labs.Task;

import java.io.*;
import java.util.HashSet;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.PropertyResourceBundle;
/**
 * Задание №5
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение локализованных ресурсов".
 */
public class Task5 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        /*
         * TODO(Студент): Выполнить задание №5
         *
         * 1. Реализовать метод read.
         *
         * 2. Прочитать ресурсы с использованием локализации по умолчанию.
         */

        //Меняем локализацию, поскольку дефолтной стоит русская
        Locale usLocale = new Locale("en", "Us");
        Locale.setDefault(usLocale);
        String path = "resources/strings/titles";
        ResourceBundle res = read(path);







         /* 3. Прочитать ресурсы с использованием локализации, отличной от той,
         *    которая задана по умолчанию.
         */
         //Проверяем как работает русская локализация
        Locale ruLocale = new Locale("ru");
        ResourceBundle res2 = read(path, ruLocale);

        //Проверяем локализацию, отличную от двух дефолтных
        Locale frLocale = new Locale("fr");
        ResourceBundle res3 = read(path, frLocale);


         /* 4. С использованием отладчика сравнить полученные ресурсы и
         *    проверить корректность работы программы.
         */

}

    /**
     * Выполняет чтение локализованных ресурсов с использованием
     * локализации по умолчанию.
     *
     * @param path путь к файлу ресурсов
     * @return новый экземпляр типа {@link ResourceBundle}
     */
    private ResourceBundle read(String path){

      ResourceBundle res = ResourceBundle.getBundle(path, Locale.getDefault());
        return res;
    }

    /**
     * Выполняет чтение локализованных ресурсов.
     *
     * @param path путь к файлу ресурсов
     * @return новый экземпляр типа {@link ResourceBundle}
     */
    private ResourceBundle read(String path, Locale locale) {
        ResourceBundle res = ResourceBundle.getBundle(path, locale);
        return res;
    }
}
