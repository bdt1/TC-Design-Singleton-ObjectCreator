package io.zipcoder.zcw_demo_singleton.theory;

/**
 * Created by leon on 8/28/17.
 */
public class SingletonInitializationLazy {
    private static SingletonInitializationLazy instance;

    private SingletonInitializationLazy() {
        // private constructor ensures
        // class can only be instantiated from within
    }

    public static SingletonInitializationLazy getInstance() {
        if (instance == null) {
            instance = new SingletonInitializationLazy();
        }
        return instance;
    }
}
