package lesson8;

/*
* Необходимо построить иерархию из животных, умеющих издавать специфические звуки
* (на примере: кошек, собак, попугаев и прочих).
* Необходимо создать массив общего предка Animal с вызовом полиморфной операции voice
* всех животных данного массива (с простым выводом издаваемого звука в консоль).
*/
public class AnimalsRunner {
    public static void main(String[] args){
        Animal[] animal = new Animal[3];
        animal[0] = new Cat("cat");
        animal[1] = new Dog("dog");
        animal[2] = new Parrot("parrot");

        for ( Animal m: animal) {
            m.voice();
        }
    }
}

