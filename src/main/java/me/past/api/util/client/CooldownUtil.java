package me.past.api.util.client;

public class CooldownUtil {
    private long time;

    public CooldownUtil() {
        time = -1;
    }

    public boolean passed(double ms) {
        return System.currentTimeMillis() - this.time >= ms;
    }

    public void reset() {
        this.time = System.currentTimeMillis();
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}