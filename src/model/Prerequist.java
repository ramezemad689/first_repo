
 

import model.Course;

public class Prerequist {

    private long id;
    private Course course;
    private Course RequiredCourse;
    
 
    
    
    public long getId() {
    return id;
}

public Course getCourse() {
    return course;
}

public Course getRequiredCourse() {
    return RequiredCourse;
}

}
