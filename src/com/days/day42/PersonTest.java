package com.days.day42;

public class PersonTest {

    public static void main(String[] args) {

        String[] p1Activities = {"Running","Swimming"};
        Person person1 = new Person(1001,"Murat",p1Activities,35);

        String[] p2Activities = {"Reading","Yoga"};
        Person person2 = new Person(1002,"Vaishali",p2Activities,15);

        person1.toDo();
        person2.toDo();

        person1.eligibilityToVote();
        person2.eligibilityToVote();


        System.out.println("Person.personCount = " + Person.personCount);

//        Person.personLimitCheck(2);
        Person.personLimitCheck();

        String[] p3Activities = {"Riding","Yoga"};
        Person person3 = new Person(1002,"John",p2Activities,18);

        Person.personLimitCheck();

    }
}
