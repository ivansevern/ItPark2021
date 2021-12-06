package lesson11;

public abstract class Automobile {

    public Automobile(int autoNumber, int speedAuto, int weightAuto, int widthAuto, int heightAuto, int lengthAuto) {
        this.autoNumber = autoNumber;
        this.speedAuto = speedAuto;
        this.weightAuto = weightAuto;
        this.widthAuto = widthAuto;
        this.heightAuto = heightAuto;
        this.lengthAuto = lengthAuto;
    }

    protected int autoNumber;
    protected int speedAuto;
    protected int weightAuto;
    protected int widthAuto;
    protected int heightAuto;
    protected int lengthAuto;
}
