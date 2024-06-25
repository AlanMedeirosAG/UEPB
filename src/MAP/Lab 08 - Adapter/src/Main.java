import java.util.*;
import adapters.*;

public class Main {
    public static void main(String[] args) {

        System.out.print("Map adaptado para lista: ");

        System.out.println("\n");

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "um");
        map.put(2, "dois");
        map.put(3, "tres");

        MapToListAdapter<String> mapAdaptado = new MapToListAdapter<>(map);

        System.out.println("Contains: "+ mapAdaptado.contains("um"));
        System.out.println("Equals: " + mapAdaptado.equals(map));
        System.out.println("Get: " + mapAdaptado.get(2));
        System.out.println("isEmpty(F): " + mapAdaptado.isEmpty());

        Iterator<String> iterator = mapAdaptado.iterator();
        System.out.println("Iterator: ");
        while (iterator.hasNext()) {
            String numero = iterator.next();
            System.out.println(numero);
        }

        mapAdaptado.remove(1);
        System.out.println("Size: " + mapAdaptado.size());
        System.out.println("ToArray: " + Arrays.toString(mapAdaptado.toArray()));
        mapAdaptado.clear();
        System.out.println("IsEmpty(T): " + mapAdaptado.isEmpty());

        System.out.println("\n");


        System.out.print("Lista adaptada para map: ");

        System.out.println("\n");

        List<String> list = new ArrayList<>();
        list.add("um");
        list.add("dois");
        list.add("tres");
        List<Integer> keys = new ArrayList<>();
        keys.add(1);
        keys.add(2);
        keys.add(3);

        Map<Integer, String> listAdaptado = new ListToMapAdapter<>(list);

        System.out.println("Tamanho inicial da lista: " + listAdaptado.size());
        System.out.println("ContainsKey: " + listAdaptado.containsKey(2));
        System.out.println("ContainsValue(T): " + listAdaptado.containsValue("tres"));
        System.out.println("ContainsValue(F): " + listAdaptado.containsValue("quatro"));
        System.out.println("Equals: " + listAdaptado.equals(map));
        System.out.println("IsEmpty(F): " + listAdaptado.isEmpty());
        System.out.println("Put: " + listAdaptado.put(4, "quatro"));
        System.out.println("Remove: " + listAdaptado.remove(4));
        System.out.println("Remove: " + listAdaptado.remove(4, "quatro"));
        System.out.println("Size: " + listAdaptado.size());
        System.out.println("Get: " + listAdaptado.get(0));
        System.out.println("Values: " + listAdaptado.values());





    }
}
