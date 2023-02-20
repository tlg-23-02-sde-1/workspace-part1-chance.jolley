package com.ocean;

public class Diver {
    //STATIC
    public static final int MIN_DEPTH = 0;
    public static final int MAX_DEPTH = 130;
    //
    private static int instanceCount = 0;
    public static int getInstanceCount() {
        return instanceCount;
    }

    // INSTANCE VARIABLES
    private String name;
    private int weight;
    private String cert = "is not";
    private int numDives;
    private int depth; // 0-130

    private CertificationType certification = CertificationType.NOT_CERTIFIED;

    //CONSTRUCTORS
    public Diver() {
        instanceCount++;
    }

    public Diver(String name) {
        this();
        this.setName(name);
    }

    public Diver(String name, int weight) {
        this(name);
        this.setWeight(weight);
    }

    public Diver(String name, int weight, String cert, CertificationType certification) {
        this(name, weight);
        this.setCert(cert);
        this.setCertification(certification);
    }

    public Diver(String name, int weight, String cert, CertificationType certification, int numDives) {
        this(name, weight, cert, certification);
        this.setNumDives(numDives);
    }

    public Diver(String name, int weight, String cert, CertificationType certification, int numDives, int depth) {
        this(name, weight, cert, certification, numDives);
        this.setDepth(depth);
    }

    // BUSINESS METHODS
    public void goDiving() {
        int sum = getNumDives() + 1;
        System.out.println(getName() + " went diving and increased their dives from " + getNumDives()
                + " to " + sum + ".");
    }

    public void info() {
        System.out.println(getName() + " weighs " + getWeight() + "lbs.");
    }

    public void certification() {
        System.out.println(getName() + " " + getCert() + " certified. They have obtained "
                + getCertificationType() + " certification and have dove "
                + getNumDives() + " times and a deepest depth of " + getDepth() + "ft.");
    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    public int getNumDives() {
        return numDives;
    }

    public void setNumDives(int numDives) {
        this.numDives = numDives;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        if (MIN_DEPTH <= depth & depth <= MAX_DEPTH) {
            this.depth = depth;
        } else {
            System.out.println("Invalid recreational Depth, Valid Depth: " + MIN_DEPTH + " - " + MAX_DEPTH);
        }
    }

    public CertificationType getCertificationType() {
        return certification;
    }

    public void setCertification(CertificationType certification) {
        this.certification = certification;
    }

    // toString
    public String toString() {
        return "After " + getName() + " completed their dive, their dives increased to "
                + getNumDives() +  " and they reached a depth of " + getDepth() +
                "FT. They're level of skill is " +getCertificationType() + " certification level.";
    }

}