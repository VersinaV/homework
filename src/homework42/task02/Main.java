package homework42.task02;
/*
Наследовать от класса Игрок три класса - Маг, Воин и Лучник.
Для мага определить поле количество маны (double).
Для воина определить поле количество брони (int).
Применить инкапсуляцию, переопределить методы equals, hashCode и toString так чтобы в них были учтены новые поля.
 */

public class Main {

  public static void main(String[] args) {
    Mage mage = new Mage("Merlin", 60, 150, 5);
    Warrior warrior = new Warrior("Conan", 25, 35, 6);
    Archer archer = new Archer("Legolas", 30, 45,20);
    Player player = new Player("Hero", 70, 70){};


    // Вывод информации о созданных существах
    System.out.println("Маг: " + mage);
    System.out.println("Воин: " + warrior);
    System.out.println("Лучник: " + archer);
    System.out.println("Игрок: " + player);
    System.out.println();

    // Пример атаки игрока на монстра
    player.takeDamage(archer);
    System.out.println("Игрок атакует Лучникa: ");
    player.takeDamage(archer);
    archer.shoot();
    System.out.println("Лучник Вистрелил: " + archer.getArrowCount() + " стрелки остались");

    // Проверка состояния после атаки
    System.out.println("Игрок после атаки: " + player.getName() + " (жив: " + player.isAlive() + ")");
    System.out.println("Лучник после нападения: " + archer.getName() + " (жив: " + archer.isAlive() + ")");

  }
}
