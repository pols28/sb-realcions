package com.example.App.Repositoris;

import com.example.App.sbrealcions.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface CourseRep extends CrudRepository<Course, Long> {

    public List<Course> findAll();
}
