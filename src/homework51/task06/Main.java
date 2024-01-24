package homework51.task06;

public class Main {

  /*
  int countOccurencies(String text, char letter);

    Считает сколько раз символ letter появляется в строке text и возвращает это число.
    Возвращает 0 если переданная строка равна null, пуста, либо этого символа нет в строке.
   */
  int countOccurencies(String text, char letter) {
    // Проверка на null или пустую строку
    if (text == null || text.isEmpty()) {
      return 0;
    }

    // Инициализация переменной count для хранения количества вхождений
    int count = 0;

    // Итерация по каждому символу в строке
    for (char c : text.toCharArray()) {
      // Проверка, равен ли текущий символ указанному символу
      if (c == letter) {
        // Увеличение счетчика, если обнаружено совпадение
        count++;
      }
    }

    // Возврат окончательного значения счетчика
    return count;
  }

  public static void main(String[] args) {
    Main main = new Main();
    String text = "Hello, Cohort 36!";
    char letter = 'l';
    int occurrences = main.countOccurencies(text, letter);
    System.out.println("Количество вхождений символа '" + letter
        + "' в строке '" + text + " : " + occurrences + " символа");

  }
}
