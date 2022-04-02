package lesson10.ClassWork;

public record PrinterRecord(String text, String source) {

    public void print() {
        System.out.println(text());
    }
}
