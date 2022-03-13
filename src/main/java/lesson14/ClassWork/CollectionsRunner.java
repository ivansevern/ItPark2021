package lesson14.ClassWork;

import java.util.*;

public class CollectionsRunner {

    private static final List<String> WORDS = List.of("Виталий", "Василий");

    public static void main(String[] args) {
        for (String str : generate()) {
            System.out.println(str);
        }
//        Collections.sort(WORDS);
        List<String> anotherWords = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            anotherWords.add(i + "");
        }
        Collections.rotate(anotherWords, 9);
        System.out.println(anotherWords);
    }

    public static Collection<String> generate() {
        return new Random().nextBoolean() ? Collections.emptyList() : WORDS;
    }
}
