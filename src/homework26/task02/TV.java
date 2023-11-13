package homework26.task02;
/*
Разработать любой класс на ваше усмотрение, который описывает любой предмет из реальной жизни.
Классы, которые рассматривались на лекциях, приниматься не будут.
Для него сделать нужные поля, конструктор с параметрами и конструктор по умолчанию.
Также указать методы по желанию.
Примеры (идеи): бутылка, домашнее животное, кружка, электрический кабель, чайник,
обои, лампа, коробка, овощ, товар (в магазине), ткань, кровать.
Главное в выборе примера: чтобы у предмета было больше трех важных характеристик, и они были не только типа String
 */

public class TV {

  String model;
  String color;
  int diagonal;
  double price;
  int year;
  int weight;

  public TV(String model, String color, int diagonal, double price, int year, int weight) {
    this.model = model;
    this.color = color;
    this.diagonal = diagonal;
    this.price = price;
    this.year = year;
    this.weight = weight;
  }

  public TV() {
    this("Samsung QE75Q60C", "Black", 75, 1.186, 2023, 32);
  }

}
