package lesson17.ClassWork;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicCounter {

    private AtomicLong value = new AtomicLong(0);

    public long getValue() {
        return value.get();
    }

    public long incrementAndGet() {
        return value.incrementAndGet();
    }

}
