package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.io.*;

/**
 * Задание №2
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение и запись данных
 * в текстовом режиме".
 */
public class Task2 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
             File input = new File("assets/countries.txt");
             File output = new File("countries_text_mode_output.txt");
             String text = read(input);
             write(output, text);
         }
        /*
         * TODO(Студент): Выполнить задание №2
         *
         * 1. Реализовать метод read.
         *
         *    При чтении файла следует пользоваться типами данных:
         *    Reader, FileReader.
         *
         *    Для сохранения прочитанных данных следует пользоваться
         *    классом StringBuilder.
         *
         * 2. Реализовать метод write.
         *
         *    При реализации метода следует пользоваться типами данных:
         *    Writer и FileWriter.
         *
         * 3. С использованием отладчика проверить корректность работы программы.
         */


    /**
     * Выполняет чтение указанного файла в текстовом режиме.
     *
     * <p>Весь текст файла возвращается в виде одного
     * экземпляра типа {@link String}.
     *
     * @param file файл
     * @return содержимое файла в виде текста.
     * @throws IOException в случае ошибок ввода-вывода.
     */

    private String read(File file) {
        StringBuilder textCreator = new StringBuilder();
        try {
            Reader reader = new FileReader(file);
            char[] buffer = new char[200];
            while (reader.ready()) {
                reader.read(buffer);
                textCreator.append(buffer);
            }
        } catch (IOException e) {
            System.out.println("There is a mistake");
        }
        return textCreator.toString();
    }

    /**
     * Выполняет запись текстоых данных в файл в текстовом
     * режиме.
     *
     * @param file файл
     * @param text текст
     * @throws IOException в случае ошибок ввода-вывода.
     *
     */


    private void write(File file, String text) {
        try (Writer writing = new FileWriter(file)) {
            writing.write(text);
        } catch (IOException e) {
            System.out.println("There is a mistake");}
    }
}
