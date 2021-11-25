package lesson8;

/*
* Необходимо построить иерархию из животных, умеющих издавать специфические звуки
* (на примере: кошек, собак, попугаев и прочих).
* Необходимо создать массив общего предка Animal с вызовом полиморфной операции voice
* всех животных данного массива (с простым выводом издаваемого звука в консоль).
*/
public class AnimalsRunner {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{};
        Animal dog = new Dog("Бобик", "brown", 2);
        dog.voice();

        Animal cat = new Cat("Мурзик", "Black", 1);
        cat.voice();


        Animal parrot = new Parrot("Кеша", "Yellow", 1);
        parrot.voice();

    }
}

