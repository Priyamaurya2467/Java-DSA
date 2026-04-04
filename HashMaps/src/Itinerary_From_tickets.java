import java.util.*;

public class Itinerary_From_tickets {
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        while(tickets.containsKey(start)) {
            System.out.print(start + " => ");
            start = tickets.get(start);
        }
        System.out.println(start);
    }

    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revmap = new HashMap<>();
        for (String key : tickets.keySet()) {
            //key -> key || value -> tickets.getKey()
            //for reversing = key -> tickets.getKey() || value -> key
            revmap.put(tickets.get(key), key);
        }
        for (String key : tickets.keySet()) {
            if (!revmap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
}


