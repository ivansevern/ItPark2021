package lesson8.hw8Teacher.animal;

public class Cow extends Animal {

    private static final String COW_CATEGORY = "Корова";

    public Cow() {
        super(COW_CATEGORY);
    }

    @Override
    public void voice() {
        System.out.println(this.name + " умеет мычать");
    }
}
