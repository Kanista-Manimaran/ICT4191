package lk.ac.vau.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.ac.vau.Model.Student;

public interface StudentRepo extends JpaRepository<Student,String>{

}
