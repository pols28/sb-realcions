package com.example.Repositoris;
import com.example.sbrealcions.CourseMaterial;
import com.example.sbrealcions.Student;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@Repository
public interface StudentRep extends CrudRepository<Student, Long> {

    public List<Student> findAll();
}
