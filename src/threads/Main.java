package threads;

public class Main {
    public static void main(String[] args) {
        ExtThread extThread1 = new ExtThread("thread 1:");
        ExtThread extThread2 = new ExtThread("thread 2:");
        ExtThread extThread3 = new ExtThread("thread 3:");



        extThread1.start();
        extThread2.start();
        extThread3.start();
    }
}
