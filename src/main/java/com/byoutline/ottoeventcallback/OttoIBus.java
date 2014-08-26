package com.byoutline.ottoeventcallback;

import com.byoutline.eventcallback.IBus;
import com.squareup.otto.Bus;

/**
 *
 * @author Sebastian Kacprzak <sebastian.kacprzak at byoutline.com>
 */
public class OttoIBus implements IBus {

    private final Bus bus;

    public OttoIBus(Bus bus) {
        this.bus = bus;
    }
    
    public void post(Object event) {
        bus.post(event);
    }
}
