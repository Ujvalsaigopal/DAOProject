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

	@Override
	public String DAOfindbyID(String tempEmpID) {

		for (Employee arrlist : empArrList) {
			if (tempEmpID.equals(arrlist.getEmployeeId())) {
				return arrlist.getName();
			}
		}
		return tempEmpID;
	}

	@Override
	public String DAOdeleID(String tempdelID) {
		for(Employee arrlist : empArrList) {
			if (tempdelID.equals(arrlist.getEmployeeId())) {
				arrlist = null;	
				System.out.println("Deleted");
			}
		}
		return tempdelID;
	}

	@Override
	public String DAOupdateID(String tempupdateID) {
		Scanner c = new Scanner(System.in);
		for (Employee arrlist : empArrList){
			
			if (tempupdateID.equals(arrlist.getEmployeeId())){
				System.out.println("ID");
				arrlist.setEmployeeId(c.nextLine());
				System.out.println("Updated");
			}
		}
		return c.nextLine();
	}

}
