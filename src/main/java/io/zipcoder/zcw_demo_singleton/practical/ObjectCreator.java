package io.zipcoder.zcw_demo_singleton.practical;

/**
 * Created by leon on 8/30/17.
 */
public interface ObjectCreator {
    Object createObject();
    Object[] createObjects(int numberOfObjects);
}
