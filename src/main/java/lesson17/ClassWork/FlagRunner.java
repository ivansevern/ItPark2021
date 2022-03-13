package lesson17.ClassWork;

import lesson17.ClassWork.thread.FlagThread;

import java.util.concurrent.atomic.AtomicBoolean;

public class FlagRunner {
    public static void main(String[] args) throws Exception {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        new FlagThread(atomicBoolean).start();
        Thread.sleep(5000);
        atomicBoolean.set(true);
    }
}
