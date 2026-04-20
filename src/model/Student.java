/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.sql.Timestamp;

public class Student{
    
private long id;
private int age;
private String name;
//private String major;
private double gpa;
//private int number;              // student number
private String dept;            // لو بتستخدم id بدل object Department
//private String status;
//private int completedHours;
//private Timestamp createdAt;
//private String email;
    
//    public Student(String n ,int age,String d,long gpa){ ////////////////// this constructor to use it for inserting since ID inserted automaticaly from DB
//    this.name=n;
//    this.age=age;
//    this.gpa=gpa;
//    this.dept=d;
//    
//    }
    

    
   
//    public Student(int id,String n,String m ,double gpa,int c){ //////////////////// this constructor to use it for loading data since loading data from DB contain ID
//    this.ID=id;    
//   this.name=n;
//    this.major=m;
//    this.GPA=gpa;
//    this.max_creidt=c;
//    
//    }
    
    public long getId() {
    return id;
}
    
     public int getAge() {
    return age;
}

public String getName() {
    return name;
}

//public String getMajor() {
//    return major;
//}

public String getDept() {
    return dept;
}

public double getGpa() {
    return gpa;
}

//public int getNumber() {
//    return number;
//}

//public Department getStudDeptId() {
//    return dept;
//}

//public String getStatus() {
//    return status;
//}

//public int getCompletedHours() {
//    return completedHours;
//}
//
//public Timestamp getCreatedAt() {
//    return createdAt;
//}
//
//public String getEmail() {
//    return email;
//}
 
    public static void main(String[] args) {
       
        
    }
    
}
