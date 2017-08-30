package io.zipcoder.zcw_demo_singleton.theory;

/**
 * Created by leon on 8/28/17.
 * Eager initialization
 */
public class SingletonInitializationEager {
    private static final SingletonInitializationEager instance = new SingletonInitializationEager();

    private SingletonInitializationEager() {
        // private constructor ensures
        // class can only be instantiated from within
    }

    public static SingletonInitializationEager getInstance() {
        return instance;
    }
}
