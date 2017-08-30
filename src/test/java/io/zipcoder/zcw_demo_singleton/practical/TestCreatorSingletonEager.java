package io.zipcoder.zcw_demo_singleton.practical;

import org.junit.Assert;

/**
 * Created by leon on 8/30/17.
 */
public class TestCreatorSingletonEager extends TestCreatorSingleton {
    public TestCreatorSingletonEager() {
        super(CreatorSingletonEager.getInstance());
    }

    public void testInstanceType() {
        Assert.assertTrue(objectFactory instanceof CreatorSingletonEager);
    }
}
