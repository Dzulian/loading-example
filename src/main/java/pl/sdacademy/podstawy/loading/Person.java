package pl.sdacademy.podstawy.loading;

import java.time.LocalDate;
import java.time.Month;

public class Person {
    private final String firstName;
    private final String lastName;
    private LocalDate birthDate;
    private double weight;
    private double height;

    public static void main(String[] args) {
        Person person = new Person("2010-01-09",90.0,177.0);
    }
    public Person(String firstName, String lastName, LocalDate birthDate, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
        this.height = height;
    }

    public Person (String firstName, String lastName){
        this(firstName, lastName,LocalDate.of(2000, Month.JANUARY,1),0.0,0.0);
    }
    public Person(LocalDate birthDate, double weight, double height) {
        this("","",birthDate,weight,height);
    }

    public Person(String birthDate, double weight, double height) {
        this(LocalDate.parse(birthDate), weight, height);
    }

}
