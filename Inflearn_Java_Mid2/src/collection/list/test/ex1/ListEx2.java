package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> intList = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            intList.add(num);
        }

        System.out.println("출력");
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i));
            if (i < intList.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}

