package com.peakSoft;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student = new Student();
        student.setStudentAge(36);
        if (student.getStudentAge() < 0) {
            System.out.println("Bul san ters san");
        } else {
            System.out.println("Student " + student.getStudentAge() + " jashinda.");
        }


    }
}
