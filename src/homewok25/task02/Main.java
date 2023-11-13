package homewok25.task02;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();

    Pen pen = new Pen();
    pen.write(text); // Это напечатается.
    pen.checkInk(); // В ручке осталось чернил:
    pen.refill(); // Чернила пополнены до максимального уровня.
    pen.checkInk(); // В ручке осталось чернил: 1000

  }
}
