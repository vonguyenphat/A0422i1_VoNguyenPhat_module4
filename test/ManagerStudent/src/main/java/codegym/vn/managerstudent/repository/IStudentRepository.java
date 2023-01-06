package codegym.vn.managerstudent.repository;

import codegym.vn.managerstudent.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student, Integer> {
}
