package HomeworkHashMap;

public class MySimpleHashMap<K, V> {

  private V[] values;

  public MySimpleHashMap() {
    this.values = (V[]) new Object[10];
  }

  public void put(K key, V value) {
    int hash = key.hashCode();
    int index = Math.abs(hash % 10);
    values[index] = value;
  }

  public V get(K key) {
    int hash = key.hashCode();
    int index = Math.abs(hash % 10);
    return values[index];
  }
}
