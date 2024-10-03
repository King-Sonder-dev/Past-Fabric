package me.past.api.event;

import static me.past.api.util.client.Util.mc;
public class Event {
    private Era era = Era.PRE;

    private boolean cancelled;

    public boolean isCancelled() {
        return cancelled;
    }

    public void cancel() {
        cancelled = true;
    }

    public Event() {
    }

    public Era getEra() {
        return era;
    }

    public enum Era {
        PRE, PERI, POST
    }
}