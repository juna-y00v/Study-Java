package collection.map.test;

import java.util.*;

public class ItemPriceTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);


        // 정답 코드
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1000)) {
                list.add(entry.getKey());
            }
        }
        System.out.println(list);

/*      내가 쓴 코드
        HashSet<String> result = new HashSet<>();
        for (String fruit : map.keySet()) {
            if (map.get(fruit).equals(1000)) {
                result.add(fruit);
            }
        }
        System.out.println(result);
*/
    }
}
