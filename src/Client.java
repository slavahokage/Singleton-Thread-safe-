import Singleton.Singleton;

/**
 * Created by USER on 11.07.2018.
 */
public class Client {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.hashCode());
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.hashCode());
    }
}
