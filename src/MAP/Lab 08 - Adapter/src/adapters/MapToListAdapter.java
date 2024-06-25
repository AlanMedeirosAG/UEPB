package adapters;

import java.util.*;

public class MapToListAdapter<E> implements List<E> {
    private Map<Integer, E> map;

    public MapToListAdapter(Map<Integer, E> map) {
        this.map = map;
    }

    @Override
    public boolean add(E e) {
        map.put(map.size(), e);
        return true;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsValue(o);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof List)) return false;
        List<?> list = (List<?>) o;
        return size() == list.size() && list.containsAll(map.values());
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= map.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + map.size());
        }
        return map.get(index);
    }


    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
        return map.values().iterator();
    }

    @Override
    public boolean remove(Object o) {
        for (Map.Entry<Integer, E> entry : map.entrySet()) {
            if (entry.getValue().equals(o)) {
                map.remove(entry.getKey());
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[map.size()];
        int i = 0;
        for (Object value : map.values()) {
            array[i] = value;
            i++;
        }
        return array;
    }


    @Override
    public <T> T[] toArray(T[] a) {
        return map.values().toArray(a);
    }

    //Outros metodos

    @Override
    public boolean containsAll(Collection<?> c) {
        return map.values().containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        int startIndex = map.size();
        for (E e : c) {
            map.put(startIndex++, e);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object o : c) {
            modified |= remove(o);
        }
        return modified;
    }

    @Override
    public E remove(int index) {
        return map.remove(index);
    }

    @Override
    public E set(int index, E element) {
        return map.put(index, element);
    }

    @Override
    public int indexOf(Object o) {
        for (Map.Entry<Integer, E> entry : map.entrySet()) {
            if (entry.getValue().equals(o)) {
                return entry.getKey();
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return indexOf(o);
    }

    //Funções não suportadas

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("AddAll está em um índice não suportado");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("RetainAll não é suportado");
    }

    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException("Add não é suportado");
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("ListIterator não é suportado");
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("ListIterator não é suportado");
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("SubList não é suportado");
    }
}

