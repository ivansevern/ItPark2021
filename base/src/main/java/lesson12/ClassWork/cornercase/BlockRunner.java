package lesson12.ClassWork.cornercase;

public class BlockRunner {

    public static void main(String[] args) throws Exception {
        System.out.println("Пытаемся инициализировать блок");
        String name = null;
//        if (name == null) throw new UnnamedException("");
        InitialiazingBlock initialiazingBlock = new InitialiazingBlock();
        System.out.println(initialiazingBlock.getName());
    }
}
