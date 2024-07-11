package enumeration.ex0;

public class StringGradeEx0_1 {

    public static void main(String[] args) {
        int pirce = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("BASIC",pirce);
        int gold = discountService.discount("GOLD",pirce);
        int diamond = discountService.discount("DIAMOND",pirce);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);

    }
}
