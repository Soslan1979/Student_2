package study.alishev.lesson_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        //String path = "C:" + separator + "Users" + separator + "sosla" + separator + "OneDrive" + separator + "Рабочий " + "стол" + separator + "study" + separator + "test.txt";
        //File file = new File(path);
        //Чтение файла
        File file = new File("C:/Users/sosla/OneDrive/Рабочий стол/study/test.txt"); //альтернатива
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        File test_file = new File("test1"); // создание объекта файл, не сам файл!
        Scanner scanner1 = new Scanner(test_file); // сканер
        String line = scanner1.nextLine(); // Читаем файл/помещаем в переменную line файл test_file
        String[] stringNum = line.split(" "); // Создаем массив, заполняем его считывая файл test1, разделяем символы/слова по пробелу(метод split)
        int[] num = new int[3]; // Создаем массив new int[line.length()]
        int count = 0; // счетчик
        for (String number: stringNum) { // Перебираем массив
            num[count++] = Integer.parseInt(number); // Добавляем в массив num конвертируя String в int (было "1", стало 1)
        }
        System.out.println(Arrays.toString(num));

        scanner.close();
    }
}
