package lesson9.HomeWork;

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
    protected String model;
    protected int distance;





    public Automobile(String model, int distance) {
        this.distance = distance;
        this.model = model;
    }
    public abstract void move(String model, int distance);
}
