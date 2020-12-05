package proj_25_26;

import java.util.ArrayList;
import java.util.Iterator;

public class HashMapClass <K, V> implements HashMapInterface<K, V> {
    private final int size;
    private ArrayList<ArrayList<Unit<K, V>>> hash;

    HashMapClass(int size) {
        this.size = size;
        hash = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            hash.add(new ArrayList<>());
        }
    }

    @Override
    public void add(K key, V value) {
        int num = Math.abs(key.hashCode() % hash.size());
        if(hash.get(num).size()==0){
            hash.get(num).add(new Unit<>(key, value));
        }
        else{
            for (int i = 0; i < hash.get(num).size(); i++) {
                if(hash.get(num).get(i).getKey().equals(key)){
                    hash.get(num).set(i, new Unit<>(key, value));
                    break;
                }
            }
        }
    }

    @Override
    public V get(K key) {
        return getObject(key).getValue();
    }

    @Override
    public V remove(K key) {
        V value = get(key);
        hash.get(key.hashCode() % size).remove(getObject(key));
        return value;
    }

    private Unit<K, V> search(int i, K key) {
        if (i >= 0) {
            if (hash.get(key.hashCode() % size).get(i).getKey().equals(key)){
                return hash.get(key.hashCode() % size).get(i);
            }
            return search(i - 1, key);
        }
        return null;
    }

    private Unit<K, V> getObject(K key) {
        if (hash.get(key.hashCode() % size).size() != 0){
            return search(hash.get(key.hashCode() % size).size() - 1, key);
        }
        throw new NullPointerException("Wrong key");
    }

    @Override
    public Iterator<V> iterator() {
        return new SecondIterator<V>();
    }

    private class SecondIterator<V> implements Iterator<V> {
        int hIndex = 0;
        int lIndex = 0;

        @Override
        public boolean hasNext() {
            while (lIndex == hash.get(hIndex).size() && hIndex < size) {
                lIndex = 0;
                hIndex++;
            }
            return hIndex < size;
        }

        @Override
        public V next() {
            return (V) hash.get(hIndex).get(lIndex++).getValue();
        }
    }
}
