/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicservices;

import javax.swing.JOptionPane;
import model.Student;
import DAO.studentDAO;
import java.time.LocalDateTime;
import java.util.List;
import model.*;

/**
 *
 * @author hp
 */
public class studentservice {
    
    studentDAO dao=new studentDAO();
    public void add(User u)throws Exception{
    
    
    if (!u.getName().matches("^[A-Za-z][a-z]+(\\s+[A-Za-z][a-z]+)+$")){
    throw new Exception("invalid name");
    }
    
    if (!u.getRole().getName().matches("\b[Ss]tudent\b | \b[Ii]nstructor\b")){
      throw new Exception("invalid Role");
    }
    
    
    if (u.getPassword().matches("\b[A-Z]*[a-z]+[@#$%&*][a-z0-9]*\b")){
     throw new Exception("invalid password");
      
    }

LocalDateTime other = LocalDateTime.of(2026, 2, 22, 0, 0);

if (u.getCreatedAt().isAfter(other)) {
    throw new Exception("Invalid department");
}
    
    
    
dao.add(u);


}   

    
    public void delete(Student s){
    dao.delete(s);
    }
    
    public List<Student> load()throws Exception{
    return dao.load();
    }
    
    public void update(Student s) throws Exception{
    dao.update(s);
    
    }
    
    public Student search(Student s){
   return dao.search(s);
    
    }
 
    
}
