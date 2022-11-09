package com.example.App.Repositoris;
import com.example.App.sbrealcions.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface StudentRep extends CrudRepository<Student, Long> {

    public List<Student> findAll();

}
