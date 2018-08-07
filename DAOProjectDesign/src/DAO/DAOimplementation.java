package DAO;

import java.util.*;
import java.util.ArrayList;

import Model.Employee;

public class DAOimplementation implements DAOInterface {
	
	List<Employee> empArrList = new ArrayList<>();
	
	@Override
	public Employee DAOinsert(Employee serviceTempEmp) {
		empArrList.add(serviceTempEmp);
		return serviceTempEmp;
	}
	
		
	}

