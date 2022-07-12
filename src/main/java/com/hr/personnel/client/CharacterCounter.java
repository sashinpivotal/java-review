package com.hr.personnel.client;

import java.util.Random;

public class CharacterCounter {

    public static void main(String[] args) {
        int size = 3000;
        String testString = createTestString(size);
        long startTime = System.nanoTime();
        int count = countCharacter('c', testString);
        long currentTimeMillis = System.nanoTime();
        System.out.println(currentTimeMillis-startTime);
        System.out.println(count);
    }

    private static String createTestString(int size) {
        char[] chracterArray = {'a', 'b', 'c', 'd', 'e'};
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int index = random.nextInt(chracterArray.length);
            stringBuilder.append(chracterArray[index]);
        }
        return stringBuilder.toString();
    }

    private static int countCharacter(char c, String testString) {
        int count = 0;

        for (int i = 0; i < testString.length(); i++) {
            char charAt = testString.charAt(i);
            if (c == charAt) {
                count++;
            }
        }

        return count;
    }
}
