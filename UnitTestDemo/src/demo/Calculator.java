package demo;

import java.util.Random;

public class Calculator {

    public int sum(int num1, int num2) {
        if (num1 > 100 || num2 > 100) {
            throw new IllegalArgumentException();
        }
        return num1 + num2;
    }

    public int random() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
