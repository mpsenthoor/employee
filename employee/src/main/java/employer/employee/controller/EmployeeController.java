package employer.employee.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import employer.employee.dao.EmployeeDao;
import employer.employee.model.Employee;

@CrossOrigin
@RestController
//@RequestMapping(path = "/Employee", produces = "application/xml")
//@RequestMapping(path = "/Employee", produces = MediaType.APPLICATION_XML_VALUE)
@RequestMapping("/Employee")
public class EmployeeController {
	@Autowired
	private EmployeeDao empDao;
	
	@PostMapping("/add")
	public List<Employee> addEmployee(@RequestBody Employee emp){
		return empDao.addEmployee(emp);
	}
	
	@PostMapping("/delete")
	public List<Employee> updateEmployee(@RequestBody Employee emp){
		return empDao.deleteEmployee(emp);
	}
	
	@GetMapping("/employeedetail")
//	@RequestMapping(path = "/employeedetail" , produces = "application/xml")
	public List<Employee> getEmployeeList(){
		return empDao.getEmployeeList();
	}
	
//	@GetMapping("/descEmpList")
////	@RequestMapping(path = "/employeedetail" , produces = "application/xml")
//	public List<Employee> getEmployeeListDesc(){
//		return empDao.getEmployeeList1();
//	}
	
	@GetMapping("/getemployee/{id}")
	public Optional<Employee> getEmployee(@PathVariable("id") Integer id) {
//		List<String> li = new ArrayList<String>();
//		li.add("a");
//		li.add("b");
//		li.add("c");
//		List<Employee> li1 = new ArrayList<Employee>();
//		Employee employee = new Employee();
//		employee.setEmployee("Senthoor");
//		employee.setSalary(60000.0);
//		li1.add(employee);
//		employee.setEmployee("Senthoor");
//		employee.setSalary(80000.0);
//		li1.add(employee);
//		
//		Stream.of(li1).forEach(emp -> {
//			for(int i = 0; i < emp.size(); i++) {
//				System.out.println(emp.get(i).getEmployee());
//			}
//			
//			
//		});
//		
//		return empDao.getEmployee(id);
		return empDao.getEmployee(id);
		
	}

}
