/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hp
 */
public class Grade {
long id;
String name;
private Registration registration;  // مرتبط بسجل تسجيل واحد
private double score;
private String letterGrade;
private double gradePoints;
 



public long getId() {
    return id;
}

public Registration getRegistration() {
    return registration;
}

public double getScore() {
    return score;
}

public String getLetterGrade() {
    return letterGrade;
}

public double getGradePoints() {
    return gradePoints;
}







}
