package lesson38.ClassWork.chain;

public class ChainExampleRunner {

    public static void main(String[] args) {
        final ChainExample chain = new ChainExample()
                .setId(1L)
                .setEnabled(true)
                .setName("Chain");
    }
}
