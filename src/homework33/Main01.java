package homework33;
/*
Разработать метод, изменяющий знаки всех элементов целочисленного массива на противоположные
Продемострировать работу метода в свободной форме
Пример:
    Вводные данные: 1 5 7 -4 8 -3 -6
    Результат: -1 -5 -7 4 -8 3 6
 */

public class Main01 {

  public static void changeSigns(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = -arr[i]; // Изменение знака каждого элемента "-"
    }
  }

  public static void printArray(int[] arr) {
    // Итерируемся по каждому элементу массива
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]); // Выводим текущий элемент массива
      if (i != arr.length - 1) {   // для разделения элементов при выводе
        System.out.print(" ");
      }
    }
    System.out.println(); // В конце вывода добавляем новую строку для разделения следующего вывода
  }

  public static void main(String[] args) {
    int[] arr = {1, 5, 7, -4, 8, -3, -6};

    System.out.println("Массив до изменения знаков:");
    printArray(arr); // Вывод исходного массива

    changeSigns(arr); // Изменение знаков элементов

    System.out.println("Массив после изменения знаков:");
    printArray(arr); // Вывод измененного массива
  }
}
