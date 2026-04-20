/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Department {
private long id;
private String name;
private String code;
 
 public Department(long id,String n, String c){
 this.id=id;
 name=n;
 code=c;
 }
 
 
 public long getId() {
    return id;
}

public String getName() {
    return name;
}

public String getCode() {
    return code;
}

}
