package homework42.task01;
/*
Создаем свою первую игру.

Разработать абстрактный класс Существо (Entity), для него определить поля имя (String),
количество здоровья (int) и сила атаки (int).
Добавить метод isAlive() возвращающий true если здоровье существа выше 0 и false если равно или ниже 0.
Применить инкапсуляцию, переопределить методы equals, hashCode и toString.

Добавить классы Монстр и Игрок, которые будут наследовать класс Существо.
Класс Игрок должен быть абстрактным.
 */

public class Main {

  public static void main(String[] args) {
    // Создание монстра
    Monster monster = new Monster("Dragon", 50, 100);

    // Создание игрока
    Player player = new Player("Hero", 60, 50){};

    // Вывод информации о созданных существах
    System.out.println("Монстр: " + monster);
    System.out.println("Игрок: " + player);

    // Пример атаки игрока на монстра
    System.out.println("Игрок атакует монстра:");
    player.takeDamage(monster);


    // Проверка состояния после атаки
    System.out.println("Монстр после атаки: " + monster.getName() + " (жив: " + monster.isAlive() + ")");
    System.out.println("Монстр после атаки: " + player.getName() + " (жив: " + player.isAlive() + ")");
  }
}


