package homework37.task01;

public class RemoteControl {

  private String model;
  private String color;
  private int frequency;

  public RemoteControl(String model, String color, int frequency) {
    this.model = model;
    this.color = color;
    this.frequency = frequency;
  }

  // Геттеры и сеттеры для свойств
  public int getFrequency() {
    return frequency;
  }
  public void switchChannelForward(Television tv) {
    if (this.frequency == tv.getFrequency()) {
      int newChannel = tv.getCurrentChannel() + 1;
      if (newChannel > 999) {
        tv.setCurrentChannel(1);
      } else {
        tv.setCurrentChannel(newChannel);
      }
    }
  }

  public void switchChannelBackward(Television tv) {
    if (this.frequency == tv.getFrequency()) {
      int newChannel = tv.getCurrentChannel() - 1; // 1-1= new channel = 0
      if (newChannel >= 0) {
        tv.setCurrentChannel(newChannel);
      } else {
        tv.setCurrentChannel(999);
      }
    }
  }

  public void switchToChannel(Television tv, int channel) {
    if (this.frequency == tv.getFrequency() && channel >= 0) {
      tv.setCurrentChannel(channel);
    }
  }
}