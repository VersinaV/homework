package homework46.task01;

import java.util.Scanner;

public class Main {

  /*
  Спросить у пользователя номер дня недели и вывести название этого дня недели в консоль.
Программа не должна принимать числа, которые находятся не в диапазоне от 1 до 7.
Т.е., должна переспрашивать число, если оно введено неправильно.
Для реализации превращения числа в название написать метод, в котором используется switch
Пример:
  Ввод:
  4
  Вывод:
  Четверг
   */
  public static String getDayOfWeekName(int dayNumber) {
    String dayName;
    switch (dayNumber) {
      case 1:
        dayName = "Monday";
        break;
      case 2:
        dayName = "Tuesday";
        break;
      case 3:
        dayName = "Wednesday";
        break;
      case 4:
        dayName = "Thursday";
        break;
      case 5:
        dayName = "Friday";
        break;
      case 6:
        dayName = "Saturday";
        break;
      case 7:
        dayName = "Sunday";
        break;
      default:
        dayName = "Invalid day";
        break;
    }
    return dayName;
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int number;
    do {
      System.out.println("Enter the day of the week (1-7): ");
      while (!scanner.hasNextInt()) {
        System.out.println("Please enter a number between 1 and 7");
        scanner.next();
      }
      number = scanner.nextInt();
    } while (number < 1 || number > 7);

    String dayOfWeek = getDayOfWeekName(number);
    System.out.println(dayOfWeek);

  }
}


