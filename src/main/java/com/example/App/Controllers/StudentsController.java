package com.example.App.Controllers;
import com.example.App.Repositoris.StudentRep;
import com.example.App.sbrealcions.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api")
public class StudentsController {

    @Autowired
    StudentRep SRep;
    @GetMapping("/Students")
    public List <Student> getStudent() {
        return (List<Student>) SRep.findAll();
    }
}
