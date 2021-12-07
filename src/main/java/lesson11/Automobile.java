package lesson11;

public abstract class Automobile implements Moveable{
    protected int autoNumber;
    protected int speedAuto;
    protected int weightAuto;
    protected int widthAuto;
    protected int heightAuto;
    protected int lengthAuto;

    public Automobile(int autoNumber, int speedAuto, int weightAuto, int widthAuto, int heightAuto, int lengthAuto) {
        this.autoNumber = autoNumber;
        this.speedAuto = speedAuto;
        this.weightAuto = weightAuto;
        this.widthAuto = widthAuto;
        this.heightAuto = heightAuto;
        this.lengthAuto = lengthAuto;
    }

    @Override
    public void move() {

    }

    @Override
    public void currentMove() {
        System.out.println("Проезд разрешен!");
    }

    @Override
    public void blockWay() {
        System.out.println("Проезд не разрешен! ");
    }
}
