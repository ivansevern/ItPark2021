package lesson10.ClassWork;

import lesson10.ClassWork.inter.PrintableAndCheckable;

public class FilePrinter extends AbstractPrinter implements PrintableAndCheckable {

    public FilePrinter() {
        super("файл");
    }

    @Override
    public void print() {
        //TODO: размещения текста в файле
    }

    @Override
    public boolean check() {
        return false;
    }

    @Override
    public void otherPrint() {

    }
}
