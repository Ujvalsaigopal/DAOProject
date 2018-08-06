package payslips;

public class Monthly 

{
    public static void printMonthly() 
    {
        for (int i = 0; i < MainProgramme.list.size(); i++)
            if (MainProgramme.types[i] == "Monthly") 
        {
      
        System.out.println(MainProgramme.list.get(i));
        }
    }
}