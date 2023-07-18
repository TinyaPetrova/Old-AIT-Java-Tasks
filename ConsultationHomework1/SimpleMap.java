package HomeworkHashMap;

public class SimpleMap {

  private static class KeyValue {

    String key;
    int value;

    public KeyValue(String key, int value) {
      this.key = key;
      this.value = value;
    }
  }

  private KeyValue[] table;
  private int count;

  public SimpleMap() {
    this.table = new KeyValue[10];
    this.count = 0;
  }

  public void put(String key, int value) {
    for (int i = 0; i < count; i++) {
      if (table[i].key.equals(key)) {
        table[i].value = value;
        return;
      }
    }
    KeyValue newKeyValue = new KeyValue(key, value);
    table[count] = newKeyValue;
    count++;
  }
}
