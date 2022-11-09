
package com.example.Repositoris;
import com.example.sbrealcions.CourseMaterial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface CMRep extends CrudRepository<CourseMaterial, Long> {

    public List<CourseMaterial> findAll();
}