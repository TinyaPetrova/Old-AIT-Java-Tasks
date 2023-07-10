package lesson44;

/*
Добавляем в чек вывод итоговой суммы:
- В написанный на занятии класс Row добавляем геттер getPrice.
 */
public class Row {

  private final String title;
  private final double price;

  public Row(String title, double price) {
    this.title = title;
    this.price = price;
  }

  @Override
  public String toString() {
    //return title + " =" + price;
    return  String.format("%s = %.2f", title, price);
  }

  public double getPrice() {
    return price;
  }
}
