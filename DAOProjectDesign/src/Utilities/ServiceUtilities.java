package Utilities;

import java.util.Scanner;

import Model.Employee;

public class ServiceUtilities {
	Employee emp = null;

	public static Employee CollectInfo_add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		String id = sc.nextLine();
		System.out.println("Enter Employee Name:");
		String name = sc.nextLine();
		Employee tempEmp = new Employee(id, name);
		sc.close();
		return tempEmp;
	}
}
