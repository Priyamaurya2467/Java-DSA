package com.maurya;
public class Main {
    public static void main(String[] args){
        /*
             Syntax of if statements:
             if (boolean expressions T or F) {
             //BODY
             } else{
             //do this
             }

         */
        int salary = 500000;
//        if (salary > 5000) {
//            salary = salary +1000;
//        } else{
//            salary = salary + 500;
//        }
//        System.out.println(salary);
//    }
    //multiple if- else
        if (salary >10000) {
            salary += 2000;
        } else if (salary > 40000) {
            salary += 2000;
        } else {
            salary += 1000;

        }
        System.out.println("Your upgraded salary will be " + salary);

    }
}