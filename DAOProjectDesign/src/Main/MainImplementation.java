package Main;

import Model.Employee;
import Service.ServiceImplementation;
import Service.ServiceInterface;

public class MainImplementation implements Maininterface {
	public static void main(String[] args)
	{
		ServiceInterface serviceinterface  =  new ServiceImplementation();
		Employee addEmployee = serviceinterface.addEmployee();
		System.out.println("Emplyee Id "+ addEmployee.getEmployeeId());
		System.out.println("Employee Name "+ addEmployee.getName());
	}
}
