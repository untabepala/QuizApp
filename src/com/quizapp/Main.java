package com.quizapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz q=new Quiz();
        q.logic();
    }

}
class Quiz{
    Scanner sc=new Scanner(System.in);
    int wrongAnsCount=0;
    int correctAnsCount=0;
    public void logic(){
        Questions q1 = new Questions(" What is the purpose of the `static` keyword in Java?","A. To make a variable non-modifiable","B. To create a constant value","C. To indicate that a method or variable belongs to the class, not the instance","D. To enable dynamic method dispatch");
        Questions q2 = new Questions(" Which of the following is not a primitive data type in Java?"," A. int"," B. boolean"," C. String"," D. char");
        Questions q3 = new Questions(" What is the purpose of the `break` statement in Java?"," A. To terminate the program"," B. To exit a loop or switch statement prematurely"," C. To skip the current iteration of a loop"," D. To jump to a specific line in the code");
        Questions q4 = new Questions(" Which collection framework interface does not extend the Collection interface?"," A. Set"," B. Map"," C. List"," D. Queue");
        Questions q5 = new Questions(" What is the purpose of the `final` keyword in Java?"," A. To indicate that a variable cannot be changed"," B. To make a variable non-modifiable"," C. To declare a constant value"," D. To enable dynamic method dispatch");
        Map<Questions,Character> hmap=new HashMap<>();
        hmap.put(q1,'D');
        hmap.put(q2,'D');
        hmap.put(q3,'B');
        hmap.put(q4,'B');
        hmap.put(q5,'A');

        for(Map.Entry<Questions,Character>map:hmap.entrySet()){

            System.out.println(map.getKey().getQuestions());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());

            System.out.println("Enter your Answer: ");
            Character ans=sc.next().charAt(0);
            int cans=Character.compare(ans,map.getValue());
            if(cans==0){
                System.out.println("Correct");
                correctAnsCount++;
            }else{
                System.out.println("Wrong");
                wrongAnsCount++;
            }
        }
        System.out.println();
        System.out.println("----------Results----------");
        System.out.println("Total Questions: "+hmap.size());
        System.out.println("Correct Answer Question : "+correctAnsCount);
        System.out.println("Wrong Answer Questions : "+wrongAnsCount);
        int percentage=(100*correctAnsCount)/hmap.size();
        System.out.println("Percentage : "+percentage);
        if(percentage>80){
            System.out.println("Performance : Passed");
            System.out.println("Congratulations...!!");
        } else {
            System.out.println("Performance : Fail");
            System.out.println("Try Again");
        }
    }
}