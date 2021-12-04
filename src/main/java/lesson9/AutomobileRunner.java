package lesson9;

public class AutomobileRunner {
    public static void main(String[] args) {
        int rnd = 1000;
        int distance = 0;
        final int n = 9;


        Automobile[] automobile = new Automobile[n];
        automobile[0] = new Car("Cabriolet", random(distance));
        automobile[1] = new Car("Sedan", random(distance));
        automobile[2] = new Car("Hachback", random(distance));
        automobile[3] = new Car("Universal", random(distance));
        automobile[4] = new Car("Jeep", random(distance));
        automobile[5] = new Car("Limuzin", random(distance));
        automobile[6] = new Truck("LongTrack", random(distance));
        automobile[7] = new Truck("ShortTrack", random(distance));
        automobile[8] = new Truck("HeavyTrack", random(distance));

        for (int j = 0; j < n; ++j) {
            String model = null;
            automobile[j].move(model, distance);
        }

    }

    public static int random(int distance) {
        for (int i = 0; i < 9; i++) {
            //distance;
            i = Math.round((float) Math.random() * 1000);
            distance = i;
        }
        return distance;
    }

}

