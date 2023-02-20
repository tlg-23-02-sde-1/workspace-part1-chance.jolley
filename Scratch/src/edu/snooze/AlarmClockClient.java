package edu.snooze;

/*
 * The application "main-class" (class with the main() method)
 *
 */
class AlarmClockClient {

    public static void main(String[] args) {

        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);
        clock1.setRepeat(7);

        clock1.snooze();


        AlarmClock clock2 = new AlarmClock(10);

        clock2.snooze();


        AlarmClock clock3 = new AlarmClock(10,3);

        clock3.snooze();

        System.out.println(clock1.toString());
        System.out.println(clock2);
        System.out.println(clock3);

    }
}