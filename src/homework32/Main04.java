package homework32;
/*
Запросить у пользователя размер массива, потом сам массив целых чисел.
Проверить, является ли массив посортированым по возрастанию.
 */


import java.util.Scanner;

public class Main04 {

  public static void main(String[] args) {
    System.out.println("Введите размер массива:");
    Scanner scanner = new Scanner(System.in);

    int[] arr = new int[scanner.nextInt()];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " ");
    }

    System.out.println();
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[i -1]) {
        System.out.println("Masiv ne otsortiren");
        return;
      }
    }
    System.out.println("Masiv ostsortiren");
  }
}

