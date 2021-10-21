package com.laiba9999;
import java.time.LocalDate;

public class Person {
 private String firstName;
 private String lastName;
 private Gender gender;
 private LocalDate dateOfBirth;

 public Person(String firstName, String lastName, Gender gender, LocalDate dateOfBirth) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.gender = gender;
  this.dateOfBirth = dateOfBirth;
 }

 public Person() {
 }

 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }

 //Setters
 public void setLastName(String lastName) {
  this.lastName = lastName;
 }

 public void setGender(Gender gender) {
  this.gender = gender;
 }

 public void setDateOfBirth(LocalDate dateOfBirth) {
  this.dateOfBirth = dateOfBirth;
 }

 //Getters


 public String getFirstName() {
  return firstName;
 }

 public String getLastName() {
  return lastName;
 }

 public Gender getGender() {
  return gender;
 }

 public LocalDate getDateOfBirth() {
  return dateOfBirth;
 }
}


