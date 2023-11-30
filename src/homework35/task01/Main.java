package homework35.task01;

public class Main {

  public static void main(String[] args) {
    LightBulb lightBulb = new LightBulb(5070894, "Bosch", 800, 100, true, 15);
     //  Получаем информацию о лампочке
    System.out.println("Bar code: " + lightBulb.getBarCode());
    System.out.println("Manufacturer: " + lightBulb.getManufacturer());
    System.out.println("Brightness: " + lightBulb.getBrightness() + " lumens");
    System.out.println("Power: " + lightBulb.getPower() + " watts");
    System.out.println("Supports RGB: " + lightBulb.isRgb());
    System.out.println("Price: " +lightBulb.getPrice() + " $");

    lightBulb.setPrice(9.99);
    System.out.println("New price: " + lightBulb.getPrice() + "$");

  }
}
