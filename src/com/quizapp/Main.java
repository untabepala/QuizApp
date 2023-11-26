package com.quizapp;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

}
class Quiz{
    public void logic(){
        Questions q1 = new Questions("1. What is the purpose of the `static` keyword in Java?","A. To make a variable non-modifiable","B. To create a constant value","C. To indicate that a method or variable belongs to the class, not the instance","D. To enable dynamic method dispatch");
        Questions q2 = new Questions("2. Which of the following is not a primitive data type in Java?"," A. int"," B. boolean"," C. String"," D. char");
        Questions q3 = new Questions("3. What is the purpose of the `break` statement in Java?"," A. To terminate the program"," B. To exit a loop or switch statement prematurely"," C. To skip the current iteration of a loop"," D. To jump to a specific line in the code");
        Questions q4 = new Questions("4. Which collection framework interface does not extend the Collection interface?"," A. Set"," B. Map"," C. List"," D. Queue");
        Questions q5 = new Questions("5. What is the purpose of the `final` keyword in Java?"," A. To indicate that a variable cannot be changed"," B. To make a variable non-modifiable"," C. To declare a constant value"," D. To enable dynamic method dispatch");
    Map<Questions,Character> hmap=new HashMap<>();
        hmap.put(q1,'D');
        hmap.put(q2,'D');
        hmap.put(q3,'B');
        hmap.put(q4,'B');
        hmap.put(q5,'A');

        for(Map.Entry<Questions,Character>ma:hmap.entrySet()){

            System.out.println(hmap.getKey().getQuestion());
            System.out.println(hmap.getKey().getOption1());
            System.out.println(hmap.getKey().getOption2());
            System.out.println(hmap.getKey().getOption3());
            System.out.println(hmap.getKey().getOption4());
            System.out.println(hmap.getKey().getOption5());
        }
    }
}