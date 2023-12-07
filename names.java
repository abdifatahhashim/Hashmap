package Hashmap;

import java.util.HashMap;

public class names {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap <>();
        people.put("ali", 24);
        people.put("yusuf", 23);
        people.put("Abdul", 21);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}



