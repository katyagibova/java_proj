package proj_25_26;

public class Unit<K,V> {
    private K key;
    private V value;

    Unit(K key, V value)
    {
        this.key=key;
        this.value=value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
