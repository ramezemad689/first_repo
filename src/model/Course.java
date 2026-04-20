/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Course {
private long id;
private String name;
private String code;
private int hours; 
 
 public Course(long id,String n,String c,int h){
 this.id=id;
 name=n;
 code=c;
 hours=h;
 }
 
 
 public long getid(){
 return id;
 }
 
 public String getname(){
 return name;
 }
 
 public String gertcode(){
     return code;
 }
 
 public int gethours(){
 return hours;
 }
 }

