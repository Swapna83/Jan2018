class Employee
{
    String name;
    final int emp_id;
    static String company_name = "IBM";
    static int counter = 0;
    Employee(String name)
    {
        this.name = name;
        this.emp_id = set_Id();
    }
    static int set_Id()
    {
        counter++;
        return counter;
    }
    static String setCompany()
    {
        return company_name = "Infosys";
        
    }    
    void print()
    {
        System.out.println(" Emp_name : " + this.name + " Emp_id : " + this.emp_id );
        System.out.println(" Company Name : " + Employee.company_name);
    }    
}
public class Employee_StaticExample
{
    public static void main(String[] args)
    {
        System.out.println(Employee.setCompany());
       Employee emp1 = new Employee( "ABC");
       emp1.print();
       Employee emp2 = new Employee( "XYZ");
       emp2.print();
    }

}
