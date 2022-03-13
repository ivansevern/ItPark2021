package lesson12.ClassWork.cornercase;

import lesson12.ClassWork.exception.UnnamedException;

public class InitialiazingBlock {

    private final String name;

    static {
        if (true/*new Random().nextBoolean()*/) {
            throw new UnnamedException("Неизвестный блок");
        }
    }

    public InitialiazingBlock()/* throws UnnamedException*/ {
//        throw new UnnamedException("Задайте имя объекту");
        this.name = "Unknown";
    }

    public InitialiazingBlock(String name)/* throws UnnamedException*/ {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
