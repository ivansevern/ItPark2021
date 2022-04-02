package lesson7.HomeWork;

public class Dog {
    String name;
    int dist;

    public Dog(String name) {
        this.name = name;
    }


    public void run(int run) {
        dist = 500;
        if(dist >= run && run > 0){
            System.out.println(name + " пробежал: " + run + " м.");
        }
        else {
            System.out.println(name + " столько не пробежит!");
        }
    }

    public void swim(int swim) {
        dist = 10;
        if(dist >= swim && swim > 0){
            System.out.println(name + " проплыл: " + swim + " м.");
        }
        else {
            System.out.println(name + " столько не проплывёт!");
        }
    }
}