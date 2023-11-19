package homework29.Task01;

public class Main {

  public static void main(String[] args) {

    TrafficLight trafficLight = new TrafficLight();

    // Проверка, можно ли перейти на красный свет
    System.out.println("Can cross the road on red light? " + trafficLight.canCrossTheRoad());
    // Установка зеленого света и проверка возможности перехода
    trafficLight.setCurrentColor(TrafficLightColor.GREEN);
    System.out.println("Can cross the road on yellow light? " + "I don't have to get ready to pass!" + trafficLight.canCrossTheYellow());
    System.out.println("Can cross the road on green light? " + trafficLight.canCrossTheRoad());
  }
}
