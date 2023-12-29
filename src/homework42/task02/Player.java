package homework42.task02;
/*
классы  Игрок, которые будут наследовать класс Существо.
Класс Игрок должен быть абстрактным.
 */

import homework42.task01.Entity;

public abstract class Player extends Entity {

  public Player(String name, int amountOfHealth, int attackPower) {
    super(name, amountOfHealth, attackPower);
  }
}
