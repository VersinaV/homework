package homework42.task02;
/*
Для воина определить поле количество брони (int)
 */

import java.util.Objects;

public class Warrior extends Player {

  protected int amountOfArmor;

  public Warrior(String name, int amountOfHealth, int attackPower, int amountOfArmor) {
    super(name, amountOfHealth, attackPower);
    this.amountOfArmor = amountOfArmor;
  }

  public int getAmountOfArmor() {
    return amountOfArmor;
  }

  public void setAmountOfArmor(int amountOfArmor) {
    this.amountOfArmor = amountOfArmor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Warrior warrior = (Warrior) o;
    return amountOfArmor == warrior.amountOfArmor;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), amountOfArmor);
  }

  @Override
  public String toString() {
    return "Warrior{" +
        "amountOfArmor=" + amountOfArmor +
        ", name='" + name + '\'' +
        ", amountOfHealth=" + amountOfHealth +
        ", attackPower=" + attackPower +
        '}';
  }
}