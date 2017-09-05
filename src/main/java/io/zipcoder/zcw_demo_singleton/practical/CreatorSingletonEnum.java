package io.zipcoder.zcw_demo_singleton.practical;

/**
 * Created by leon on 8/28/17.
 */
public enum CreatorSingletonEnum implements ObjectCreator {

    INSTANCE;

    public Object createObject() {
        return new Object();
    }

    public Object[] createObjects(int numberOfObjects) {
        return new Object[numberOfObjects];
    }
}
