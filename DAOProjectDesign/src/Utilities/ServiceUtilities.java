package Utilities;

import java.util.Scanner;

import Model.Employee;

public class ServiceUtilities {
	Employee emp = null;
// COllecting the Employee Information from User and return as employee Object.
	public static Employee CollectInfo_add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		String id = sc.next();
		System.out.println("Enter Employee Name:");
		String name = sc.next();
		Employee tempEmp = new Employee(id, name);
		return tempEmp;
	}
	// User input ID to the DAO.
	public static String displayNameByID(){
		Scanner sd = new Scanner(System.in);
		System.out.println("ID:");
		String tempID = sd.next();
		return tempID;
	}
}
