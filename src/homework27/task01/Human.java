package homework27.task01;

/*
Взять из задания 26 задачи 01 класс Human.
Применить к этому классу инкапсуляцию.
Для этого, для всех полей использовать модификатор private
Для каждого поля написать аксесоры.
В аксесорах реализовать минимальную логику, где это уместно на ваш взгляд.
 */

public class Human {

  private String name;
  private int age;


  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {

    return name;
  }

  public int getAge() {

    return age;
  }

  public void setName(String name) {

    this.name = name;
  }

  public void setAge(int age) {
    if (age < 0) {
      return;
    }
    this.age = age;
  }

  public void introduce() {

    System.out.println("Привет, меня зовут " + name + ", мне " + age + " лет!");
  }

}
