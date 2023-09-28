package com.days.day39;

public class Encapsulation {

    private int number;
    private String name;

    public void test(){
        System.out.println("test");
    }

    // GETTER Methods!!
    public int getNumber(){
        return this.number;
    }
    public String getName(){
        return this.name;
    }

    // SETTER Methods
    public void setNumber(int number){
       this.number =number;
    }
    public void setName(String newName){
          this.name = newName;
    }



}
