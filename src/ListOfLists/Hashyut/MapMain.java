package ListOfLists.Hashyut;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        HashMap<String, Integer> mapping = new HashMap<>();

        mapping.put("joni", 90);
        mapping.put("jono", 25);

        System.out.println("""
                1. Input
                2. Remove
                3. Display
                4. Exit
                """);

//        double avg = 0;
        for (String key : mapping.keySet()) {
//            Integer nilai = mapping.get(key);
//            avg += nilai;
            System.out.println(key);
        }
//
//        avg /= mapping.size();
//        System.out.println(avg);
    }
}
