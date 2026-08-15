import java.util.HashMap;
import java.util.Map;

public class CreatHashMap {

    public static void main(String[] args) {

        // ============================================
        // 1. Create HashMap
        // ============================================

        Map<Integer, String> Name = new HashMap<>();


        // ============================================
        // 2. put() - Add key-value pair
        // ============================================

        Name.put(1, "Tony Stark");
        Name.put(2, "Steve Rogers");
        Name.put(3, "Thor");

        System.out.println(Name);


        // ============================================
        // 3. put() - Update existing value
        // ============================================

        Name.put(2, "Captain America");

        System.out.println(Name);


        // ============================================
        // 4. get() - Get value using key
        // ============================================

        System.out.println(Name.get(1));
        System.out.println(Name.get(2));


        // ============================================
        // 5. remove(key) - Remove using key
        // ============================================

        System.out.println(Name.remove(3));

        System.out.println(Name);


        // ============================================
        // 6. remove(key, value)
        // ============================================

        System.out.println(Name.remove(1, "Tony Stark"));

        System.out.println(Name);


        // ============================================
        // 7. containsKey() - Check key
        // ============================================

        System.out.println(Name.containsKey(2));
        System.out.println(Name.containsKey(10));


        // ============================================
        // 8. containsValue() - Check value
        // ============================================

        System.out.println(Name.containsValue("Captain America"));
        System.out.println(Name.containsValue("Iron Man"));


        // ============================================
        // 9. size() - Number of entries
        // ============================================

        System.out.println(Name.size());


        // ============================================
        // 10. isEmpty() - Check if Map is empty
        // ============================================

        System.out.println(Name.isEmpty());


        // ============================================
        // 11. getOrDefault(). Get value for key, or default if key not present
        // ============================================

        System.out.println(
                Name.getOrDefault(2, "Bruce Wayne")
        );

        System.out.println(
                Name.getOrDefault(10, "Bruce Wayne")
        );


        // ============================================
        // 12. putIfAbsent()
        // ============================================

        Name.putIfAbsent(2, "Iron Man");

        System.out.println(Name);

        Name.putIfAbsent(4, "Natasha Romanoff");

        System.out.println(Name);


        // ============================================
        // 13. replace()
        // ============================================

        Name.replace(4, "Natasha Romanoff", "Black Widow");

        System.out.println(Name);


        // ============================================
        // 14. keySet() - Get all keys
        // ============================================

        System.out.println(Name.keySet());


        // ============================================
        // 15. values() - Get all values
        // ============================================

        System.out.println(Name.values());


        // ============================================
        // 16. entrySet() - Get key-value pairs
        // ============================================

        System.out.println(Name.entrySet());


        // ============================================
        // 17. Traversing Map using entrySet()
        // ============================================

        for (Map.Entry<Integer, String> entry : Name.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }
    }
}