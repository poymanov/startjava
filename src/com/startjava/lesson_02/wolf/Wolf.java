package com.startjava.lesson_02.wolf;

public class Wolf {
    private String sex;
    private String name;
    private float weight;
    private int age;
    private String color;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age");  
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void go() {
        System.out.println("Wolf moves");
    }

    public void sit() {
        System.out.println("Wolf sits");  
    } 

    public void run() {
        System.out.println("Wolf runs");  
    }

    public void howl() {
        System.out.println("Wolf howls"); 
    }

    public void hunt() {
        System.out.println("Wolf hunts"); 
    }
}