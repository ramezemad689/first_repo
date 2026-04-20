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
public class Semester {
   private long id;
   private  String name;
  private  LocalDateTime start;
   private LocalDateTime end;
    private Status status;
   public enum Status {
    OPENED,
    CLOSED
}
    
    public long getId() {
    return id;
}

public String getName() {
    return name;
}

public LocalDateTime getStart() {
    return start;
}

public LocalDateTime getEnd() {
    return end;
}

public Status getStatus() {
    return status;
}

}
