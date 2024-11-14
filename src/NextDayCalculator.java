public class NextDayCalculator {

    public static final String CONCAT = "-";
    public static final int FIRSTOFMONTH = 1;

    public String getNextDay(int day, int month, int year) {
//        lam the nao de biet dc ngay nao la ngay cuoi cung cua thang
        int lastOfMonth = getLastOfMonth(month);
        if (day==lastOfMonth){
            return FIRSTOFMONTH + CONCAT + (++month) + CONCAT + year;
        }
        return ++day + CONCAT + month + CONCAT + year;
    }

    private static int getLastOfMonth(int month) {
        int lastOfMonth = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastOfMonth = 31;
                break;
            case 2:
                lastOfMonth = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastOfMonth = 30;
                break;
        }
        return lastOfMonth;
    }
}
