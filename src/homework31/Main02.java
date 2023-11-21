package homework31;
/*
"Кости"

Сделать программу, которая будет выкидывать кости.
Сначала программа должна спросить сколько костей выкидывать.
Если пользователь вводит 1 или 2, программа кидает соответствующее количество костей.
В противном случае, программа должна написать, что у нее нет такого количества костей.
В качестве "выкидывания костей" просто вывести нужное количество значений от 1 до 6.

Напоминание: игральные кости - кубик, на каждой стороне которого написаны числа в какой-либо форме.
Обычно это числа от 1 до 6
 */

import java.util.Random;
import java.util.Scanner;

public class Main02 {

  public static void main(String[] args) {
    System.out.println("Cколько костей выкидывать?");
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    System.out.println("Kоличество костей: " + number);

    if (number == 1) {
      System.out.println("Выпало: " + (random.nextInt(6) + 1));
    } else if (number == 2) {
      System.out.println("Выпало: " + (random.nextInt(6) + 1) + " и " + (random.nextInt(6) + 1));
    } else {
      System.out.println("Нет такого количества костей");


    }
  }
}
