package lesson9;

/*
 * Необходимо организовать иерархию автомобилей, вводя базовый абстрактный класс Automobile
 * с методом передвижения move(distance).
 * Логика метода определяется непосредственно в его наследниках класса Car (легковой автомобиль) и
 * Truck (грузовик), которые следует сделать окончательными. Известно, что для Car максимальная
 * дистанция, которую может проехать на одном баке, составляет 500 км, а Truck 1200 км.
 * В логике класса-запускателя следует сгенерировать 10 разнотипных автомобилей, объединив их в
 * рамках массива, и на каждом объекте вызвать метод move со случайной дистанцией, ограниченной 1000 км.
 */

public abstract class Automobile {
    private String model;
    private int maxDistance;

    public abstract void move(int maxDistance);

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public Automobile(String model, int maxDistance) {
        this.model = model;
        this.maxDistance = maxDistance;
    }

}


