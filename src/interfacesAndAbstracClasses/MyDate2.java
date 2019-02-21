package interfacesAndAbstracClasses;

public class MyDate2 extends MyDate {

    public MyDate2(int year, int month, int day) {
        super(year, month, day);
    }

    @Override
    public boolean isTrue() {
        return false;
    }

    @Override
    public boolean isValidDate(int year, int month, int day) {
        return false;
    }

    @Override
    public boolean isValidDate(int day) {
        return false;
    }
}
