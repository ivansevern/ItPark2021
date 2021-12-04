package lesson9;

public class AutomobileRunner {
    public static void main(String[] args) {
        final int n = 9;
        Automobile[] automobile = new Automobile[n];
        automobile[0] = new Car("Cabriolet", 500);
        automobile[1] = new Car("Sedan", 500);
        automobile[2] = new Car("Hachback", 500);
        automobile[3] = new Car("Universal", 500);
        automobile[4] = new Car("Jeep", 500);
        automobile[5] = new Car("Limuzin", 500);
        automobile[6] = new Truck("LongTrack", 1200);
        automobile[7] = new Truck("ShortTrack", 1200);
        automobile[8] = new Truck("HeavyTrack", 1200);
            for (int i = 0; i< 9; ++i) {
        String model = null;
        automobile[i].move(model);
    }

    }

}

