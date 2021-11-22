package lesson7;

/*
* Создать классы: Собака, Домашний кот, Тигр (можно добавить 2-3 своих класса)
* Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина препятствия.
* У каждого животного есть ограничения на действия:
* бег: кот-200 м, собака - 500 м;
* плавание: кот - не умеет плавать, собака - 10 м.
* Результатом выполнения действия будет печать в консоль.
* Пример: dogBobik.run(150); -> "Бобик пробежал 150 м"
*  */
public class AbilityAnimals {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(5);
        dogBobik.swim(1);

        CatPet catTom = new CatPet("Том");
        catTom.run(150);
        catTom.swim(2);

        Tiger tiger = new Tiger("Тигр");
        tiger.run(190);
        tiger.swim(5);
    }
}
