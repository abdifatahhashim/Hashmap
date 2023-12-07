package Hashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Kenya", "Nairobi");
        capitalCities.put("Somalia", "Mogadishu");
        capitalCities.put("Tanzania", "Dodoma");
        capitalCities.put("Uganda", "Kampala");
        capitalCities.put("Ethiopia", "AddisAbaba");

        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());

        for (String I : capitalCities.keySet()) {
            System.out.println(I);
        }

        System.out.println("===============================");
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " \tvalue : " + capitalCities.get(i));

        }

        for (String i : capitalCities.keySet()){
              System.out.println("key: " + i + " \tvalue : " + capitalCities.get(i));


        }
    }
}

