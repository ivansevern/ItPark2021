package lesson8;

/*
* Необходимо построить иерархию из животных, умеющих издавать специфические звуки
* (на примере: кошек, собак, попугаев и прочих).
* Необходимо создать массив общего предка Animal с вызовом полиморфной операции voice
* всех животных данного массива (с простым выводом издаваемого звука в консоль).
*/
public class AnimalsRunner {
    public static void main(String[] args) {
//        Animal[] dog = new Animal[]{};
        Animal dog = new Dog();
        dog.voice();

        Animal cat = new Cat();
        cat.voice();

        Animal parrot = new Parrot();
        parrot.voice();

    }
}

