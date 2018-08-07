package Service;

import DAO.DAOInterface;
import DAO.DAOimplementation;
import Model.Employee;
import Utilities.ServiceUtilities;

public class ServiceImplementation implements ServiceInterface{
private DAOInterface dao;

public ServiceImplementation() {
	super();
	this.dao = new DAOimplementation();
}

@Override
public Employee addEmployee() {
	Employee serviceTempEmp = ServiceUtilities.CollectInfo_add();
	Employee tempHolder =  dao.DAOinsert(serviceTempEmp);
	return tempHolder;
}

}

