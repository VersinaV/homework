package homework33;
/*
Разработать метод, возвращающий массив типа char, в котором записан английский алфавит (маленькими буквами)

Подсказка: ASCII

Дополнительное задание: Сделать тоже самое, но возвращать тип String
 */

public class Main02 {

  public static char[] getAlphabetArray() {
    char[] alphabet = new char[26]; // Создание массива на 26 элементов (для букв от a до z)

    for (int i = 0; i < 26; i++) {
      alphabet[i] = (char)('a' + i); // Заполнение массива буквами английского алфавита
    }

    return alphabet;
  }

  public static String getAlphabetString() {
    char[] alphabetChars = getAlphabetArray(); // Получаем алфавит как массив символов

    // Создаем строку из массива символов алфавита
    String alphabetString = new String(alphabetChars);

    return alphabetString;
  }


  public static void main(String[] args) {
    System.out.println(getAlphabetArray());
    System.out.println(getAlphabetString());
  }
}
