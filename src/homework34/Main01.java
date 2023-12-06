package homework34;
/*
Пользователь вводит название месяца маленькими буквами.
Вывести сезон, в котором будет этот месяц.
Для этого сделать метод с оператором switch, который принимает и возвращает String
Пример:
 */

import java.util.Scanner;

public class Main01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a month: ");
    String montName = scanner.next();

    String sezon;

    switch (montName) {
      case "january":
      case "december":
      case "february":
        sezon = "Winter";
        break;
      case "mart":
      case "april":
      case "mai":
        sezon = "Spring";
        break;
      case "june":
      case "juli":
      case "august":
        sezon = "Summer";
        break;
      case "september":
      case "october":
      case "november":
        sezon = "Autumn";
        break;
      default:
        sezon = "Invalid month number";
        break;
    }

    System.out.println("The season for the entered month is: " + sezon);

    }
  }

