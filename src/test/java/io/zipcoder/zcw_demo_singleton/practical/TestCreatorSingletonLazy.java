package io.zipcoder.zcw_demo_singleton.practical;

import org.junit.Assert;

/**
 * Created by leon on 8/30/17.
 */
public class TestCreatorSingletonLazy extends TestCreatorSingleton {
    public TestCreatorSingletonLazy() {
        super(CreatorSingletonLazy.getInstance());
    }

    public void testInstanceType() {
        Assert.assertTrue(objectFactory instanceof CreatorSingletonLazy);
    }
}
