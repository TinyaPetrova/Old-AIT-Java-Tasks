package HomeworkHashMap;

public class MyHashMap<K, V> {

  private static final int DEFAULT_SIZE = 16;

  private static class Node<K, V> {

    K key;
    V value;
    Node<K, V> next;

    public Node(K key, V value) {
      this.key = key;
      this.value = value;
    }
  }

  private Node<K, V>[] table;

  public MyHashMap() {
    this.table = new Node[DEFAULT_SIZE];
  }

  public void put(K key, V value) {
    int hash = key.hashCode();
    int index = hash & table.length - 1;
    if (table[index] == null) {
      table[index] = new Node<>(key, value);
    } else {
      Node<K, V> current = table[index];
      Node<K, V> last = null;
      while (current != null) {
        if (current.key.equals(key)) {
          current.value = value;
          return;
        }
        last = current;
        current = current.next;
      }
      last.next = new Node<>(key, value);
    }
  }

  public V get(K key) {
    int hash = key.hashCode();
    int index = hash & (table.length - 1);
    Node<K, V> current = table[index];
    while (current != null) {
      if (current.key.equals(key)) {
        return current.value;
      }
      current = current.next;
    }
    return null;
  }
}
