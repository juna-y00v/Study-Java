package lang.math.test;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int count;
    private int[] lottoNumbers;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        while (count < lottoNumbers.length) {
            int number = random.nextInt(45) + 1;
            if (isUnique(number)) {
                lottoNumbers[count] = number;
                count++;
            }
        }
        return lottoNumbers;
    }

    private boolean isUnique(int number) {
        for (int i = 0; i < lottoNumbers.length; i++) {
            if (lottoNumbers[i] == number) {
                return false;
            }
        }
        return true;
    }
}
