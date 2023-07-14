package lesson45;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Написать программу, которая:

- прочитает с клавиатуры количество чисел
- прочитает с клавиатуры сами числа и соберёт их в множество
- выведет полученные результаты на экран

Все числа, которые подаются на вход, целые.
 */

public class Task1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите кол-во чисел: ");
    int count = scanner.nextInt();

    Set<Integer> numbers = new HashSet<>();

    System.out.println("Введите числа, каждое с новой строки: ");
    for (int i = 0; i < count; i++) {
      int number = scanner.nextInt();
      numbers.add(number);
    }

    System.out.println("Полученное множество: ");
    for (int number : numbers) {
      System.out.println(number);
    }
  }
}

