package ru.itis;

// Узел
public class Node <K,V> {
    // ключ
    private K key;
    // значение
    private V value;
    // ссылка на следующий узел
    private Node<K,V> next;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;

    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node<K,V> getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
