package lesson9;

public class Truck extends Automobile {
    public Truck(String model, int maxDistance) {
        super(model, maxDistance);
        this.maxDistance = maxDistance;
    }

    /*private int distance = 1200;*/

//    super(model,MaxDistance);
int maxDistance = 1200;
    public void move(int maxDistance) {
        System.out.println("go 1200" + maxDistance);
    }

    @Override
    public int getMaxDistance() {
        return super.getMaxDistance();
    }

    /*@Override
    public void move(int maxDistance) {

    }*/
}
