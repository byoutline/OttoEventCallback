package com.byoutline.ottoeventcallback;

import android.os.Handler;
import android.os.Looper;

import com.byoutline.eventcallback.IBus;
import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 *
 */
public class PostFromAnyThreadBus extends Bus implements IBus {

    public PostFromAnyThreadBus() {
        super(ThreadEnforcer.MAIN);
    }

    @Override
    public void post(final Object event) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            // We're not in the main loop, so we need to get into it.
            (new Handler(Looper.getMainLooper())).post(new Runnable() {
                @Override
                public void run() {
                    // We're now in the main loop, we can post now
                    PostFromAnyThreadBus.super.post(event);
                }
            });
        } else {
            super.post(event);
        }
    }
}
