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

import java.util.Scanner;

public class Main02 {

  public static void main(String[] args) {
    System.out.println("Cколько костей выкидывать?");

    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    if (number >= 1 && number <= 6) {
      System.out.println("Kоличество костей: " + number + " выброшенныo");
    } else {
      System.out.println("Hет такого количества костей");
    }
  }
}
