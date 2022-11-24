package employer.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import employer.employee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
//	@Query(value = "SELECT e FROM Employee e ORDER BY e.salary DESC")
//	public List<Employee> findAllDescContionedEmployeeDetail();
//	
//	@Query(value = "SELECT * FROM Employee e WHERE e.salary <= :sal", nativeQuery = true)
//	public List<Employee> findAllByMaxSalary(@Param("sal") Integer salary);
}
