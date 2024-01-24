package homework51.task03;

public class parseIp {
  /*
  byte[] parseIp(String ip);

    Читает строку в которой записан IPv4 и возвращает массив из 4 значений типа byte со значениями этого айпи
    Для этого сначала нужно разделить строку на подстроки по КАКОМУ-ТО признаку (намек на то что вам нужно понять, по какому именно),
    а потом использовать класс Byte чтобы превратить строки в числа.
    Выбросить исключение, если на любом этапе работы метода была ошибка в введенных данных.
    Примеры айпи: 127.0.0.1, 192.168.0.12, 77.156.21.33
    Обратите внимание, что в результате могут выйти отрицательные числа. Это вполне нормально (см. тему "целочисленное переполнение")
   */
  static byte[] parseIp(String ip) throws Exception {
    // Разделение строки на подстроки по точке
    String[] octets = ip.split("\\.");

    // Проверка количества полученных октетов
    if (octets.length != 4) {
      throw new Exception("Invalid IPv4 address format");
    }

    byte[] ipAddressBytes = new byte[4];

    try {
      // Преобразование строк в значения типа byte
      for (int i = 0; i < 4; i++) {
        int octetValue = Integer.parseInt(octets[i]);
        if (octetValue < 0 || octetValue > 255) {
          throw new Exception("Invalid octet value: " + octetValue);
        }
        ipAddressBytes[i] = (byte) octetValue;
      }
    } catch (NumberFormatException e) {
      throw new Exception("Invalid numeric format in IP address");
    }

    return ipAddressBytes;
  }

  public static void main(String[] args) {
    try {
      byte[] ipAddressBytes = parseIp("77.156.21.33");
      for (byte octet : ipAddressBytes) {
        System.out.println(octet);
      }
    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
    }
  }
}
