package lesson7.HomeWork;

public class Tiger {
    String name = "тигр";
    int dist;

    public Tiger(String name) {
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
