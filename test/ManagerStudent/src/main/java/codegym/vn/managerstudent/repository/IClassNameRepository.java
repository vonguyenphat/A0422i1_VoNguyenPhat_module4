package codegym.vn.managerstudent.repository;

import codegym.vn.managerstudent.model.ClassName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClassNameRepository extends JpaRepository<ClassName, Integer> {
}
