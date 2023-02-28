package com.ocean.test;

import com.ocean.Diver;

/*
 * JR: very good on the BVT (Boundary Value Testing), all appropriate values were tested.
 * Output messages would be easier to read if they were just focused on depth,
 * vs. this long English sentence from toString().
 *  Perhaps something like this would be better:
 *      sout("depth: " + d.getDepth())  // shows that value was accepted or not, and that's it
 */
class DiverValidationTest {
    public static void main(String[] args) {
        Diver d = new Diver();
        d.setDepth(0);
        System.out.println(d);
        d.setDepth(130);
        System.out.println(d);
        d.setDepth(-1);
        System.out.println(d);
        d.setDepth(131);
        System.out.println(d);
    }
}