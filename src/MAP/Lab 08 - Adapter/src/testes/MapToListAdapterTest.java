package testes;


import adapters.MapToListAdapter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class MapToListAdapterTest {
    private MapToListAdapter<String> adapter;
    private Map<Integer, String> map;

    @BeforeEach
    public void setUp() {
        map = new HashMap<>();
        adapter = new MapToListAdapter<>(map);
    }

    @Test
    public void testAddIncreasesSize() {
        adapter.add("A");
        assertEquals(1, adapter.size());
    }

    @Test
    public void testAddElement() {
        adapter.add("A");
        assertEquals("A", adapter.get(0));
    }

    @Test
    public void testClearIsEmpty() {
        adapter.add("A");
        adapter.add("B");
        adapter.clear();
        assertTrue(adapter.isEmpty());
    }

    @Test
    public void testContainsTrue() {
        adapter.add("A");
        assertTrue(adapter.contains("A"));
    }

    @Test
    public void testContainsFalse() {
        adapter.add("A");
        assertFalse(adapter.contains("B"));
    }

    @Test
    public void testEqualsSameList() {
        adapter.add("A");
        adapter.add("B");

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        assertTrue(adapter.equals(list));
    }

    @Test
    public void testEqualsDifferentList() {
        adapter.add("A");
        adapter.add("B");

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        assertFalse(adapter.equals(list));
    }

    @Test
    public void testGetElement() {
        adapter.add("A");
        assertEquals("A", adapter.get(0));
    }

    @Test
    public void testGetIndexOutOfBounds() {
        adapter.add("A");
        assertThrows(IndexOutOfBoundsException.class, () -> adapter.get(1));
    }

    @Test
    public void testIsEmptyTrue() {
        assertTrue(adapter.isEmpty());
    }

    @Test
    public void testIsEmptyFalse() {
        adapter.add("A");
        assertFalse(adapter.isEmpty());
    }

    @Test
    public void testIteratorHasNext() {
        adapter.add("A");
        Iterator<String> iterator = adapter.iterator();
        assertTrue(iterator.hasNext());
    }

    @Test
    public void testIteratorNext() {
        adapter.add("A");
        Iterator<String> iterator = adapter.iterator();
        assertEquals("A", iterator.next());
    }

    @Test
    public void testIteratorNoMoreElements() {
        adapter.add("A");
        Iterator<String> iterator = adapter.iterator();
        iterator.next();
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testRemoveElementTrue() {
        adapter.add("A");
        assertTrue(adapter.remove("A"));
    }

    @Test
    public void testRemoveElementFalse() {
        adapter.add("A");
        assertFalse(adapter.remove("B"));
    }

    @Test
    public void testRemoveContains() {
        adapter.add("A");
        adapter.remove("A");
        assertFalse(adapter.contains("A"));
    }

    @Test
    public void testSizeInitial() {
        assertEquals(0, adapter.size());
    }

    @Test
    public void testSizeAfterAdd() {
        adapter.add("A");
        adapter.add("B");
        assertEquals(2, adapter.size());
    }

    @Test
    public void testToArrayLength() {
        adapter.add("A");
        adapter.add("B");
        Object[] array = adapter.toArray();
        assertEquals(2, array.length);
    }

    @Test
    public void testToArrayContents() {
        adapter.add("A");
        adapter.add("B");
        Object[] array = adapter.toArray();
        assertEquals("A", array[0]);
    }

    @Test
    public void testToArrayWithType() {
        adapter.add("A");
        adapter.add("B");
        String[] strArray = adapter.toArray(new String[0]);
        assertEquals(2, strArray.length);
    }

    @Test
    public void testToArrayWithTypeContents() {
        adapter.add("A");
        adapter.add("B");
        String[] strArray = adapter.toArray(new String[0]);
        assertEquals("A", strArray[0]);
    }
}
