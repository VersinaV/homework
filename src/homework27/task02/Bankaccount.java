package homework27.task02;
/*
Разработать класс "Банковский счет".
Добавить поля для суммы денег на счету и номера счета.
Добавить конструктор с одним параметром "номер счета".
Применить инкапсуляцию: сделать поля приватными и написать аксесоры.
Написать аксесоры таким образом, чтобы нельзя было изменить номер счета.
Вместо сеттера, для поля "сумма" сделать два метода, один из которых позволит
снять переданную сумму со счета, а второй позволит положить сумму на счет.
Очевидно, что если пользователь попытается снять больше денег чем есть на счету,
эта операция не должна произойти и должно быть выведено сообщение "недостаточно средств".
 */

public class Bankaccount {

  private String accountNumber;
  private double balance;

  public Bankaccount(String accountNumber) {
    this.accountNumber = accountNumber;
    this.balance = 0.0;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  // Метод для снятия средств со счета
  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Сумма " + amount + " снята со счета. Новый баланс: " + balance);
    } else {
      System.out.println("Недостаточно средств на счете.");
    }
  }

  // Метод для внесения средств на счет
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Сумма " + amount + " зачислена на счет. Новый баланс: " + balance);
    } else {
      System.out.println("Некорректная сумма для внесения.");
    }
  }

  public void displayBalance() {
    System.out.println("Текущий баланс на счете " + accountNumber + ": " + balance);
  }

}
