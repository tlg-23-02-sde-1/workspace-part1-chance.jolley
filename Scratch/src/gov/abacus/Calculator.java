package gov.abacus;

class Calculator {

    /*
     * Returns the arithmetic mean (average) of the supplied integers
     *
     */

    public static double average(int first, int... rest) {
        double result = 0.0;

        double sum = first;

        for (int value : rest) {
            sum += value;
        }
        result = sum / rest.length + 1;
        return result;
    }




    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b){
        return a - b;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;

    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int randomInt() {
        return this.randomInt(1,14); // delegate
    }

    public int randomInt(int max) {
        return randomInt(1, max);
    }

    public int randomInt(int min, int max) {
        int result = 0;

        double rand= Math.random();
        double scaled = (rand * (max - min)) + min;

        //truncate the decimal portion off via explicit downcast to in
        result = (int) scaled;
        return result;
    }
}