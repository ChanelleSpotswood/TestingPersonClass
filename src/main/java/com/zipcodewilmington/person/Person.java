package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    public int weight;
    private Double height;
    private boolean gender;
    private String state;
    private int zipcode;
    // created fields

    public Person() {
    this.name = "";
    this.age = Integer.MAX_VALUE;
    this.weight = Integer.MAX_VALUE;
    this.height = Double.MAX_VALUE;
    this.gender = true;
    this.state = "";
    this.zipcode = Integer.MAX_VALUE;
    }

    // created the constructor for weight , but it's throwing an error that there are "2 related problems"
    // when you uncomment line 28-30
    //    public Person(int weight) {
    //    this.weight = weight;
    //    }


    public Person(int age){
        this.age = age;
    }



    public Person(String name) {
    this.name = name;
    }
    public Person(int weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, int age) {
    this.name = name;
    this.age = age;
    }


    public void setName(String name) {
    this.name = name;
    }

    public void setAge(int age) {
    this.age = age;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public boolean getGender() {
        return this.gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}
