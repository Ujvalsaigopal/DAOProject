package payslips;

    import java.util.Scanner;

    public class Payslips 

{
    static int tempSalary;
    static double tempHours;
    static Scanner ss = new Scanner(System.in);

    public static void Payslips() 
    {

        {
            Employee tempEmployee = new Employee();
            boolean foundEmployee = false;

            {
                System.out.println("Please enter the employee payroll number to view payslip");
               temppayrollNo = sc.nextInt();

                if (MainProgramme.list.isEmpty() == false) 
                {
                    int a = 0;
                    while (a < MainProgramme.list.size()) 
                    {
                        tempEmployee = MainProgramme.list.get(a);
                        if (tempEmployee.payrollNo == temppayrollNo) 
                        {
                            foundEmployee = true;
                            break;
                        }
                        a++;
                    }
                    if (foundEmployee == true) 
                    {

                        tempEmployee.getType();
                        if (tempEmployee.type == "Weekly") 
                        {
                            System.out.println("Please enter hours worked this week: ");
                            tempHours = ss.nextDouble();
                            System.out.println();
                            System.out.println("PAYSLIP");
                            System.out.println("Week No:"+ (int) (Math.random() * 52));
                            System.out.println("Name: "+ tempEmployee.getName());
                            System.out.println("Payroll No: "+ tempEmployee.getPayrollNo());
                            System.out.println("Address: "+ tempEmployee.getStreet() + ", "+ tempEmployee.getTown() + ", "+ tempEmployee.getPostcode());
                            System.out.println("Tax Code: "+ tempEmployee.getTaxcode());
                            System.out.println("Weekly Pay: £"+ (tempHours * 8.50));
                        }

                        else 
                        {
                            System.out.println("Please Enter Salary (£): ");
                            tempSalary = ss.nextInt();
                            System.out.println();
                            System.out.println("PAYSLIP");
                            System.out.println("Month No:"+ (int) (Math.random() * 12));
                            System.out.println("Name: "+ tempEmployee.getName());
                            System.out.println("Payroll No: "+ tempEmployee.getPayrollNo());
                            System.out.println("Address: "+ tempEmployee.getStreet() + ", "+ tempEmployee.getTown() + ", "+ tempEmployee.getPostcode());
                            System.out.println("Tax Code: "+ tempEmployee.getTaxcode());
                            System.out.println("Salary : £" + tempSalary + " Monthly Pay: £"+ (tempSalary / 12));
                        }
                    } 
                    else 
                    {
                        System.out.println("The payroll number you have entered is incorrect");
                    }
                }
            }
        }
    }
}