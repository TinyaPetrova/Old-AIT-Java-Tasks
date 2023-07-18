package HomeworkHashMap;

public class Main {

  public static void main(String[] args) {
    MyHashMap<String, Integer> map = new MyHashMap<>();
    map.put("Marsel", 29);
    map.put("Vika", 18);
    map.put("Vadim", 17);
    map.put("Kenan", 27);
    map.put("Наталья", 18);
    map.put("Вадос", 27);
    map.put("Дмитрий", 47);
    map.put("Marsel", 30);

    System.out.println(map.get("Marsel"));
    System.out.println(map.get("Vika"));
    System.out.println(map.get("Vadim"));
  }
}
