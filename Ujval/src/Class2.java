
public class Class2 extends Class2P {

 
 
public Class2(int iD, String name) {
	super();
	ID = iD;
	this.name = name;
}

public Class2(int iD, String name, String address) {
	super();
	ID = iD;
	this.name = name;
	this.address = address;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	if(ID<10)
	{
		ID = iD;	
	}
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
 
 
}

