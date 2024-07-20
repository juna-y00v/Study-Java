package collection.set.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.addAll(Arrays.asList(inputArr));

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
