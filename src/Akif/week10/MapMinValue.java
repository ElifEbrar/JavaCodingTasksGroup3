package Akif.week10;
import java.util.HashMap;
import java.util.Map;
public class MapMinValue {
    public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<>();
            map.put("A", 5);
            map.put("B", 3);
            map.put("C", 9);

            int minValue = MapUtils.getMinValue(map);
            System.out.println("Minimum value: " + minValue);

    }public class MapUtils {
        public static <K, V extends Comparable<V>> V getMinValue(Map<K, V> map) {
            V minValue = null;
            for (V value : map.values()) {
                if (minValue == null || value.compareTo(minValue) < 0) {
                    minValue = value;
                }
            }
            return minValue;
        }
    }
}//Write a method that can return the minimum value from a map (DO NOT use sort method).


