package homework42.task01;
/*
классы  Игрок, которые будут наследовать класс Существо.
Класс Игрок должен быть абстрактным.
 */

public class Player extends Entity {


  public Player(String name, int amountOfHealth, int attackPower) {
    super(name, amountOfHealth, attackPower);
  }
}
