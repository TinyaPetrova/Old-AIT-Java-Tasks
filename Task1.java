package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите количество чисел: ");
    int amount = scanner.nextInt();
    System.out.println("Введите " + amount + " чисел/числа:");
    for (int i = 0; i < amount; ++i) {
      numbers.add(scanner.nextInt());
    }
    System.out.println("Нечётные числа: ");
    for (Integer number : numbers) {
      if (number % 2 != 0) {
        System.out.print(number + " ");
      }
    }
  }
}

