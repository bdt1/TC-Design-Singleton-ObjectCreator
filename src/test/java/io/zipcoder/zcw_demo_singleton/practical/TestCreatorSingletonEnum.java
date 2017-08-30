package io.zipcoder.zcw_demo_singleton.practical;

import org.junit.Assert;

/**
 * Created by leon on 8/30/17.
 */
public class TestCreatorSingletonEnum extends TestCreatorSingleton {
    public TestCreatorSingletonEnum() {
        super(CreatorSingletonEnum.INSTANCE);
    }

    public void testInstanceType() {
        Assert.assertTrue(objectFactory instanceof CreatorSingletonEnum);
    }
}
