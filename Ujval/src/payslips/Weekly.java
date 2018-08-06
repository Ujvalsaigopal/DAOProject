package payslips;

public class Weekly 
{
    public static void printWeekly() 
    {
        for (int i = 0; i < MainProgramme.list.size(); i++)
            if (MainProgramme.types[i] == "Weekly") 
        {
        System.out.println(MainProgramme.list.get(i));
        }
    }
}