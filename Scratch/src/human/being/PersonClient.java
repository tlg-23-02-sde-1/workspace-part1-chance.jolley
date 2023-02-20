package human.being;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Chance", LocalDate.of(1996, 6,21));
        p1.getAge();
        System.out.println(p1);
        System.out.println();
        System.out.printf("%s is %s years old and born on %s", p1.getName(), p1.getAge(), p1.getBirthdate() );
    }
}