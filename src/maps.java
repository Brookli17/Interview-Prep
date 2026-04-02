import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Ramesh", 3);
        map.put("Suresh", 2);
        map.put("Dinesh", 1);

        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                result.add(entry.getKey());
            }
        }

        System.out.println(result);
    }
}