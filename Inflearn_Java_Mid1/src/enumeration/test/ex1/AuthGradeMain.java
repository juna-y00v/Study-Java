package enumeration.test.ex1;

public class AuthGradeMain {

    public static void main(String[] args) {

        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println("grade=" + value.name() +
                    ", level=" + value.getLevel() +
                    ", 설명=" + value.getDescription());
        }
/*
        showInfo(AuthGrade.GUEST);
        showInfo(AuthGrade.LOGIN);
        showInfo(AuthGrade.ADMIN);
*/
    }
/*
    public static void showInfo(AuthGrade grade) {
        System.out.println("grade = " + grade.name() +
                ", level = " + grade.getLevel() +
                ", 설명 = " + grade.getDescription());
    }
*/
}
