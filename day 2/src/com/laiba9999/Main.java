package com.laiba9999;
import java.time.LocalDate;
import java.time.Month;
public class Main {

    public static void main(String[] args) {

        Person laibaPerson = new Person("Laiba","Kirmani",Gender.FEMALE, LocalDate.of(1999, Month.OCTOBER, 31));
        System.out.println(laibaPerson.getFirstName() + " " + laibaPerson.getLastName() +" " + laibaPerson.getGender() +" " + laibaPerson.getDateOfBirth());


    }



}
