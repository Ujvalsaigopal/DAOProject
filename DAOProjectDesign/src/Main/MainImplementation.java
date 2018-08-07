package Main;

import Model.Employee;
import Service.ServiceImplementation;
import Service.ServiceInterface;

public class MainImplementation implements Maininterface {

	ServiceInterface serviceinterface = new ServiceImplementation();

	public static void main(String[] args) {
		MainImplementation mainImplementation = new MainImplementation();
		mainImplementation.addEmpMain();
		mainImplementation.displayByID();
	}

	private void addEmpMain() {
		Employee addEmployee = serviceinterface.addEmployee();
		System.out.println("Emplyee Id " + addEmployee.getEmployeeId());
		System.out.println("Employee Name " + addEmployee.getName());
	}

	private void displayByID() {
		String displayEmpname = serviceinterface.displayName();
		System.out.println(displayEmpname);
	}
}
