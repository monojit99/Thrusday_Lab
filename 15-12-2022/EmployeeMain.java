import java.util.Scanner;
class Employee{
	// take instance variable
	int empid;
	String empName,designation;
	float empSalary;
	int empdoj;
	int crYr;
	public void setData(int id,String name,String desig,float salary,int doj,int cy)// method to store information of employee
	{
		empid=id;
		empName=name;
		designation=desig;
		empSalary=salary;
		empdoj=doj;
		crYr=cy;
	}
	public float getApprisal()// method the calculate appraisal
	{
		if(crYr-empdoj>1) {
		float Salary=empSalary+(empSalary*0.1f);
		return Salary;
		}
		else
		return empSalary;
	}
	public int TA()// method to calculate Travel allowance
	{
		int ta=0;
		if(designation.equals("manager")||designation.equals("Manager"))
			ta=3000;
		else
			ta=1000;
		return ta;
		
	}
	public void display()// method for display employee information
	{
		System.out.println("Emp Id: "+empid);
		System.out.println("Emp Name: "+empName);
		System.out.println("Emp Designation: "+designation);
		System.out.println("Emp Date of joining: "+empdoj);
		
		float salary=getApprisal();//call the getApprisal Method
		System.out.println("Emp Salary: "+salary);
		int travel=TA();// call the TA Method
		System.out.println("Emp Travel: "+travel);
	}
	
}

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);// create the instance of Scanner class
		//take input from users
		System.out.println("Enter the Emp id: ");
		int id=sc.nextInt();
		System.out.println("Enter the Emp Name: ");
		String name=sc.next();
		System.out.println("Enter the Emp Designation: ");
		String desig=sc.next();
		System.out.println("Enter the Emp Salary: ");
		float salary=sc.nextFloat();
		System.out.println("Enter the year of joining: ");
		int joining=sc.nextInt();
		System.out.println("Enter the current Year: ");
		int currentYear=sc.nextInt();
		System.out.println("==================================");
		Employee emp=new Employee();// create instance of Employee class
		emp.setData(id,name,desig,salary,joining,currentYear);// call the setData method
		emp.display();// call the display method for display the information
		

	}

}