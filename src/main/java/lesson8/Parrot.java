package lesson8;

public class Parrot extends Animal{
    private String name;
    private String color;
    private int age;

    public Parrot(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Parrot() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void voice() {
        String str = "Попка дурррак!";
        System.out.println(name + " : " + str);
    }
}
