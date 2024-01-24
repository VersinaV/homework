package homework51.task02;

import java.util.Scanner;

public class isPangram {
  /*
  * boolean isPangram(String sentence);

    Проверяет, является ли строка sentence панграммой (на английском) и возвращает истину если это так.
    Справка: панграмма - такое предложение, в котором каждая буква алфавита использована один раз
    Пример: The quick brown fox jumps over the lazy dog
   */
  static boolean isPangram(String sentence) {
    // Приводим строку к нижнему регистру и удаляем все символы, кроме букв
    sentence = sentence.toLowerCase().replaceAll("[^a-zA-Z]", "");

    // Создаем массив для хранения информации о встреченных буквах
    boolean[] alphabet = new boolean[26];

    // Проходим по каждой букве в строке
    for (int i = 0; i < sentence.length(); i++) {
      char currentChar = sentence.charAt(i);

      // Устанавливаем флаг для встреченной буквы
      alphabet[currentChar - 'a'] = true;
    }

    // Проверяем, были ли встречены все буквы алфавита
    for (boolean isPresent : alphabet) {
      if (!isPresent) {
        return false; // Если хотя бы одной буквы не было в строке, то это не панграмма
      }
    }

    return true; // Все буквы алфавита были встречены, строка - панграмма
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите фразу:");
    // "The quick brown fox jumps over the lazy dog";
    String sentence = scanner.nextLine();
    boolean result = isPangram(sentence);

    if (result) {
      System.out.println("Строка является панграммой.");
    } else {
      System.out.println("Строка не является панграммой.");
    }
  }
}
