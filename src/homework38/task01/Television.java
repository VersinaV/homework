package homework38.task01;

import homework37.task01.RemoteControl;

public class Television {
  private String model;
  private int size;
  private int channels;
  private int frequency;
  private homework37.task01.RemoteControl remoteControl;
  private int currentChannel; // Добавляем переменную для текущего канала

  public Television(String model, int size, int channels, int frequency) {
    this.model = model;
    this.size = size;
    this.channels = channels;
    this.frequency = frequency;
    this.currentChannel = 0; // Устанавливаем начальное значение текущего канала
  }

  // Геттеры и сеттеры для остальных свойств

  public int getCurrentChannel() {

    return currentChannel;
  }

  public void setCurrentChannel(int channel) {
    if (channel >= 0 && channel < channels) {
      this.currentChannel = channel;
    }
  }

  public void setRemoteControl(homework37.task01.RemoteControl remoteControl) {
    this.remoteControl = remoteControl;
  }

  public RemoteControl getRemoteControl() {
    return remoteControl;
  }

  public int getFrequency() {
    return frequency;
  }
}
