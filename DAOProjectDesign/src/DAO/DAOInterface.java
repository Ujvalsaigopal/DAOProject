package DAO;

import Model.Employee;

public interface DAOInterface {
public Employee DAOinsert(Employee emp); 
public String DAOfindbyID(String tempEmpID);
public String DAOdeleID(String tempdelID);
public String DAOupdateID(String tempupdateID);
}
