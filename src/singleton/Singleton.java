package singleton;

public class Singleton {

    static Singleton singleton = new Singleton();

    static Singleton getInstance() {
        return singleton;
    }

    private Singleton() {

    }

}
