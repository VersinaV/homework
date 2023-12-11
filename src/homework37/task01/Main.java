package homework37.task01;

import java.util.Scanner;

public class Main {
  /*
  Создать два класса - пульт и телевизор.
В обоих классах описать свойство "частота" (frequency).
В телевизоре описать свойство "текущий канал".
Описать в обоих классах конструкторы и аксесоры.
В пульте сделать методы чтобы:
1 Переключить канал вперед;
2 Переключить канал назад;
3 Переключить канал произвольно (передать номер канала).
Все методы должны принимать телевизор как параметр. Последний метод также должен принимать номер канала.
Учтите, что каналы не должны быть отрицательными.
Переключение канала должно происходить только в том случае, если частота пульта и телевизора совпадают.
Если введенный в третьем методе канал имеет неправильный номер, не делать ничего.

   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Создание телевизора и пульта с вымышленными частотами
    Television tv = new Television("Samsung", 65, 999, 9999);
    RemoteControl remote = new RemoteControl("UE65AU7175", "Black", 9999);

    remote.switchChannelForward(tv);
    System.out.println("Текущий канал: " + tv.getCurrentChannel());
    System.out.println("Ведите следусий канал: ");
    // Получение значения канала от пользователя.
    int channels = scanner.nextInt();
    if (channels >= 0) {
      remote.switchToChannel(tv, channels);
    }
    System.out.println("Переключиться на канал: " + tv.getCurrentChannel());
    // Переключить канал вперед
    remote.switchChannelForward(tv);
    System.out.println("Переключиться на канал вперед: " + tv.getCurrentChannel());
    // Переключить канал назад
    remote.switchChannelBackward(tv);
    System.out.println("Переключиться на канал назад: " + tv.getCurrentChannel());
  }
}


