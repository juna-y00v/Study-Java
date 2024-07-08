package lang.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(year, this.month, this.day);
    }

    public ImmutableMyDate withMonth(int newMonth) {
        return new ImmutableMyDate(this.year, month, this.day);
    }

    public ImmutableMyDate withDay(int newDay) {
        return new ImmutableMyDate(this.year, this.month, day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
