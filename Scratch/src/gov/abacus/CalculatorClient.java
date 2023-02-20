package gov.abacus;

class CalculatorClient {

    public static void main(String[] args) {
        Calculator Calculator= new Calculator();

        double sum = Calculator.add(3.1, 5.1);
        System.out.println("The sum is:" + sum);
        System.out.println("The difference is: "+ Calculator.subtract(3,5));
        System.out.println("10 is even? "+ Calculator.isEven(10));
        System.out.println();

        int winner = Calculator.randomInt();
        System.out.println("The Winner is: " + winner);


        double average = Calculator.average(2,6, 6, 5);
        System.out.println(average);
    }

}