package org.zmp.model.event;

/**
 * Created by MM on 2014-12-14.
 */
public class LockpadEvent implements Event{


    @Override
    public String getDescription() {
        return "Wrong CODE ";
    }
}
