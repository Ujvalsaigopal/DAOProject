package DAO;

import Model.Employee;

public interface DAOInterface {
public Employee DAOinsert(Employee emp); 
public String DAOfindbyID(String tempEmpID);
}
