package homework39.task02;
/*
Унаследовать от Сотрудника класс Разработчик, добавить ему метод "работать", который просто будет
выводить в консоль сообщение о том что разработчик усердно трудится над новой фичей.
 */

public class Developer extends Employee {

  public Developer(String name, double salary) {
    super(name, "Developer", salary);
  }

  public void work() {
    System.out.println("Developer " + name + " is working on some feature...");
  }

  @Override
  public String toString() {
    return "Developer{" +
        "name='" + name + '\'' +
        ", position='" + position + '\'' +
        ", salary=" + salary +
        '}';
  }
}
