
package com.example.Repositoris;
import com.example.sbrealcions.CourseMaterial;
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
public interface CMRep extends CrudRepository<CourseMaterial, Long> {

    public List<CourseMaterial> findAll();
}