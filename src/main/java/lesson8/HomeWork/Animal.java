package lesson8.HomeWork;

public class Animal {
    private String name;
    private String voice;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    public void voice() {
        String str = "Голос!";
        System.out.println(this.name + "! " + str + " " + this.voice);
    }
}


