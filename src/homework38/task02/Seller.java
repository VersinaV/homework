package homework38.task02;

public class Seller extends Person {
  /*
  В классе продавца создать массив из Продуктов с размером 10.
Заполнить этот массив значениями из головы в конструкторе продавца либо в Main.
Разработать методы:
1 "огласить цену" - принимает наименование продукта и его количество, и возвращает цену
этого продукта или -1 если такого продукта нет либо нет соответствующего количества на складе
Подсказка: линейный поиск
2 "продать продукт" - принимает наименование продукта и количество, отнимает данный
продукт со склада (из массива)

   */

  private  Product[] products;

  public Seller(String name) {
    super(name);
    products = new Product[10];
    products[0] = new Product("Eggs", 24, 0.4);
    products[1] = new Product("Salt", 10, 1.0);
    products[2] = new Product("Sugar", 50, 2.0);
    products[3] = new Product("Vinegar", 20, 2.5);
    products[4] = new Product("Wine", 24, 5);
    products[5] = new Product("Beer", 24, 0.85);
    products[6] = new Product("Bred", 28, 1.5);
    products[7] = new Product("Sunflower oil", 25, 2.8);
    products[8] = new Product("Beef", 15, 7.9);
    products[9] = new Product("Butter", 15, 2.7);
  }

  public void setProduct(int index, Product product) {
    products[index] = product;
  }

  public Product getProduct(int index) {
    return products[index];
  }

  public double getProductPrice(String name, int amount) {
    for (int i = 0; i < products.length; i++) {
      if (products[i].getName().equals(name)) {
        if (products[i].getQuantity() >= amount) {
          System.out.println("Seller: Price will be " + amount * products[i].getPrice());
          return amount * products[i].getPrice();
        }
        break;
      }
    }
    System.out.println("Seller: Sorry we don't have");
    return -1;
  }

  public void sell(String name, int amount) {
    for (int i = 0; i < products.length; i++) {
      if (products[i].getName().equals(name)) {
        System.out.println("Seller: Here you go, your " + amount + " " + name);
        products[i].takeAmount(amount);
      }
    }
  }
}
