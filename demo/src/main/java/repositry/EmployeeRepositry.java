package repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Employee;

/**
 *
 * @author ATS
 */
@Repository
public interface EmployeeRepositry extends JpaRepository<Employee, Long>{

}