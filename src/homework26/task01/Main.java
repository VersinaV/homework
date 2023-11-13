package homework26.task01;
/*
Скопировать классы из задания 25 задачи 01 в текущую папке.
Для класса Human описать конструктор с параметрами, который позволит инициализировать все поля,
передав значения как аргументы.
Переписать main таким образом, чтобы он использовал конструктор.
 */

public class Main {

  public static void main(String[] args) {

    Human nastea = new Human("Настя", 36);
    Human vadim = new Human("Вадим", 19);
    Human mariea = new Human("Мария", 28);

    nastea.introduce();
    vadim.introduce();
    mariea.introduce();
  }
}
