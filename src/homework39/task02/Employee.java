package homework39.task02;
/*
Создать класс Сотрудник, описать поля Имя, Зарплата и Должность.
Должность должна быть финальным полем.
 */

public class Employee {
  protected String name;
  protected final String position;
  protected double salary;

  public Employee(String name, String position, double salary) {
    this.name = name;
    this.position = position;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPosition() {
    return position;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", position='" + position + '\'' +
        ", salary=" + salary +
        '}';
  }
}
