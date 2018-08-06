package Main;
import java.util.*;

import DAO.DAO;
import Services.Service;

public class Main {
 private static final String Birth = null;

public static void main(String[] args){
	 
	 Scanner input = new Scanner(System.in);
	 DAO DAOobj = new DAO();
	 
	 System.out.println("Enter Your Name:");
	 String name= input.nextLine();
	 
	 DAOobj.Name(name);
	 
	 Service Sobj= new Service();
	 System.out.println("DOB:");
	 
	 Sobj.DOB(Birth);

	 Info Iobj= new DAO();
	 Iobj.Showinfo();
 }
}
