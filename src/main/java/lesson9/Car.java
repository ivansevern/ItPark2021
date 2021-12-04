package lesson9;

public class Car extends Automobile {
    private int maxDistance;

    public Car(String model, int distance) {
        super(model, distance);
    }

    public void move(String model) {
        this.maxDistance = 500;
        if (this.maxDistance >= this.distance) {
            System.out.println("Легковой автомобиль " + this.model + " проедет " + this.distance);
        } else {
            System.out.println("Столько не проедет максимальная дистанция = " + this.maxDistance);
        }
    }
}

