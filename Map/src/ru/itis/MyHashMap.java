package ru.itis;

import java.util.List;

/**
 * Created by Guzel on 26.04.2017.
 */
public class MyHashMap<K, V> {
    private int bucketsCount = 2;
    // массив узлов
    private Node<K, V> nodes[];

    public MyHashMap() {
        nodes = new Node[bucketsCount];
    }

    public void put(K key, V value) {
        // вычисляем хешкод и получаем позицию
        int position = getBucketPosition(key);
        // создаем новый узел для пары Ключ-Значение
        Node<K, V> newNode = new Node<>(key, value);
        // если в списке под данной позиции что-то есть
        if (nodes[position] != null) {
            // кладем новый узел в начало
            Node<K, V> temp = nodes[position];
            newNode.setNext(temp);
        }

        nodes[position] = newNode;
    }

    public V get(K key) {
        // получаем позицию
        int position = getBucketPosition(key);
        // если первый элемент списка содержит искомый ключ
        if (nodes[position].getKey().equals(key)) {
            // сразу возвращаем значение
            return nodes[position].getValue();
        } else {
            // если ключ не под первым узлом списка
            // заводим указатель на первый узел списка
            Node<K,V> current = nodes[position];
            // и бежим по нему
            while (current != null) {
                // если нашли ключ - возвращаем значение
                if (current.getKey().equals(key)) {
                    return current.getValue();
                }
                // идем дальше, если еще не нашли
                current = current.getNext();
            }
        }
        // если совсем ничего не нашли - возвращаем null
        return null;
    }

    private int getBucketPosition(K key) {
        return key.hashCode() % bucketsCount;
    }
}
