package io.zipcoder.zcw_demo_singleton.practical;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 8/30/17.
 */
public abstract class TestCreatorSingleton {
    protected final ObjectCreator objectFactory;

    public TestCreatorSingleton(ObjectCreator objectFactory) {
        this.objectFactory = objectFactory;
    }


    @Test
    public void testCreateObject() {
        Assert.assertTrue(objectFactory.createObject() instanceof Object);
    }

    @Test
    public void testCreateObjects() {
        int numberOfObjects = 9999;
        Object[] objects = objectFactory.createObjects(numberOfObjects);
        Assert.assertEquals(numberOfObjects, objects.length);
    }

    @Test
    abstract public void testInstanceType();
}
