package employer.employee.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import employer.employee.model.Employee;
import employer.employee.repository.EmployeeRepository;

@Service
public class EmployeeDao {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	public List<Employee> addEmployee(Employee emp){
		empRepo.save(emp);
		return empRepo.findAll();
	}
	
	public List<Employee> deleteEmployee(Employee emp){
		empRepo.delete(emp);
		return empRepo.findAll();
	}
	
	public List<Employee> getEmployeeList(){
//		return empRepo.findAll(Sort.by(Sort.Direction.DESC,"salary"));
		return empRepo.findAll(Sort.by(Sort.DEFAULT_DIRECTION.DESC,"salary"));
	}
	
//	public List<Employee> getEmployeeList1(){
//		return empRepo.findAllDescContionedEmployeeDetail();
//	}
//	
//	public List<Employee> getEmployeeFilterByLessThanSalary(Integer salary){
//		return empRepo.findAllByMaxSalary(salary);
//	}
	
	public Optional<Employee> getEmployee(int id){
//		return empRepo.findAll(Sort.by(Sort.Direction.DESC,"salary"));
		Employee emp = new Employee();
		emp.setId(id);
		return empRepo.findById(id);
	}

}
