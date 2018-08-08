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

@Override
public String displayName() {
	String tempEmpID = ServiceUtilities.displayNameByID();
	String tempName = dao.DAOfindbyID(tempEmpID);
	return tempName;
}

@Override
public String deleteID() {
	String tempdelID = ServiceUtilities.DeleteempbyID();
	String tempdelemp = dao.DAOdeleID(tempdelID);
	return tempdelemp;
}

@Override
public String updateID() {
	String tempupdateID = ServiceUtilities.UpdatebyID();
	String tempupdateemp = dao.DAOupdateID(tempupdateID);
	return tempupdateemp;
}

}

