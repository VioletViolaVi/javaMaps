import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> rugratsAdultAges = new HashMap<>();
        rugratsAdultAges.put("Kimiko", 27);
        rugratsAdultAges.put("Lil", 28);
        rugratsAdultAges.put("Phil", 28);
        rugratsAdultAges.put("Susie", 30);
        rugratsAdultAges.put("Angelica", 31);
        rugratsAdultAges.put("Chuckie", 29);
        rugratsAdultAges.put("Tommy", 26);
        System.out.println(rugratsAdultAges);

        System.out.println("\n");

        System.out.println(rugratsAdultAges.values()); // all values printed
        System.out.println(rugratsAdultAges.keySet()); // all keys printed
        System.out.println(rugratsAdultAges.get("Kimiko")); // value of said key name
        System.out.println(rugratsAdultAges.containsValue("Angelica")); // not found among the values
        System.out.println(rugratsAdultAges.containsValue(31)); // found among the values
        System.out.println(rugratsAdultAges.size()); // length of map

        System.out.println("\n");

        for (String rugratName : rugratsAdultAges.keySet()) { // iterate through key names
            System.out.println(rugratName);
        }

        System.out.println("\n");

        for (int rugratAge : rugratsAdultAges.values()) { // iterate through values
            System.out.println(rugratAge);
        }

//        for (int i = 0; i < rugratsAdultAges.keySet().size(); i++) {
//            for (int j = 0; j < rugratsAdultAges.values().size(); j++) {
//                System.out.println(i + ") " + rugratsAdultAges.keySet());
//            }
//        }

    }
}
