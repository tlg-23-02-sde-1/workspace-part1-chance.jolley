package com.ocean.test;

import com.ocean.Diver;

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