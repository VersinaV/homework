package homework51.task01;

public class isPalindrome {
  public static boolean isPalindrome(String word) {
    // Убираем пробелы и знаки препинания, приводим все буквы к нижнему регистру
    String cleanWord = word.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();

    // Проверяем, является ли очищенная строка палиндромом
    int length = cleanWord.length();
    for (int i = 0; i < length / 2; i++) {
      if (cleanWord.charAt(i) != cleanWord.charAt(length - 1 - i)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome("12:21"));         // true
    System.out.println(isPalindrome("тенет"));         // true
    System.out.println(isPalindrome("Пилип"));         // true
    System.out.println(isPalindrome("cabac"));         // true
    System.out.println(isPalindrome("Papa"));          // false
    System.out.println(isPalindrome("А роза упала на лапу Азора")); // true
  }
}
