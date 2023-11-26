package homework32;

import java.util.Scanner;

public class Main02 {
/*
Написать программу, которая выведет табличку умножения числа, которое введет пользователь.
Напечатать полностью примеры.
 */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(number + " * " + i + " = " + (number * i));
    }
  }
}
