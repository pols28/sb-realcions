package com.example.App.Controllers;
import com.example.App.Repositoris.CMRep;
import com.example.App.sbrealcions.CourseMaterial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api")
public class CMaterialController {

    @Autowired
    CMRep CMRepo;

    @GetMapping("Material")
    public List <CourseMaterial> getCourseMaterials() {
        return (List <CourseMaterial>) CMRepo.findAll();
    }
}