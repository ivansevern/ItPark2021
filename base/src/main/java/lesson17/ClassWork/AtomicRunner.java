package lesson17.ClassWork;

import lesson17.ClassWork.thread.AtomicCounterThread;

public class AtomicRunner {

    public static void main(String[] args) {
        AtomicCounter atomicCounter = new AtomicCounter();

        for (int i = 0; i < 5; i++) {
            new AtomicCounterThread(atomicCounter, i).start();
        }
    }
}
