package lesson15.ClassWork;

public interface Copyable<T> {

    T copy(T origin, int copyCount);
}
