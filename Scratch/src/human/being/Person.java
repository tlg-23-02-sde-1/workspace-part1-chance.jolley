package human.being;/*
 * An immutable class. More accurately, this is a class definition written
 * in such a way that instances of it (Person objects) cannot have their properties
 * changed once created. In short: getters but no public setters.
 *
 */

import java.time.LocalDate;
import java.time.Period;

class Person {

    // properties (fields or instance variables)
    private final String name;
    private final LocalDate birthDate;

    // constructors
    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // accessor methods

    /**
     * Returns the Person's age in whole years
     * This can be derived from the birthDate and today's date.
     * You basically need to get the period of time(in whole years)
     * between the birthDate and today's date.
     */

    public int getAge() {
        Period period = Period.between(getBirthdate(), LocalDate.now());
        return period.getYears();

    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthDate;
    }

    public String toString() {
        return String.format("Person: name= %s birthday= %s", getName(), getBirthdate());
    }
}