package homework30;
/*
Создать переменные a, b, c и d и задать им какие-то значения из головы.
Посчитать результат выражения (записано математически): a(b-d)+ca/d
Вывести результат в консоль.
Пример вывода:
    Результат: 2,23
 */

public class Main02 {

  public static void main(String[] args) {

    int a = 3;
    int b = 5;
    double c = 7;
    int d = 5;

    double result = a * (b - d) + (c + a) / d;
    System.out.println("Результат: " + result);
  }
}
