package collection.set;

import java.util.Arrays;

public class HashStart4 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //{1, 2, 5, 8, 14, 99}
        System.out.println("hasIndex(1) = " + hasIndex(1));
        System.out.println("hasIndex(2) = " + hasIndex(2));
        System.out.println("hasIndex(5) = " + hasIndex(5));
        System.out.println("hasIndex(8) = " + hasIndex(8));
        System.out.println("hasIndex(14) = " + hasIndex(14));
        System.out.println("hasIndex(99) = " + hasIndex(99));

        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        //검색
        int searchValue = 14;
        int hashIndex = hasIndex(14);
        System.out.println("hashIndex = " + hashIndex);
        Integer result = inputArray[hashIndex]; // 0(1)
        System.out.println(result);
    }

    private static void add(Integer[] inputArray, int value) {
        int hasIndex = hasIndex(value);
        inputArray[hasIndex] = value;
    }

    static int hasIndex(int value) {
        return value % CAPACITY;
    }
}
