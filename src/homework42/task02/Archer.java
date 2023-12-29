package homework42.task02;

import java.util.Objects;

public class Archer extends Player {
  private int arrowCount; // Дополнительное поле для количества стрел

  public Archer(String name, int amountOfHealth, int attackPower, int arrowCount) {
    super(name, amountOfHealth, attackPower);
    this.arrowCount = arrowCount;
  }

  public int getArrowCount() {
    return arrowCount;
  }

  public void setArrowCount(int arrowCount) {
    this.arrowCount = arrowCount;
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
    Archer archer = (Archer) o;
    return arrowCount == archer.arrowCount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), arrowCount);
  }

  @Override
  public String toString() {
    return "Archer{" +
        "name='" + getName() + '\'' +
        ", amountOfHealth=" + getAmountOfHealth() +
        ", attackPower=" + attackPower +
        ", arrowCount=" + arrowCount +
        '}';
  }
  // Дополнительный метод для стрельбы
  public void shoot() {
    if (arrowCount > 0) {
      System.out.println("Лучник выпускает стрелу!");
      arrowCount--;
    } else {
      System.out.println("Стрелок не осталось!");
    }
  }
}
