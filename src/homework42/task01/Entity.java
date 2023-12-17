package homework42.task01;

import java.util.Objects;

public abstract class Entity { // Существо - Entity

  protected String name;
  protected int amountOfHealth;
  protected int attackPower;

  public Entity(String name, int amountOfHealth, int attackPower) {
    this.name = name;
    this.amountOfHealth = amountOfHealth;
    this.attackPower = attackPower;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAmountOfHealth() {
    return amountOfHealth;
  }

  public void setAmountOfHealth(int amountOfHealth) {
    this.amountOfHealth = amountOfHealth;
  }

  public int getAttackPower() {
    return attackPower;
  }

  public void setAttackPower(int attackPower) {
    this.attackPower = attackPower;
  }

  // метод isAlive() возвращающий true если здоровье существа выше 0 и false если равно или ниже 0.
  public boolean isAlive() {   // Метод для проверки, живо ли существо
    return amountOfHealth > 0;
  }
  // Метод для уменьшения здоровья существа
  public void decreaseHealth(int amount) {
    amountOfHealth -= amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entity entity = (Entity) o;
    return amountOfHealth == entity.amountOfHealth && attackPower == entity.attackPower
        && Objects.equals(name, entity.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, amountOfHealth, attackPower);
  }

  @Override
  public String toString() {
    return "Entity{" +
        "name='" + name + '\'' +
        ", amountOfHealth=" + amountOfHealth +
        ", attackPower=" + attackPower +
        '}';
  }

  public void takeDamage(Entity entity) {
    int damage = entity.getAttackPower(); // Получаем силу атаки монстра
    this.amountOfHealth -= damage; // Уменьшаем здоровье текущего существа на значение атаки монстра

    if (this.amountOfHealth < 0) {
      this.amountOfHealth = 0; // Здоровье не может быть меньше Z
    }
  }
}