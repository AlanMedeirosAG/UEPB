package testes;


import adapters.ListToMapAdapter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class ListToMapAdapterTest {

    private ListToMapAdapter<Integer, String> adapter;
    private List<String> list;

    @BeforeEach
    public void setUp() {
        list = new ArrayList<>();
        adapter = new ListToMapAdapter<>(list);
    }

    @Test
    public void testClear() {
        adapter.clear();
        assertTrue(adapter.isEmpty());
    }

    @Test
    public void testContainsKeyValidKey() {
        adapter.put(0,"teste");
        assertTrue(adapter.containsKey(0));
    }

    @Test
    public void testContainsKeyInvalidKey() {
        assertFalse(adapter.containsKey(3));
    }

    @Test
    public void testContainsKeyNegativeKey() {
        assertFalse(adapter.containsKey(-1));
    }

    @Test
    public void testContainsKeyNonIntegerKey() {
        assertFalse(adapter.containsKey("not an integer"));
    }

    @Test
    public void testContainsValuePresent() {
        adapter.put(0,"A");
        assertTrue(adapter.containsValue("A"));
    }

    @Test
    public void testContainsValueNotPresent() {
        assertFalse(adapter.containsValue("D"));
    }

    @Test
    public void testEqualsSameContent() {
        adapter.put(0,"A");
        adapter.put(1,"B");
        adapter.put(2,"C");

        List<String> otherList = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ListToMapAdapter<Integer, String> otherAdapter = new ListToMapAdapter<>(otherList);
        assertTrue(adapter.equals(otherAdapter));
    }

    @Test
    public void testEqualsDifferentContent() {
        List<String> otherList = new ArrayList<>(Arrays.asList("X", "B", "C"));
        ListToMapAdapter<Integer, String> otherAdapter = new ListToMapAdapter<>(otherList);
        assertFalse(adapter.equals(otherAdapter));
    }

    @Test
    public void testGetValidKey() {
        adapter.put(0,"A");
        assertEquals("A", adapter.get(0));
    }

    @Test
    public void testGetInvalidKey() {
        assertNull(adapter.get(3));
    }

    @Test
    public void testGetNonIntegerKey() {
        assertNull(adapter.get("not an integer"));
    }

    @Test
    public void testIsEmptyFalse() {
        adapter.put(0,"A");
        assertFalse(adapter.isEmpty());
    }

    @Test
    public void testIsEmptyTrue() {
        adapter.clear();
        assertTrue(adapter.isEmpty());
    }

    @Test
    public void testPutValidKey() {
        adapter.put(1, "X");
        assertEquals("X", adapter.get(1));
    }

    @Test
    public void testPutNewIndex() {
        adapter.put(3, "D");
        assertEquals("D", adapter.get(3));
    }

    @Test
    public void testPutInvalidKeyNegative() {
        assertThrows(IllegalArgumentException.class, () -> adapter.put(-1,"E"));
    }

    @Test
    public void testRemoveValidKey() {
        adapter.put(1,"B");
        assertEquals("B", adapter.remove(1));
    }

    @Test
    public void testRemoveInvalidKey() {
        assertNull(adapter.remove(5));
    }

    @Test
    public void testRemoveNonIntegerKey() {
        assertNull(adapter.remove("not an integer"));
    }

    @Test
    public void testSize() {
        adapter.put(0,"A");
        adapter.put(1,"B");
        adapter.put(2,"C");
        assertEquals(3, adapter.size());
    }

    @Test
    public void testValuesContains() {
        adapter.put(0,"A");
        Collection<String> values = adapter.values();

        assertTrue(values.contains("A"));
    }

    @Test
    public void testValuesSize() {
        Collection<String> values = adapter.values();

        adapter.put(0,"A");
        adapter.put(1,"B");
        adapter.put(2,"C");

        assertEquals(3, values.size());
    }
}
