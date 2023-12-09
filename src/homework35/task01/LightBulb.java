package homework35.task01;

public class LightBulb {

  private int barCode;
  private String manufacturer;
  private int brightness;
  private int power;
  private boolean rgb;
  private double price;

  public LightBulb(int barCode, String manufacturer, int brightness, int power, boolean rgb,
      double price) {
    this.barCode = barCode;
    this.manufacturer = manufacturer;
    this.brightness = brightness;
    this.power = power;
    this.rgb = rgb;
    this.price = price;
  }

  public double getPrice() {

    return price;
  }

  public void setPrice(double price) {

    this.price = price;
  }

  public int getBarCode() {
    return barCode;
  }

  public void setBarCode(int barCode) {
    this.barCode = barCode;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public int getBrightness() {
    return brightness;
  }

  public int getPower() {
    return power;
  }

  public boolean isRgb() {
    return rgb;
  }
}
