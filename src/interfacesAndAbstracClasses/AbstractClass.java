package interfacesAndAbstracClasses;

public abstract class AbstractClass {
    private int someNum;

    public abstract void someMethod();

    public int getSomeNum() {
        return someNum;
    }

    public void setSomeNum(int someNum) {
        this.someNum = someNum;
    }
}
