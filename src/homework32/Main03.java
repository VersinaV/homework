package homework32;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя число в диапазоне от 1 до 10 (включительо).
Если пользователь написал неподходящее число, программа спрашивает еще раз.
Таким образом, програма должна продолжать спрашивать, пока пользователь не введет подходящее число.
Пример окончательного вывода одной программы:
 */
public class Main03 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int number;

    do {
      System.out.println("Введите число от 1 до 10:");
      number = scanner.nextInt();

    } while (number < 1 || number > 10);
    System.out.println("Вы ввели " + number + ". Спасибо!");
  }
}
