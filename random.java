package HashSet;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arraylist = new int[10];
        for (int i = 0; i < 10; i++) {
            arraylist[i] = rand.nextInt(100) + 1;
            System.out.print(arraylist[i] + " ");
        }
        System.out.println();
    }
}

