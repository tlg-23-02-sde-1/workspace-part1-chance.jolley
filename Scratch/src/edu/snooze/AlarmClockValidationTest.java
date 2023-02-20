package edu.snooze;

/*
 * Test class focused on validation testing.
 * We will do BVT Boundary Value Testing for SnoozeInterval
 * range:1-20 inclusive
 * need to check on the boundaries
 * 0,1 and 20,21
 */
class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();
        clock.setSnoozeInterval(1); // should "stick" the alarmclock has value of 1
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval()); // toString() automatically called

        clock.setSnoozeInterval(20);
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval()); // toString() automatically called\

        clock.setSnoozeInterval(0);
        clock.setSnoozeInterval(21);
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());



    }
}