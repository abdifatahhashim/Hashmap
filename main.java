package HashSet;

import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        HashSet<Integer> numbers = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        //cars.remove("Volvo");
        System.out.println(cars.contains("mazda"));
       // cars.size();
        for (String i : cars) {
            System.out.println(i);
        }
        // 13 78 2 14 6 36 35 40 80 76
        numbers.add(13);
        numbers.add(78);
        numbers.add(2);
        numbers.add(14);
        numbers.add(6);
        numbers.add(36);
        numbers.add(35);
        numbers.add(40);
        numbers.add(80);

       // for(int i = 1; i <= 100; i++) {
        for (int i = 0; i <= 100; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set!!!.");
            }
        }

    }
}

