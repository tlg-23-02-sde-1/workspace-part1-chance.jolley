package edu.snooze;

/*
 * System or "business class" to model the workings of an alarm clock.
 * This class definition has no main() method - most classes don't.
 */
class AlarmClock {

    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;

    //attributes or properties, in Java these are called fields or instance variables
    private int snoozeInterval = 20; // default value when client doesn't specify one
    private int repeat = 10;        // number of times it goes off

    //constructors
    public AlarmClock() {
        //no-op or perhaps we sync the time in here
    }
    public AlarmClock(int snoozeInterval) {
        this();
        setSnoozeInterval(snoozeInterval);
            }
    public AlarmClock(int snoozeInterval, int repeat) {
        this(snoozeInterval);
        setRepeat(repeat);
    }

    //functions (methods in Java) what can an alarm clock do?
    public void snooze() {
        System.out.println("Snoozing for " + snoozeInterval + " minutes");

    }
    //accessor methods -provide "controlled access to the object's internal private data
    public int getSnoozeInterval() {
        return snoozeInterval;
    }
    //data constraint of [1-20] (inclusive)
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid snooze interval: " + snoozeInterval +
                    ", must be in range of " + MIN_INTERVAL + " - " + MAX_INTERVAL);
        }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String toString() {
        return "AlarmClock: snoozeInterval=" + getSnoozeInterval() + ", repeat=" +getRepeat();
    }
}