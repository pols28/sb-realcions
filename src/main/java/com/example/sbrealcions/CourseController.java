package com.example.sbrealcions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("cursos")
public class CourseController {
    @GetMapping("Courses")
    public ArrayList<Course> getCourses(){
        ArrayList<Course> a=new ArrayList<Course>();
        a.add(new Course("Curs 1"));
        a.add(new Course("Curs 2"));
        a.add(new Course("Curs 3"));
        a.add(new Course("Curs 4"));
        a.add(new Course("Curs 5"));


        return a;
    }
    @GetMapping("Course1")
    public Course getCourse() {

        ArrayList<Course> Course = getCourses();
        Course curs= Course.get(1);
        return curs;
    }
}
