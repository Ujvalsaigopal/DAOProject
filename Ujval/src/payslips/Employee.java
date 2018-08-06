package payslips;

public class Employee extends MainProgramme 

{


    public Employee() 
    {

    }
    //initialises variables
    public String name;
    public String street;
    public String town;
    public String postcode;
    public int payrollNo;
    public char taxcode;
    public String type;



    public Employee(String name, String street, String town, String postcode, int payrollNo, char taxcode, String type) 
    {
        //sets constructors
        this.name = name;
        this.street = street;
        this.town = town;
        this.postcode = postcode;
        this.payrollNo = payrollNo;
        this.taxcode = taxcode;
        this.type = type;

    }

    //sets the getters and setters
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street) 
    {
        this.street = street;
    }

    public String getTown() 
    {
        return town;
    }

    public void setTown(String town) 
    {
        this.town = town;
    }

    public String getPostcode() 
    {
        return postcode;
    }

    public void setPostcode(String postcode) 
    {
        this.postcode = postcode;
    }

    public int getPayrollNo()
    {
        return payrollNo;
    }
    public void setPayrollNo(int payrollNo)
    {
        this.payrollNo = payrollNo;
    }

    public char getTaxcode()
    {
        return taxcode;
    }
    public void setTaxcode(char taxcode)
    {
        this.taxcode = taxcode;
    }

    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    //when printing employee list method it sets the input to display as below
    public String toString() 
    {
        return "Name: " + this.name + " / "  + "Street: " + this.street + " / "

        + "Town: " + this.town + " / " + "Postcode: " + this.postcode + " / " + "Payroll Number: " + this.payrollNo
        + " / " + "Tax Code: " + this.taxcode + " / " + "Type: " + this.type;
    }

}