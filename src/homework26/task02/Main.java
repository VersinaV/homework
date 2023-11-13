package homework26.task02;

public class Main {

  public static void printTvInfo(TV tv) {
    System.out.println("Model: " + tv.model);
    System.out.println("Color: " + tv.color);
    System.out.println("Diagonal: " + tv.diagonal + " Zoll");
    System.out.println("Preis: " + tv.price + " Euro");
    System.out.println("Year: " + tv.year + " Year");
    System.out.println("Weight: " + tv.weight + " Kg");
  }

  public static void main(String[] args) {
    TV tv = new TV("Samsung QE75Q60C", "Black", 75, 1.186, 2023, 32);
    printTvInfo(tv);

  }

}
