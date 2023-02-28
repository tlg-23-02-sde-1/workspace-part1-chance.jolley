package com.ocean.client;

import com.ocean.Diver;
import com.ocean.CertificationType;

import java.util.Arrays;

/*
 * JR: works as intended, but improvement needed.
 * Usage banner is unclear and needs improvement - see comments below.
 * Seems impossible for a user to figure out how to run it.
 * After reading over the code and several failed attempts, I finally got this to work:
 *  Jay 165 is OPEN_WATER 0 0
 *  Without looking over the code, I'd never have been able to figure it out.
 *
 * Formatting: delete the extraneous blank lines at the end of main().
 */
class DiverClientArgs {

    public static void main(String[] args) {

        if (args.length < 6) {
            String usage = "Usage: java DiverClientArgs (name) (weight) (certified)" +
                    "(certification type) (number of dives) (deepest dive depth) ";

            // JR: input arguments are space-delimited, not comma-delimited - this example does not actually work
            String example = " EXAMPLE: java DiverClientArgs Frank, 160, is (certified), Adventure Diver, 28, 95";

            // 4 inputs are specified here, but application requires 6 to work correctly
            String info1 = "First name, weight, if certified, and number of dives taken required to go on dive.";

            String info2 = "Certifications accepted are: " + Arrays.toString(CertificationType.values());
            String info3 = "Must specify depth dove previously, valid range between " + Diver.MIN_DEPTH
                    + " and " + Diver.MAX_DEPTH + " ft.";
            System.out.println(usage + "\n" + example + "\n" + info1 + "\n" + info2 + "\n" + info3);

            return;
        }

        System.out.println( "You provided "  + args.length + " arguments." );

        String name = args[0];
        int weight = Integer.parseInt(args[1]);
        String cert = args[2];
        CertificationType certification = CertificationType.valueOf(args[3].toUpperCase());
        int numDives = Integer.parseInt(args[4]);
        int depth = Integer.parseInt(args[5]);

        Diver d = new Diver(name, weight, cert, certification, numDives, depth);

        System.out.println("We have submitted your reservation to dive.");
        System.out.println("You can now go on a dive!");
        System.out.println(d);





    }
}