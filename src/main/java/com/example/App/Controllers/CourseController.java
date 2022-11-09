package com.example.App.Controllers;
import com.example.App.Repositoris.CourseRep;
import com.example.App.sbrealcions.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api")
public class CourseController {

    @Autowired
    CourseRep CRep;

    @GetMapping("Course")
    public List <Course> getCourse(){
        return (List<Course>) CRep.findAll();

    }
}