import java.util.InputMismatchException;
import java.util.Scanner;

class CurrencyConverterApp {
  private static final int SOURCE_CURRENCY = 1;
  private static final int TARGET_CURRENCY = 2;
  private static final int AMOUNT = 3;
  private static final int RESULT = 4;
  private static final int EXIT = 0;
  private static final int INCORRECT = -1;

  private Converter converter;
  private String sourceCurrency;
  private String targetCurrency;
  private double amount;

  public CurrencyConverterApp() {
    converter = new Converter();
  }

  public void run() {
    Scanner scanner = new Scanner(System.in);
    int command = scanner.nextInt();
    boolean run = true;
    while (run) {
      command = readCommand(scanner);
      switch (command) {
        case SOURCE_CURRENCY:
          selectSourceCurrency(scanner);
          break;
        case TARGET_CURRENCY:
          selectTargetCurrency(scanner);
          break;
        case AMOUNT:
          enterAmount(scanner);
          break;
        case RESULT:
          getResult();
          break;
        case EXIT:
          run = false;
          System.out.println("Спасибо за использование конвертера!");
          break;
      }
    }
  }

  private static int readCommand(Scanner scanner) {
    int command = INCORRECT;
    while (!isCommand(command)) {
      showMenu();
      System.out.print("Выберите команду: ");
      try {
        command = scanner.nextInt();
        if (isCommand(command)) {
          System.out.println("Вы ввели номер команды: " + command);
        }
      } catch (InputMismatchException e) {
        System.out.println("Некорректный ввод, введите номер команды");
      } finally {
        scanner.nextLine();
      }
    }
    return command;
  }

  private static boolean isCommand(int command) {
    switch (command) {
      case SOURCE_CURRENCY:
      case TARGET_CURRENCY:
      case AMOUNT:
      case RESULT:
      case EXIT:
        return true;
      default:
        return false;
    }
  }

  private void selectSourceCurrency(Scanner scanner) {
    System.out.println("Выберите исходную валюту: ");
    sourceCurrency = scanner.next();
    scanner.nextLine();
    if (!converter.isValidCurrency(sourceCurrency)) {
      // isValid пропишем в классе Конвертер
      System.out.println("У нас нет такой валюты");
      sourceCurrency = null;
    } else {
      System.out.println("Вы выбрали " + sourceCurrency);
    }
  }

  private void selectTargetCurrency(Scanner scanner) {
    // по аналогии: тут предлагаем выбрать желаемую валюту,
    // считываем сканнером
    // проверяем, есть ли такая валюта
  }

  private void enterAmount(Scanner scanner) {
    // тут предлагаем ввести исходную сумму,
    // считываем сканнером
  }

  private void getResult() {
    // делаем проверку:
    if (sourceCurrency == null || targetCurrency == null) {
      System.out.println("Что-то пошло не так с выбором валюты");
    } else {
      // прописываем логику расчётов:
      // получаем через getRate (см. класс Конвертер) нужный результат, кладём в переменную rate
      // amount (исходная сумма) * rate
      // распечатываем
    }
  }

  public static void showMenu() {
    System.out.println(SOURCE_CURRENCY + ". Выбор исходной валюты");
    System.out.println(TARGET_CURRENCY + ". Выбор конечной валюты");
    System.out.println(AMOUNT + ". Ввод исходной суммы");
    System.out.println(RESULT + ". Получение конечной суммы");
    System.out.println(EXIT + ". Выход");
  }
}
