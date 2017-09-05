package io.zipcoder.zcw_demo_singleton.practical;

/**
 * Created by leon on 8/28/17.
 *
 */
public class CreatorSingletonBillPugh implements ObjectCreator {
    private CreatorSingletonBillPugh() {
    }

    private static class SingletonHelper {
        private static final CreatorSingletonBillPugh INSTANCE = new CreatorSingletonBillPugh();

    }

    public static CreatorSingletonBillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public Object createObject() {
        return new Object();
    }

    public Object[] createObjects(int numberOfObjects) {
        return new Object[numberOfObjects];
    }
}
