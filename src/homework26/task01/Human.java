package homework26.task01;

public class Human {

  public String name;
  public int age;


  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void introduce() {

    System.out.println("Привет, меня зовут " + name + ", мне " + age + " лет!");
  }
}
