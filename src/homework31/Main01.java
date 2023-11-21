package homework31;

import java.util.Scanner;

public class Main01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    double c = scanner.nextDouble();
    double d = scanner.nextDouble();

    double result = a * (b - d) + (c + a) / d;
    System.out.println("Результат: " + result);
  }

}
