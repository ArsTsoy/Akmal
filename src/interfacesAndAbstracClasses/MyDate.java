package interfacesAndAbstracClasses;

public abstract class MyDate implements DateUtilsInterface {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //region Init Variables
    private final static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private final static String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private final static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    //    private final static HashMap<String, Integer> monthValues =  new HashMap<>();
    private final static int[] monthValues = new int[]{
            0, 3, 3,
            6, 1, 4,
            6, 2, 5,
            0, 3, 5,
            6, 2
    };
    //endregion

    public static boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0 || year % 400 == 0;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int century = getYearValue(year);
        int last2digits = year % 100;
        int div2digits = last2digits / 4;
        int monthValue;
        month -= 1;
        if (isLeapYear(year) && month < 2) {
            monthValue = monthValues[month + 12];
        } else {
            monthValue = monthValues[month];
        }
        return (century + last2digits + div2digits + monthValue + day) % 7;
    }


    private static int getYearValue(int year) {
        year /= 100;
        switch (year % 4) {
            case 0:
                return 6;
            case 1:
                return 4;
            case 2:
                return 2;
            default:
                return 0;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public abstract boolean isTrue();

    @Override
    public String isValidDate(String date) {
        return null;
    }
}
