package employer.employee.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;

import employer.employee.EmployeeApplication;

public class Example {
	
	Integer[] arr = {1,2,1,3,2,1,4};
	
	public Map<Integer,Integer> calNumFunc(){
		
		Map<Integer,Integer> mapList = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				int a = 0;
				if(arr[i] == arr[j]) {
					a = a+1;
					mapList.put(arr[i], a);
				}
			}
		}
		
		return mapList;
	}
	
	public static void main(String[] args) {
		
	}

}
