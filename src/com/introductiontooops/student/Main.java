package com.introductiontooops.student;

public class Main {

    public static void main(String[] args){

        Student myStudent = new Student("Deepa", 'B', 3);

        System.out.println("Student " + myStudent.getName() + " has got grade " + myStudent.getGrade() + " in maths.");
        System.out.println("Upgraded grade is: " + myStudent.increaseGrade());
        System.out.println("Downgraded grade is: " + myStudent.decreaseGrade());

    }

}
