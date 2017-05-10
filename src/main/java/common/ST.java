package common;

/**
 * symbol table
 * Created by cehn on 2017/5/10.
 */
public interface ST<Key,Value> {
    void put(Key key, Value val);
    Value get(Key key);
    void delete(Key key);
    boolean contains(Key key);
    boolean isEmpty();
    int size();
    Iterable<Key> keys();
    Key min();
    Key max();
    Key floor(Key key);
    Key ceiling(Key key);
    int rank(Key key);
    Key select(int k);
    void deleteMin();
    void deleteMax();
    int size(Key lo, Key hi);
    Iterable<Key> keys(Key lo, Key hi);
}
