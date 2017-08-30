package io.zipcoder.zcw_demo_singleton.theory;

/**
 * Created by leon on 8/28/17.
 */
public class SingletonBillPugh {
    private SingletonBillPugh() {
        // private constructor ensures
        // class can only be instantiated from within
    }

    private static class SingletonHelper {
        // this class is not loaded into memory
        // until `getInstance` is invoked
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
