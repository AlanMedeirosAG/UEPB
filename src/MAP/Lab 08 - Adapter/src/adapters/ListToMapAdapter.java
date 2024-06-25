package adapters;

import java.util.*;

public class ListToMapAdapter<K, V> implements Map<K, V> {

    private List<V> list;
    private List<K> keys;

    public ListToMapAdapter(List<V> list) {
        this.keys = keys;
        this.list = list;
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public boolean containsKey(Object key) {
        if (key instanceof Integer) {
            int index = (Integer) key;
            return index >= 0 && index < list.size();
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return list.contains(value);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ListToMapAdapter) {
            ListToMapAdapter<?, ?> other = (ListToMapAdapter<?, ?>) o;
            return list.equals(other.list);
        }
        return false;
    }

    @Override
    public V get(Object key) {
        if (key instanceof Integer) {
            int index = (Integer) key;
            if (index >= 0 && index < list.size()) {
                return list.get(index);
            }
        }
        return null;
    }

    @Override
    public int hashCode() {
        return list.hashCode();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public V put(K key, V value) {
        if (!(key instanceof Integer)) {
            throw new IllegalArgumentException("A chave deve ser um inteiro.");
        }
        int index = (Integer) key;
        if (index < 0) {
            throw new IllegalArgumentException("A chave deve ser um inteiro não negativo.");
        }
        while (index >= list.size()) {
            list.add(value);
        }
        return value;
    }


    @Override
    public V remove(Object key) {
        if (key instanceof Integer) {
            int index = (Integer) key;
            if (index >= 0 && index < list.size()) {
                return list.remove(index);
            }
        }
        return null;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public Collection<V> values() {
        return list;
    }

    //Funções não suportadas

    @Override
    public Set<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        throw new UnsupportedOperationException();
    }
}
