package com.days.day41;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        //create obj from Student class
        Student student1 = new Student("David", 2005);
//        System.out.println("student1.name = " + student1.name);//David
        Student student2 = new Student("Mary", 2006);
//        System.out.println("student2.name = " + student2.name);//Mary
//        System.out.println("student1.age = " + student1.age);
//        System.out.println("student2.age = " + student2.age);
//        student1.age = 50;
//        student2.age = 150;
//        System.out.println("student1.age = " + student1.age);
//        System.out.println("student2.age = " + student2.age);
        //student wants to learn age  getter
        int student1Age = student1.getAge();
        System.out.println("student1Age = " + student1Age);
//        student1.name = "Ronaldo";
        student1.setCity("London");
        student2.setCity("Oslo");
        student1.studentInfo();//David is 18 years old and living in London
        student2.studentInfo();//Mary is 17 years old and living in Oslo
        student1.scienceGrade = 90;
        student1.mathGrade = 80;
        student1.literatureGrade = 100;

        student2.literatureGrade = 90;
        student2.mathGrade = 80;
        student2.scienceGrade = 70;

        student1.averageGrades();
        student2.averageGrades();
        student1.setCity("a");

        student1.studentInfo();

        //create a student list add the students that you generated
        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Veli");
        names.get(0);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.get(0).studentInfo();
        studentList.get(1).studentInfo();
        System.out.println("studentList.get(0).average = " + studentList.get(0).average);
        System.out.println("studentList.get(1).average = " + studentList.get(1).average);




    }
}
