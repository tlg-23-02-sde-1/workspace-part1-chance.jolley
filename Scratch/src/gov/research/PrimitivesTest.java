package gov.research;

class PrimitivesTest {

    public static void main(String[] args) {
        int age = 56;
        System.out.println("The age is: " + age);

        long population = 7_000_000_000l;
        System.out.println("The population is: " + population);

        double height = 185.3;
        System.out.println("My height is: " + height);

        boolean isTall = true;
        System.out.println("I am tall? " + isTall);

        System.out.println("My favorite word is \"belly\"");

        int i = 18;
        System.out.println(i);

        int j = i;
        System.out.println(j);

        i++;

        System.out.println(i);
        System.out.println(j);

        int n = 3;
        System.out.println(++n);

        System.out.println(n);
    }
}