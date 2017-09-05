package io.zipcoder.zcw_demo_singleton.practical;

/**
 * Created by leon on 8/28/17.
 */
public class CreatorSingletonEager implements ObjectCreator {
    private static final CreatorSingletonEager instance = new CreatorSingletonEager();

    private CreatorSingletonEager() {

    }

    public static CreatorSingletonEager getInstance() {
        return instance;
    }

    public Object createObject() {
        return new Object();
    }

    public Object[] createObjects(int numberOfObjects) {
        return new Object[numberOfObjects];
    }
}
