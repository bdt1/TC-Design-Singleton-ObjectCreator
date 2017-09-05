package io.zipcoder.zcw_demo_singleton.practical;

/**
 * Created by leon on 8/28/17.
 */
public class CreatorSingletonLazy implements ObjectCreator {
    private static CreatorSingletonLazy instance;

    private CreatorSingletonLazy() {

    }

    public static CreatorSingletonLazy getInstance() {
        if (instance == null) {
            instance = new CreatorSingletonLazy();
        }
        return instance;
    }

    public Object createObject() {
        return new Object();
    }

    public Object[] createObjects(int numberOfObjects) {
        return new Object[numberOfObjects];
    }
}
