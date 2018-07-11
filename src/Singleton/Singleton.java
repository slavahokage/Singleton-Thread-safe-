package Singleton;

/**
 * Created by USER on 11.07.2018.
 */
public class Singleton {

    private static volatile Singleton singleton;

    private Singleton(){}


    public static Singleton getInstance(){
        Singleton localInstance = singleton;
        if(localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = singleton;
                if (localInstance == null) {
                    singleton = localInstance = new Singleton();
                }
            }
        }
            return localInstance;
    }
}
