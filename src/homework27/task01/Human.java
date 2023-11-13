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

  private String getName() {
    return name;
  }

  private int getAge() {
    return age;
  }
  private void setName(String name) {
    this.name = name;
  }

  private void setAge(int age) {
    this.age = age;
  }

  public void introduce() {

    System.out.println("Привет, меня зовут " + name + ", мне " + age + " лет!");
  }

}
