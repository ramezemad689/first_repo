/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Instructor {
 long id;
String fName;
String lName;
String email;
Department dept;
User u;

public Instructor( String fName,String lName,String email,Department dept,User u){
this.fName=fName;
this.lName=lName;
this.email=email;
this.dept=dept;
this.u=u;
}


public long getId() {
    return id;
}

public String getFName() {
    return fName;
}

public String getLName() {
    return lName;
}

public String getEmail() {
    return email;
}

public Department getDept() {
    return dept;
}

public User getUser(){
return u;
}

}
