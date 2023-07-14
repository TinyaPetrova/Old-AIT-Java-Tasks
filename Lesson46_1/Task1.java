package lesson46;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Вам дан словарь, состоящий из пар слов. Каждое слово является синонимом к парному ему слову. Все слова в словаре различны.

Для слова из словаря, записанного в последней строке, определите его синоним.

Формат ввода:
в первой строке - количество записей в словаре
в следующих строках - сами записи: первое слово (ключ) и второе слово (синоним), каждое слово в отдельной строке
в последней строке - слово, синоним для которого нужно вывести
  */

public class Task1 {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите кол-во записей в словаре: ");
    int numb = scanner.nextInt();
    Map<String, String> dictionary = new HashMap<>();
    for (int i = 0; i < numb; ++i) {
      String key = scanner.next();
      String synonym = scanner.next();
      dictionary.put(key, synonym);
    }
    String word = scanner.next();
    String synonym = dictionary.get(word);

    if (synonym != null) {
      System.out.println("Синоним слова " + word + " — " + synonym);
    } else {
      for (Map.Entry<String, String> entry : dictionary.entrySet()) {
        if (entry.getValue().equals(word)) {
          System.out.println("Синоним слова " + word + " — " + entry.getKey());
          return;
        }
      }
      System.out.println("Синоним слова " + word + " не найден");
    }
  }
}

