package employer.employee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import employer.employee.dao.EmployeeDao;
import employer.employee.model.Employee;

@SpringBootTest
class EmployeeApplicationTests {
	
	@Autowired
	private EmployeeDao empdao;

	@Test
	void contextLoads() {
	}
	
//	@Test
//	public void testEmployeeList() {
//		List<Employee> result = empdao.getEmployeeList1();
////		List<Employee> result = new ArrayList<>();
////		assertEquals(result.size(),1);
////		System.out.println(result.size());
//		assertNotEquals(result.size(), 0);
//	}
	
//	@Test 
//	public void testEmployeeSalaryLessThanGivenSalary() {
//		List<Employee> result = empdao.getEmployeeFilterByLessThanSalary(60000);
//		System.out.println(result.size());
//		assertNotEquals(result.size(), 0);
//	}

}
