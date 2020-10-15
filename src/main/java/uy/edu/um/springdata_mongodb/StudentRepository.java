package uy.edu.um.springdata_mongodb;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, String> {

    List<Student> findByFirstName(String firstName);

}
