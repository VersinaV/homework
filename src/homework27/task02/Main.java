package homework27.task02;

public class Main {

  public static void main(String[] args) {

    Bankaccount bankaccount = new Bankaccount("123456789");
    bankaccount.deposit(200);
    System.out.println("Money in account " + bankaccount.getBalance() + " is " + bankaccount.getAccountNumber());
    bankaccount.withdraw(400);
    System.out.println("Money in account " + bankaccount.getBalance() + " is " + bankaccount.getAccountNumber());
    bankaccount.withdraw(150);
    System.out.println("Money in account " + bankaccount.getBalance() + " is " + bankaccount.getAccountNumber());
  }
}
