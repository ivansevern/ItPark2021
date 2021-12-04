package lesson9;

public class Car extends Automobile {
    //private String model;
    private int maxDistance;

    public Car(String model, int distance) {
        super(model, distance);
    }

    public void move(String model) {
        maxDistance = 500;
        if (maxDistance >= distance) {
            System.out.println("Легковой автомобиль " + this.model +  " проедет " + distance);
        } else {
            System.out.println("Столько не проедет максимальная дистанция = " + maxDistance);
        }
    }
}

