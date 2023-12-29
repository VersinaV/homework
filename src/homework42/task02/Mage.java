package homework42.task02;

import java.util.Objects;

/*
Для мага определить поле количество маны (double)
 */
public class Mage extends Player {

  protected double amountOfMana;

  public Mage(String name, int amountOfHealth, int attackPower, double amountOfMana) {
    super(name, amountOfHealth, attackPower);
    this.amountOfMana = amountOfMana;
  }

  public double getAmountOfMana() {
    return amountOfMana;
  }

  public void setAmountOfMana(double amountOfMana) {
    this.amountOfMana = amountOfMana;
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
    Mage mage = (Mage) o;
    return Double.compare(amountOfMana, mage.amountOfMana) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), amountOfMana);
  }

  @Override
  public String toString() {
    return "Mage{" +
        "amountOfMana=" + amountOfMana +
        ", name='" + name + '\'' +
        ", amountOfHealth=" + amountOfHealth +
        ", attackPower=" + attackPower +
        '}';
  }
}
