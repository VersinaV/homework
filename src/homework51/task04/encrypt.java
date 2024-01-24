package homework51.task04;

public class encrypt {
  /*
  String encrypt(String text);

    Шифрует строку text таким образом, чтобы ее нельзя было с легкостью прочитать.
    Можно использовать любой метод шифрования, либо взять предложенный.

    Предложеный метод: метод Цезаря. Все буквы сдвигаются на 3 вперед по алфавиту для зашифровки и на 3 назад
    по алфавиту для расшифровки.

    Подсказка: табличка ASCII
   */
  public static String encrypt(String text) {
    StringBuilder encryptedText = new StringBuilder();

    for (int i = 0; i < text.length(); i++) {
      char currentChar = text.charAt(i);

      if (Character.isLetter(currentChar)) {
        char shiftedChar = (char) (currentChar + 3);

        if ((Character.isUpperCase(currentChar) && shiftedChar > 'Z') ||
            (Character.isLowerCase(currentChar) && shiftedChar > 'z')) {
          shiftedChar -= 26;
        }

        encryptedText.append(shiftedChar);
      } else {
        encryptedText.append(currentChar);
      }
    }

    return encryptedText.toString();
  }


  public static void main(String[] args) {

    String originalText = "Hello, cohort 36!";
    String encryptedText = encrypt(originalText);

    System.out.println("Исходный текст: " + originalText);
    System.out.println("Зашифрованный текст: " + encryptedText);
  }

}
