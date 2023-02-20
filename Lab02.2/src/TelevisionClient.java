import java.sql.SQLOutput;

/*
 * Application "main-class" (class with a main() class).
 * We'll create a few instances of Television and give them a basic test drive.
 */
class TelevisionClient {
//   FIELDS or INSTANCE VARIABLES
    public static void main(String[] args) {

        System.out.println(Television.getInstanceCount() + " instances have been created.");
        System.out.println();

        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(Television.MIN_VOLUME);

        Television tv2 = new Television("Sony", Television.MAX_VOLUME, DisplayType.PLASMA);

        Television tv3 = new Television("LG");
        System.out.println();

        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();
        System.out.println();

        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();
        System.out.println();

        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);
        System.out.println();

        System.out.println(Television.getInstanceCount() + " instances have been created.");

    }
}