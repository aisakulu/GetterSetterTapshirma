package com.peakSoft;

public class Student {

    private String studentName;
    private String studentSurname;
    private int[] birthDate;
    private int studentAge;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public int[] getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int[] birthDate) {
        this.birthDate = birthDate;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
}
