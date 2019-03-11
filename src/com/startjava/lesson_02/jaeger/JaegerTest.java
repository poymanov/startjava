package com.startjava.lesson_02.jaeger;

public class JaegerTest {
  
    public static void main(String[] args) {
        Jaeger brawlerYukon = new Jaeger("Brawler Yukon", "Mark-1");
        
        System.out.println(brawlerYukon.getModelName());
        System.out.println(brawlerYukon.getMark());

        Jaeger crimsonTyphoon = new Jaeger("Crimson Typhoon", "Mark-4");

        System.out.println(crimsonTyphoon.getModelName());
        System.out.println(crimsonTyphoon.getMark());
    }
}