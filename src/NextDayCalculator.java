public class NextDayCalculator {

    public static final String CONCAT = "-";
    public static final int FIRSTOFMONTH = 1;

    public String getNextDay(int day, int month, int year) {
        if (day==31 || day==30){
            return FIRSTOFMONTH + CONCAT + (++month) + CONCAT + year;
        }
        return ++day + CONCAT + month + CONCAT + year;
    }
}
