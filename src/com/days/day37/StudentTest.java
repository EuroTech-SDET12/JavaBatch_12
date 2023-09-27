package com.days.day37;

public class StudentTest {

    public static void main(String[] args) {

        Student s4 = new Student(1004,"Talha","1-A",60,"ABC Street","Murat","12345667",true);


        Student s1 = new Student();
        s1.id = 1001;
        s1.name = "Steve";
        s1.sClass = "5-B";
        s1.grade = 80;
        s1.address = "Baker Street";
        s1.parentName = "John";
        s1.parentPhone = "07367123123";
        s1.isActiveStudent = true;


        Student s2 = new Student();
        s2.id = 1002;
        s2.name = "Tony";
        s2.sClass = "5-C";
        s2.grade = 90;
        s2.address = "Lion Street";
        s2.parentName = "Mario";
        s2.parentPhone = "07367321321";
        s2.isActiveStudent = true;


        Student s3 = new Student();
        s3.id = 1003;
        s3.name = "James";
        s3.sClass = "5-D";
        s3.grade = 50;
        s3.address = "Write Street";
        s3.parentName = "Julie";
        s3.parentPhone = "07367111111";
        s3.isActiveStudent = true;


    }
}
