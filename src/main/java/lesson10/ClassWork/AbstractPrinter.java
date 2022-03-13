package lesson10.ClassWork;

public abstract class AbstractPrinter {

    private String source;

    public AbstractPrinter(String intro) {
        this.source = intro;
    }

    public String getSource() {
        return source;
    }
}
