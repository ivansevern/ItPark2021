package lesson9.HomeWork;

public  class Truck extends Automobile{
    private int maxDistance;

    public Truck(String model, int distance) {
        super(model, distance);
    }

    public void move(String model, int distance) {
        this.maxDistance = 1200;
        if (this.maxDistance >= this.distance) {
            System.out.println("Грузовой автомобиль " + this.model + " проедет " + this.distance);
        } else {
            System.out.println(this.model + " без запрвки может проехать, только = " + this.maxDistance);
        }

    }
}
