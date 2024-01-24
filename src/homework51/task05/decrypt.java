package homework51.task05;

public class decrypt {

  /*
   String decrypt(String data);

    Делает противоположное действие со строкой data к тому
    Таким образом, происходит расшифровка, и должно быть получено исходное сообщение
   */

  static String decrypt(String data) {
    StringBuilder decrypted = new StringBuilder(data);
    return decrypted.reverse().toString();
  }

  public static void main(String[] args) {
    String originalText = "22012024";
    String decryptedOriginalText = decrypt(originalText);
    System.out.println("Расшифрованное исходное сообщение: " + decryptedOriginalText);

  }
}
