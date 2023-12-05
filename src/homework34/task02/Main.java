package homework34.task02;

import java.util.Scanner;

public class Main {
  /*
  В классе Main сделать метод, который выведет тип планеты:
Безжизненный камень, обитаемаая планета, газовый гигант или ледяная планета.
В методе main предложить пользователю выбрать планету и в ответ вывести класификацию этой планеты,
используя разработанный ранее метод.
   */

  // Метод getPlanetName возвращает название планеты по выбранному числу
  public static String getPlanetName(int choice) {
    switch (choice) {
      case 1:
        return "Меркур";
      case 2:
        return "Венера";
      case 3:
        return "Земля";
      case 4:
        return "Марс";
      case 5:
        return "Юпитер";
      case 6:
        return "Сатурн";
      case 7:
        return "Уран";
      case 8:
        return "Нептун";
      default:
        return "Неизвестная планета";
    }
  }
  // Метод getPlanetType определяет тип планеты на основе её имени
  public static String getPlanetType(String planetName) {
    String planetType;
    switch (planetName) {
      case "Земля":
        planetType = "Обитаемая планета";
        break;
      case "Марс":
      case "Меркур":
      case "Венера":
      case "Юпитер":
      case "Сатурн":
        planetType = "Газовый гигант";
        break;
      case "Уран":
      case "Нептун":
        planetType = "Ледяная планета";
        break;
      default:
        planetType = "Неизвестная планета";
        break;
    }
    return planetType;
  }

  // Основной метод программы, где пользователь выбирает планету и выводится её тип
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Выберите планету:");
    System.out.println("1. Меркур");
    System.out.println("2. Венера");
    System.out.println("3. Земля");
    System.out.println("4. Марс");
    System.out.println("5. Юпитер");
    System.out.println("6. Сатурн");
    System.out.println("7. Уран");
    System.out.println("8. Нептун");

    int choice = scanner.nextInt();
    String planetName = getPlanetName(choice);
    System.out.println("Вы выбрали планету: " + planetName);
    String planetType = getPlanetType(planetName);

    System.out.println("Планета " + planetName + " относится к Класс: " + planetType);
  }
}
