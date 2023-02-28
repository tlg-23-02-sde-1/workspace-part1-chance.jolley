package com.ocean.client;

import com.ocean.CertificationType;
import com.ocean.Diver;

/*
 * JR: adequate, shows basic test drive of a few valid instances.
 */
public class DiverClient {
    public static void main(String[] args) {
        // MUST provide at least a name

        Diver d1 = new Diver("Dee", 120, "is", CertificationType.MASTER_SCUBA,46, 110);

        d1.goDiving();
        d1.info();
        d1.certification();
        System.out.println(d1);
        System.out.println();

        Diver d2 = new Diver("Dennis", 180, "is", CertificationType.ADVANCED_OPEN_WATER,14, 60);
        d2.goDiving();
        d2.info();
        d2.certification();
        System.out.println(d2);
        System.out.println();


        Diver d3 = new Diver("Mac", 145);
        d3.goDiving();
        d3.info();
        d3.certification();
        System.out.println(d3);
        System.out.println();

        System.out.println(Diver.getInstanceCount() + " instances have been created.");

        System.out.println("Don't forget to breath! :)");

    }
}