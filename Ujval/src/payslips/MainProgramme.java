package payslips;

import java.util.*;

import payslips.Employee;
import payslips.Payslips;

public class MainProgramme 
{
    public static String name;
    public static String street;
    public static String town;
    public static String postcode;
    public static int payrollNo;
    public static char taxcode;
    public static String type;

    static Scanner sc = new Scanner(System.in);
    static Scanner sd = new Scanner(System.in);
    static int tempvar;
    static int temppayrollNo;

    static ArrayList<Employee> list = new ArrayList<Employee>();

    static String names[] = { "John Hepburn", "David Jones", "Louise White",
        "Harry Martin", "Christine Robertson" };

    static String streets[] = { "50 Granton Road", "121 Lochend Park",
            "100 Govan Avenue", "51 Gorgie Road", "1 Leith Street" };

    static String towns[] = { "Edinburgh", "Edinburgh", "Glasgow", "Edinburgh",
            "Edinburgh" };

    static String postcodes[] = { "EH6 7UT", "EH1 1BA", "G15 5GG", "EH5 2PR",
            "EH4 4ST" };

    static int payrollNos[] = { 10001, 10002, 10003, 10004, 10005 };

    static char taxcodes[] = { 'C', 'B', 'C', 'C', 'B' };

    static String types[] = { "Monthly", "Weekly", "Monthly", "Monthly","Weekly" };

    public static void main(String[] args) 
    {
        for (int i = 0; i < 5; i++) {
            name = names[i];
            street = streets[i];
            town = towns[i];
            postcode = postcodes[i];
            payrollNo = payrollNos[i];
            taxcode = taxcodes[i];
            type = types[i];
            Employee e = new Employee(name, street, town, postcode, payrollNo,taxcode, type);

            list.add(e);

        }

        // statements and prompts within the console for the user to follow
        System.out.println("Welcome to your Payroll System");
        System.out.println();
        System.out.println("Please enter your choice below from the following options");
        System.out.println();
        System.out.println("View all current weekly employees = 1 ");
        System.out.println("View all current monthly employees = 2 ");
        System.out.println("Delete an employee = 3 ");
        System.out.println("Add an employee = 4 ");
        System.out.println("Print an employee payslip = 5");
        System.out.println("To exit the system = 0 ");

        // allows user to enter number of choice and this reflects which statement is ran in userChoice method
        tempvar = sc.nextInt();

        // runs the userChoice method
        userChoice();
    }

    // method to determine what statement runs according to which choice user makes
    public static void userChoice() 
    {
        Employee tempEmployee = new Employee();
        boolean foundEmployee = false;

        // if user enters 1 it prints out the employee list.
        if (tempvar == 1) 
        {
            Weekly.printWeekly();

        } 
        else if (tempvar == 2) 
        {
            Monthly.printMonthly();

        } 
        else if (tempvar == 3) 
        { 
            printEmployeelist();
            System.out.println("");
            System.out.println("Above are a list of all employees.");
            System.out.println("Please enter the payroll number of the employee you wish to delete from the system");
            temppayrollNo = sc.nextInt();

            // while loop to search on payroll number, deletes the employee if correct, error message if not
            if (list.isEmpty() == false) 
            {
                int a = 0;
                while (a < list.size()) 
                {
                    tempEmployee = list.get(a);
                    if (tempEmployee.payrollNo == temppayrollNo) 
                    {
                        foundEmployee = true;
                        break;
                    }
                    a++;
                }
                if (foundEmployee == true) 
                {
                    System.out.println("You have deleted : "+ tempEmployee.getName());
                    System.out.println();
                    list.remove(tempEmployee);
                    printEmployeelist();
                } 
                else 
                {
                    System.out.println("The payroll number you have entered is incorrect");
                }
            }
        }

        else if (tempvar == 4) // allows the user to add an employee to the employee list, entering details using scanner
        {
            // initialises variables for entering title
            String tempstring1;
            int stringlength;
            int whitespace;
            String tempstring2;
            String tempstring3;
            // initialises variables for entering title
            String tempstring4;
            int stringlength2;
            int whitespace2;
            String tempstring5;
            String tempstring6;

            String tempstring7;

            System.out.println("You have chosen to add an employee to the system");
            System.out.println();

            // block of code that builds string together to get employee name
            System.out.println("Please enter the name of the new employee: ");
            tempstring1 = sd.nextLine(); // takes in string using scanner
            stringlength = tempstring1.length(); // saves length of string
            if (tempstring1.contains(" ")) // if statement to see if the string contains a space
            {
                whitespace = tempstring1.indexOf(" "); // finds the whitespace
                tempstring2 = tempstring1.substring((0), (whitespace));// creates string from start of input to whitespace
                tempstring3 = tempstring1.substring((whitespace) + 1,(stringlength));// creates string from whitespace plus one and adds on rest of the string
                tempEmployee.setName(tempstring2 + " " + tempstring3); // combines tempstring1 and tempstring2 together to complete full string
            } 
            else // else statement that just enters the string if it is just one word
            {
                tempEmployee.setName(tempstring1);
            }

            // block of code that repeats same process as above to get street name
            System.out.println("Please enter the address of the employee: ");
            tempstring4 = sd.nextLine();
            stringlength2 = tempstring4.length();
            if (tempstring4.contains(" ")) {
                whitespace2 = tempstring4.indexOf(" ");
                tempstring5 = tempstring4.substring((0), (whitespace2));
                tempstring6 = tempstring4.substring((whitespace2) + 1,(stringlength2));
                tempEmployee.setStreet(tempstring5 + " " + tempstring6);
            } 
            else 
            {
                tempEmployee.setStreet(tempstring4);
            }

            System.out.println("Please enter the town: ");
            tempEmployee.setTown(sd.nextLine());// takes in town using scanner
            System.out.println("Please enter the postcode: ");
            tempstring7 = sd.nextLine(); //post code using scanner

            if (tempstring7.length() > 5 && tempstring7.length() < 9) // sets the length of string

            {
                tempEmployee.setPostcode(tempstring7);
            } 
            else 
            {
                tempEmployee.setPostcode("You have not entered a valid UK postcode");
            }

            tempEmployee.setPayrollNo(payrollNo + 1); // sets payroll number to next in sequence

            System.out.println("Please enter your Tax code (A, B or C): ");
            tempEmployee.setTaxcode(sd.next().charAt(0));// takes in tax code using scanner

            System.out.println("Please enter Employee Type (Weekly or Monthly): ");
            tempEmployee.setType(sd.next()); //takes in type of employee

            list.add(tempEmployee);// creates temp employee and adds to list
            printEmployeelist();// prints employee list to view
        }

        else if (tempvar == 5) 
        {
            Payslips.Payslips(); //runs payslip method from payslip class
        }

        else if (tempvar == 0) // if user hits 0 it allows them to exit the programme

        {
            System.out.println("You have exited the system");
            System.exit(0);
        }

        else // if any other choice entered they will be met with this message
        {
            System.out.println("You have entered the wrong choice");
        }
    }

    // method to create the book list using a for loop
        public static void printEmployeelist() {
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}