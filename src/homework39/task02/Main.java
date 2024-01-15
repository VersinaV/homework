package homework39.task02;
/*
Создать класс Сотрудник, описать поля Имя, Зарплата и Должность.
Должность должна быть финальным полем.
Унаследовать от Сотрудника класс Разработчик, добавить ему метод "работать", который просто будет
выводить в консоль сообщение о том что разработчик усердно трудится над новой фичей.
Также унаследовать от Сотрудника класс Менеджер, добавить ему метод "заставить остальных работать",
который будет выводить в консоль грозный призыв ко всем разработчикам приступать к работе.

Обратите внимание: в конструкторы дочерних классов не нужно передавать должность.

Во всех классах переопределить toString.
В main создать массив типа Сотрудник, записать в него одного менеджера и 9 разработчиков
со случайными именами и зарплатой.
В Main создать метод "начать работу", который приймет массив сотрудников, и вызовет соответствующие методы
у каждого сотрудника (работать у разработчика, заставлять работать у менеджера)

Дополнительное задание: разработать метод "повышение", который принимает и возвщает сотрудника. Если переданный сотрудник
является разработчиком, сделать из него менеджера с такой же зарплатой.
Если же он является менеджером, повысить зарплату на 1000 евро.
Повысить одного разработчика и одного менеджера в main.
 */

import java.util.Random;

public class Main {

  public static void beginWorking(Employee[] employees) {
    for (int i = 0; i < employees.length; i++) {
      if (employees[i] instanceof Manager) {
        Manager manager = (Manager) employees[i];
        manager.makeOtherswork();
      }
      if (employees[i] instanceof Developer) {
        Developer developer = (Developer) employees[i];
        developer.work();
      }
    }
  }

  public static Employee raise(Employee employee) {
    if (employee instanceof Manager) {
      employee.setSalary( employee.getSalary() + 1000);
      return employee;
    }
    if (employee instanceof Developer) {
      return new Manager(employee.getName(), 5000);
    }
    return null;
  }

  public static void main(String[] args) {
    Employee[] employees = new Employee[10];
    employees[0] = new Manager("Juliet", 5000);
    String[] names = {"Jack", "John", "Juliet", "Julius", "Janette", "Johan"};
    Random random = new Random();
    for (int i = 1; i < employees.length; i++) {
      employees[i] = new Developer(names[random.nextInt(names.length)], (2000 + random.nextInt(100)) * 10);
    }
    int randomDev = random.nextInt(employees.length);
    employees[randomDev] = raise(employees[randomDev]);
    employees[0] = raise(employees[0]);
    beginWorking(employees);
  }
}