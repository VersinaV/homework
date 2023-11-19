package homework29.Task01;

public class TrafficLight {

  private TrafficLightColor currentColor;

  public TrafficLight() {
    // По умолчанию начинаем со света "Красный"
    this.currentColor = TrafficLightColor.RED;
  }

  public TrafficLightColor getCurrentColor() {
    return currentColor;
  }

  public void setCurrentColor(TrafficLightColor currentColor) {
    this.currentColor = currentColor;
  }

  public boolean canCrossTheRoad() {
    return this.currentColor == TrafficLightColor.GREEN;
  }

  public boolean canCrossTheYellow() {
    return this.currentColor == TrafficLightColor.YELLOW;
  }

}


