package homewok25.task01;

public class Main {

  public static void main(String[] args) {

    Human nastea = new Human();
    nastea.name = "Настя";
    nastea.age = 36;

    Human vadim = new Human();
    vadim.name = "Вадим";
    vadim.age = 19;

    Human mariea = new Human();
    mariea.name = "Мария";
    mariea.age = 28;

    nastea.introduce();
    vadim.introduce();
    mariea.introduce();


  }
}
