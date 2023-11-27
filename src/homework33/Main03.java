package homework33;
/*
Генератор чисел фибоначчи

Разработать метод, который сгенерирует первые n чисел последовательности фибоначчи.
n передать как параметр в метод.
Результат нужно записать в массив и вернуть этот массив.
Последовательность фибоначчи это такая последовательность, в которой первые числа 0 и 1, и каждое следующее число
это сумма предыдущих двух чисел.
Продемострировать работу метода в свободной форме.

Дополнительное задание (сложное): выполнить задачу использовав рекурсию
 */

public class Main03 {
  public static int[] generateFibonacci(int n) {
    if (n <= 0) {
      return new int[0]; // возвращаем пустой массив, если n меньше или равно 0
    }

    int[] fibonacciSequence = new int[n];
    for (int i = 0; i < n; i++) {
      fibonacciSequence[i] = fibonacci(i);
    }

    return fibonacciSequence;
  }

  public static int fibonacci(int n) {
    if (n <= 1) {
      return n;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  public static void main(String[] args) {
    int n = 10; // количество чисел Фибоначчи для генерации
    int[] fibSequence = generateFibonacci(n);

    System.out.print("Первые " + n + " чисел последовательности Фибоначчи: ");
    for (int num : fibSequence) {
      System.out.print(num + " ");
    }
  }
}
