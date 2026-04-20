/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Timestamp;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.*;
public class studentDAO {


    
   
    
    
    
    public void delete(Student s){
    try{
        String url="jdbc:mysql://localhost:3306/university";
     String user= "root";
     String pass="ramezemad";
     
     Connection con = DriverManager.getConnection(url,user,pass);
     
     PreparedStatement ps=con.prepareStatement("delete from students where id=?;");
      ps.setLong(1, s.getid());
       ps.executeUpdate();
      
         con.close();
     ps.close();
    }catch(Exception e){System.out.println(e);}
     
    
    }
    
    public void update(Student s) throws Exception{
    
    String url="jdbc:mysql://localhost:3306/university";
     String user= "root";
     String pass="ramezemad";
     
     Connection con = DriverManager.getConnection(url,user,pass);
       
     PreparedStatement ps =con.prepareStatement("UPDATE students SET name=?, age=?, gpa=?, dept=? WHERE id=?;");
    ps.setString(1, s.getname());
    ps.setInt(2,s.getAge());
    ps.setDouble(3,s.getgpa());
    ps.setInt(4,s.getdept());
    ps.setLong(5, s.getid());
      ps.executeUpdate();
    
                
      ps.close();
      con.close();
      
    
      
    }
    ////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////
   
    public Student search(Student s){
        try{
    String url="jdbc:mysql://localhost:3306/university";
     String user= "root";
     String pass="ramezemad";
        
    Connection con = DriverManager.getConnection(url,user,pass);
    
    PreparedStatement ps=con.prepareStatement("select * from students where id=?");
    ps.setLong(1,s.getid());
    ResultSet rs = ps.executeQuery();
    

    
    if(rs.next()){
        s = new Student(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getInt("age"),
            rs.getDouble("gpa"),
            rs.getInt("dept")
        );
    }
}catch(Exception e){System.out.println(e);}
        return s;
        
    }
    ///////////////////////////////////////////////
    //////////////////////////////////////////////
    ////////////////////////////////////////////// 
    public List<Student> load() throws Exception{
        
    List<Student> students = new ArrayList<>();
         
          String url="jdbc:mysql://localhost:3306/university";
     String user= "root";
     String pass="ramezemad";
     
     Connection con = DriverManager.getConnection(url,user,pass);
             
        
        
        Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("select * from students;");
     
     
     while(rs.next()){
         Student s=new Student(
          rs.getInt("id"),
         rs.getString("name"),
         rs.getInt("age"),
         rs.getDouble("gpa"),
         rs.getInt("dept")
         );
         students.add(s);
     }
     rs.close();
     con.close();
     st.close(); 


return students;
    }
    
public void login(){
 try{   
  String url="jdbc:mysql://localhost:3306/3306/university";  
  String pass="ramezemad";
  String user="root";  
  
  Connection con =DriverManager.getConnection(url,pass,user);
  
  
    
    }
catch(Exception e){System.out.println(e);}
}




public void SignUP(User u){
 try{   
  String url="jdbc:mysql://localhost:3306/3306/university";  
  String pass="ramezemad";
  String user="root";  
  
  Connection con =DriverManager.getConnection(url,pass,user);
  
  PreparedStatement ps=con.prepareStatement("insert into User username=? , password=? , role_id=? , createdtime=? , active=?");
    
    }
catch(Exception e){System.out.println(e);}
}

public void AddRole(Role r){
 try{   
  String url="jdbc:mysql://localhost:3306/3306/university";  
  String pass="ramezemad";
  String user="root";  
  
  Connection con =DriverManager.getConnection(url,pass,user);
  
  PreparedStatement ps=con.prepareStatement("insert into role name=?");
  ps.setString(1,r.getName());
    
    }
catch(Exception e){System.out.println(e);}
}




public void addUser(User u) throws Exception{
    try{
        
     String url="jdbc:mysql://localhost:3306/university";
     String user= "root";
     String pass="ramezemad";
     
     Connection con = DriverManager.getConnection(url,user,pass);
     
PreparedStatement ps = con.prepareStatement("INSERT INTO user (name, password_hash, role, created_at, active) VALUES (?, ?, ?, ?, ?)");
ps.setString(1,u.getName());
ps.setString(2,u.getPassword());    
ps.setString(3, u.getRole().getName());
ps.setTimestamp(4, Timestamp.valueOf(u.getCreatedAt().toString()));
ps.close();
con.close();
    }
    catch(Exception e){System.out.println(e);}
    }




public void addIns(Instructor in) throws Exception{
    try{
        
     String url="jdbc:mysql://localhost:3306/university";
     String user= "root";
     String pass="ramezemad";
     
     Connection con = DriverManager.getConnection(url,user,pass);
     
PreparedStatement ps = con.prepareStatement("INSERT INTO instructor (fName, LName, email, dept_id, user) VALUES (?, ?, ?, ?, ?)");
ps.setString(1,in.getFName());
ps.setString(2,in.getLName());    
ps.setString(3, in.getEmail());
ps.setLong(4,in.getDept().getId());
ps.setLong(5, in.getUser().getId());
ps.close();
con.close();
    }
    catch(Exception e){System.out.println(e);}
    }

public void addStudent(Student s) throws Exception{
    try{
        
     String url="jdbc:mysql://localhost:3306/university";
     String user= "root";
     String pass="ramezemad";
     
     Connection con = DriverManager.getConnection(url,user,pass);
     
     PreparedStatement ps = con.prepareStatement("INSERT INTO students(name, age, gpa, dept) VALUES (?, ?, ?, ?)");
ps.setString(1,s.getName());
ps.setString(2,s.getMajor());    
ps.setDouble(3, s.getGpa());
ps.setInt(4, s.getNumber());
ps.setLong(5,s.getStudDeptId().getId());
ps.setString(6,s.getStatus());
ps.setInt(7, s.getCompletedHours());
ps.setTimestamp(8, s.getCreatedAt());
ps.setString(9, s.getEmail());

ps.executeUpdate();
ps.close();
con.close();
    }
    catch(Exception e){System.out.println(e);}
    }
}