package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnable=new MyRunnable();

        runnable.run();
        MyThread myThread= new MyThread();
        myThread.setDaemon(true);
        myThread.run();
    }
}
