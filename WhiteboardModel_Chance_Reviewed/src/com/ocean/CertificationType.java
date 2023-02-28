package com.ocean;

/*
 * JR: better name might be Certification
 */
public enum CertificationType {
    NOT_CERTIFIED("no"),
    OPEN_WATER("Open Water Diver"),
    ADVENTURE("Adventure Diver"),
    ADVANCED_OPEN_WATER("Advanced Open Water Diver"),
    RESCUE("Rescue Diver"),
    MASTER_SCUBA("Master Scuba Diver");

    private String certification;

    //constructor - called only from inside
    CertificationType(String certification) {
        this.certification = certification;
    }

    public String getCertificationType() {
        return certification;
    }

    public String toString() {
        return getCertificationType();
    }
}