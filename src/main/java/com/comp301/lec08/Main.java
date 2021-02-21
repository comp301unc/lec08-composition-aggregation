package com.comp301.lec08;

public class Main {
  public static void main(String[] args) {
    Professor kmp = new Professor("Ketan Mayer-Patel");
    Professor aaron = new Professor("Aaron Smith");

    Room sn014 = new Room("Sitterson", 014);
    Room ham100 = new Room("Hamilton", 100);

    Course c1 = new Course(ham100, kmp, "COMP 210", 3);
    Course c2 = new Course(sn014, aaron, "COMP 301", 3);

    Student s1 = new Student("Alan Turing");
    Student s2 = new Student("Charles Babbage");
    Student s3 = new Student("Haskell Curry");
    Student s4 = new Student("Ada Lovelace");
    Student s5 = new Student("Jim Gray");

    c1.enrollStudent(s1);
    c1.enrollStudent(s2);
    c1.enrollStudent(s3);

    c2.enrollStudent(s4);
    c2.enrollStudent(s5);

    System.out.println(c1);
    System.out.println(c2);
  }
}
