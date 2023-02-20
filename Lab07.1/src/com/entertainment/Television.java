package com.entertainment;

import java.util.Arrays;

public class Television {
    //    STATIC VARIABLES
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

    private static int instanceCount = 0;
    public static int getInstanceCount() {
        return instanceCount;
    }
//---------------------------------
    //  INSTANCE VARIABLES
    private String brand;   //brand name
    private int volume;             //current volume
    private DisplayType display = DisplayType.LED;

    private boolean isMuted;
    private int oldVolume; //not exposed by get/set methods - internal use only


    //CONSTRUCTORS
    public Television() {
    instanceCount++;                    //instanceCount   = instanceCount + 1
    }

    public Television(String brand) {
        this();
        this.setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        this.setVolume(volume);
    }
    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        this.setDisplay(display);
    }


    //BUSINESS METHODS
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down your TV...goodbye");
    }

    public void mute() {
        if (!isMuted()) {           //not currently muted
            oldVolume = getVolume();
            setVolume(0);
            isMuted = true;
        }
        else {                      //
            setVolume(oldVolume);
            isMuted= false;
        }
        System.out.println("Muted: Setting volume to " + MIN_VOLUME);
    }

    //ACCESSOR METHODS


    public boolean isMuted() {
        return isMuted;
    }

    public String getBrand() {
        return brand;
    }

    //
    public void setBrand(String brand) {
        if (isValidBrand(brand)) {
            this.brand = brand;
        }
        else {
            System.out.println("Invalid brand: " +brand + ", valid brands are " +
                        Arrays.toString(VALID_BRANDS));
        }
    }
    private static boolean isValidBrand(String brand) {
        boolean valid = false;

        for (String validBrand : VALID_BRANDS) {
            if (validBrand.equalsIgnoreCase(brand)) { // we have a match
                valid = true;
                break;
            }
        }
        return valid;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (MIN_VOLUME <= volume & volume <=MAX_VOLUME) {
            this.volume = volume;
            isMuted = false;
        }
        else {
            System.out.printf("Invalid volume: %s, valid range is %s-%s \n", volume, MIN_VOLUME, MAX_VOLUME);

//            System.out.println("Invalid Volume, Valid Range:"
//                    +MIN_VOLUME + " - " + MAX_VOLUME);
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    private boolean verifyInternetConnection() {
        return true; // fake implementation
    }

    //toString()
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return String.format("Television: brand: %s, volume : %s, display: %s", getBrand(), volumeString, getDisplay());

//        return "The television brand: " + getBrand() +
//                ", volume: " + volumeString +
//                ", display: " +getDisplay();

    }

}