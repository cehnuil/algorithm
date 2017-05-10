package common;

import java.util.Arrays;

/**
 * ordered key
 * not thread safe
 * Created by cehn on 2017/5/10.
 */
public class OrderedST<Key extends Comparable<Key>, Value extends Comparable<Value>> implements ST<Key, Value> {

    private Node<Key, Value>[] tables;

    private class Node<K, V> {
        private K key;
        private V value;
        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public Key rankOfValue(Value value) {
        for (Node<Key,Value> node : tables) {

        }
        return null;
    }


    @Override
    public void put(Key key, Value val) {
        boolean append = true;
        int length = tables.length;
        Node<Key, Value> newNode = new Node<>(key, val);
        for (int i = 0; i < length; i ++) {
            Node<Key, Value> node = tables[i];
            if (node.getKey().equals(key)) {
                tables[i] = newNode;
                append = false;
                break;
            }
        }
        if (append) {
            tables = Arrays.copyOf(tables, length + 1);
            tables[length - 1] = newNode;
        }
    }

    @Override
    public Value get(Key key) {
        for (Node<Key, Value> node : tables) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
        }
        return null;
    }

    @Override
    public void delete(Key key) {

    }

    @Override
    public boolean contains(Key key) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterable<Key> keys() {
        return null;
    }

    @Override
    public Key min() {
        return null;
    }

    @Override
    public Key max() {
        return null;
    }

    @Override
    public Key floor(Key key) {
        return null;
    }

    @Override
    public Key ceiling(Key key) {
        return null;
    }

    @Override
    public int rank(Key key) {
        return 0;
    }

    @Override
    public Key select(int k) {
        return null;
    }

    @Override
    public void deleteMin() {

    }

    @Override
    public void deleteMax() {

    }

    @Override
    public int size(Key lo, Key hi) {
        return 0;
    }

    @Override
    public Iterable<Key> keys(Key lo, Key hi) {
        return null;
    }
}
