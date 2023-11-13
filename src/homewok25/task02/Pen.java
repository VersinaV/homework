package homewok25.task02;

public class Pen {

  public static final int MAX_Level = 1000;

  public int Level = MAX_Level; // Устанавливаем начальное количество чернил в 1000.

  // Метод для написания текста.
  public void write(String text) {
    if (Level >= text.length()) {
      System.out.println(text);
      Level -= text.length();
    } else {
      System.out.println("Ручка не может написать этот текст из-за недостатка чернил.");
    }
  }

  // Метод для пополнения чернил в ручке.
  public void refill() {
    Level = 1000;
    System.out.println("Чернила пополнены до максимального уровня.");
  }

  // Метод для проверки уровня чернил.
  public void checkInk() {

    System.out.println("В ручке осталось чернил: " + Level);
  }

  public static void main(String[] args) {

  }

}
