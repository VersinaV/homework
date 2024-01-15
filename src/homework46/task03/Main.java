package homework46.task03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
  /*
  Запросить у пользователя количество элементов массива.
Создать массив с таким размером и заполнить его случайными значениями от 0 до 100
Вывести массив на экран.
Отсортировать массив в порядке спадания, т.е. чтобы он начинался самым большим элементом и
заканчивался самым маленьким.
Выделить некоторые части кода в отдельные методы. Должны получиться такие методы:
1 Заполнение переданного массива случайными значениями
2 Печать массива в консоль
3 Сортировка массива

Подсказка: массив не нужно возвращать из метода. Все изменения которые вы сделаете над элементами массива внутри метода
сохранятся и в меине
   */

  // Метод для заполнения массива случайными значениями от 0 до 100
  private static void fillArrayWithRandomValues(int[] array) {
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(101); // Генерация случайного числа от 0 до 100
    }
  }

  // Метод для печати массива
  private static void printArray(int[] array) {
    for (int value : array) {
      System.out.print(value + ", ");
    }
    System.out.println();
  }


  // Метод для разворота массива, меняя местами элементы от начала к концу
  private static void reverseArray(int[] array) {
    // Инициализация двух индексов: start указывает на начало массива, end - на его конец
    int start = 0;
    int end = array.length - 1;
    while (start < end) {
      // Обмен значений между началом и концом массива
      int temp = array[start];
      array[start] = array[end];
      array[end] = temp;
      start++;
      end--;
    }
  }

  // Метод для сортировки массива в порядке убывания
  private static void sortArrayDescending(int[] array) {
    Arrays.sort(array); // Сортировка по возрастанию
    reverseArray(array);
  }

  public static void main(String[] args) {
    System.out.println("Введите количество элементов массива:");
    Scanner scanner = new Scanner(System.in);
    int arrayLength = scanner.nextInt();

    int[] array = new int[arrayLength];

    fillArrayWithRandomValues(array);

    System.out.println("Исходный массив:");
    printArray(array);

    sortArrayDescending(array);

    System.out.println("Отсортированный массив в порядке спадания:");
    printArray(array);

    scanner.close();
  }
}
