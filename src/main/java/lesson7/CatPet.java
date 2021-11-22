package lesson7;

public class CatPet {
    String name;
    int dist;

    public CatPet(String name) {
        this.name = name;
    }

    public void run(int run) {
        dist = 200;
        if(dist >= run && run > 0){
            System.out.println(name + " пробежал: " + run + " м.");
        }
        else {
            System.out.println(name + " столько не пробежит!");
        }
    }

    public void swim(int swim) {
            System.out.println(name + " не умеет плавать!");
    }
}
