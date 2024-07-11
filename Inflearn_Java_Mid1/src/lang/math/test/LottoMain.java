package lang.math.test;

import java.util.Arrays;

public class LottoMain {

    public static void main(String[] args) {
        LottoGenerator g = new LottoGenerator();

        int[] lottoNumbers = g.generate();
        System.out.println("로또 번호: " + Arrays.toString(lottoNumbers));

    }
}
