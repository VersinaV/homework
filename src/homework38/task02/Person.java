package homework38.task02;
/*
В классе Человек должно быть поле "имя" и метод "представиться", который будет выводить
приветствие и имя человека.
 */

public class Person {
  private String name;  // Поле для хранения имени человека

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void introduce() {
    // метод "представиться", который будет выводить приветствие и имя человека
    System.out.println("Привет, меня зовут " + name + ".");
  }

}
