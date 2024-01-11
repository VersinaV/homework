package homework47.task01;

import java.util.Scanner;

public class Main {
  /*
  Вспомним урок 11 задачу номер 5, в которой мы сделали симуляцию кассы. (код приведен ниже)
Тогда нам пришлось создать два отдельных массива для наименований и цен, теперь давайте объединим их в один.
Для этого создайте обобщенный класс Pair с двумя обобщенными типами (записать через запятую).
Естественно, что нужно будет создать два поля этих типов и определить для них аксесоры чтобы пользоваться классом.
После этого, переписать код таким образом, чтобы был один массив типа Pair<String, Double>
   */

  /*
    Сделать симуляцию кассы, где пользователь пишет название продукта и получает его цену
    */
  public static void main(String[] args) {
    // делаем массив с парами продукт-цена
    Pair<String, Double>[] productsAndPrices = new Pair[]{
        new Pair<>("Яблоко", 2.0),
        new Pair<>("Картошка", 1.5),
        new Pair<>("Огурец", 2.5),
        new Pair<>("Помидор", 3.0),
        new Pair<>("Лук", 1.0),
        new Pair<>("Виноград", 3.5)
    };




    Scanner scanner = new Scanner(System.in);
    String userChoice = scanner.nextLine();
    int index = -1;
    // ищем по размеру массива цен, но сравниваем названия продуктов
    // Очевидно, работает это только если массивы одинакового размера
    // Делать так можно только если массивы тесно связаны, как в нашем случае, это наименования и цены
    for (int i = 0; i < productsAndPrices.length; i++) {
      if (userChoice.equals(productsAndPrices[i].getFirst())) {
        index = i;
        break;
      }
    }
    // индекс найденного продукта используем для того чтобы
    if (index != -1) {
      System.out.println(productsAndPrices[index].getSecond());
    } else {
      System.out.println("Товара " + userChoice + " нет в магазине");
    }
    scanner.close();
  }
}
