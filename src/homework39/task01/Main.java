package homework39.task01;
/*
Творческое задание

Разработать любой класс на ваше усмотрение, который описывает любой предмет из реальной жизни.
Для него сделать нужные поля, конструктор с параметрами, конструктор по умолчанию и аксессоры.
Переопределить метод toString.
В main показать превращение объекта в строку и вывод его в консоль.

Примеры (идеи): бутылка, домашнее животное, кружка, электрический кабель, чайник,
обои, лампа, коробка, овощ, товар (в магазине), ткань, кровать.

Главное в выборе примера, это чтобы у предмета было больше трех важных характеристик, обязательно наличие
хотябы одного поля типа int и хотябы одного поля типа String

Классы, которые рассматривались на лекциях, практических и других ДЗ, приниматься не будут.

Это задание является повторением задания из урока 26, вы можете использовать класс из того задания.
 */

import java.util.Scanner;

/*2
Sosdati metod, kotrii indifitiruet wedeonii polizowateleam
 */
public class Main {

  public static Metal indetifyMetal(Metal someMetal) {
    Metal[] metals = {
        new Metal("Silver", 962, "White", 10.49, true),
        new Metal("Gold", 1064, "Yellow", 19.32, true),
        new Metal("Iron", 1538, "Gray", 7.87, false),
        new Metal("Copper", 1085, "Reddish", 8.96, false),
        new Metal("Aluminum", 660, "Silvery", 2.70, false),
        new Metal("Platinum", 1768, "Silver", 21.45, true),
        new Metal("Lead", 327, "Blueish", 11.34, false),
        new Metal("Nickel", 1455, "Metallic", 8.90, false),
        new Metal("Zinc", 419, "Bluish-white", 7.14, false),
        new Metal("Tin", 232, "Silver-white", 7.31, false)
    };

    for (int i = 0; i < metals.length; i++) {
      if (metals[i].equals(someMetal)) {
        return metals[i];
      }
    }
    return null;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Metal someMetal = new Metal();
    System.out.println("Enter name: ");
    someMetal.setName(scanner.nextLine());

    System.out.println("Enter melting temperature: ");
    someMetal.setMeltingTemperature(scanner.nextInt());

    scanner.nextLine();
    System.out.println("Enter color: ");
    someMetal.setColor(scanner.nextLine());

    System.out.println("Enter density: ");
    someMetal.setDensity(scanner.nextDouble());
    System.out.println("Enter 1 if its valuable and 0 if its not: ");
    someMetal.setValuable(scanner.nextInt() == 1);

    Metal identifiedMetal = indetifyMetal(someMetal);
    System.out.println(identifiedMetal == null
        ? "Metal is not identified! There is no such metak"
        : "Metal identified!\n" + identifiedMetal);
  }
}
