package utils;

import java.util.Random;

public class RandomUtils {
    public static int getPositiveSingleDigitNumber() {
        Random random = new Random();
        return random.nextInt(10); // 0 ~ 9
    }
}
