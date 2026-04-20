/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import org.mindrot.jbcrypt.BCrypt;
import java.sql.Timestamp;

public class User {
  
    long id;
    String name;
    
    private String password;    
    Role role;
    Timestamp createdAt;
    boolean active;
    
    
    public User( String name, String password, Role role, Timestamp createdAt, boolean active){
    this.name=name;
    this.password=password;
    this.role=role;
    this.createdAt=createdAt;
    this.active=active;
    }
    
    public void SetPassword(String p){
    String hash = BCrypt.hashpw(p, BCrypt.gensalt(12));
    this.password=hash;
    }
    
     public void SetName(String n){
     this.name=n;
     }
    
    public long getId() {
    return id;
}

public String getName() {
    return name;
}

public String getPassword() {
    return password;
}

public Role getRole() {
    return role;
}

public Timestamp getCreatedAt() {
    return createdAt;
}

public boolean isActive() {
    return active;
}

}
