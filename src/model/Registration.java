/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author hp
 */
public class Registration {
  
    
    private long id;
private Course course;
private Semester semester;
private Student student;
private String status;
private LocalDateTime registrationDate;





public long getId() {
    return id;
}

public Course getCourse() {
    return course;
}

public Semester getSemester() {
    return semester;
}

public Student getStudent() {
    return student;
}

public String getStatus() {
    return status;
}

public LocalDateTime getRegistrationDate() {
    return registrationDate;
}
}
