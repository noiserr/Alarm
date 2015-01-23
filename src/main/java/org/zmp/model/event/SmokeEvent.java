package org.zmp.model.event;

/**
 * Created by MM on 2014-12-14.
 */
public class SmokeEvent implements Event {
    @Override
    public String getDescription() {
        return "Smoke detected ";
    }
}
