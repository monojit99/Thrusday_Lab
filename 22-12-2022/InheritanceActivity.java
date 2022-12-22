package basicprogram;
//Parent class Employee1(base class)
class Employee1
{
	long employeeid;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance;
	double Hra;
	public void Employee1(long Id,String Name,String address,long phone)
	{
	employeeid=Id;
	employeeName=Name;
	employeeAddress=address;
	employeePhone=phone;
	}
	public void calculateSalary() //method for salary calculation
	{
	double salary;
	salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100); //calculate salary
	System.out.println(salary);
	}
	public void calculateTransportAllowance()
	{
		double transportAllowance;
		transportAllowance=0.1*basicSalary; //calculate travel allowance foe Employee class
		System.out.println(transportAllowance);
	}
}
class Manager extends Employee1 //Manager class inherit base class Employee1(child class)
{
	public Manager(long Id,String Name,String address,long phone,double salary) //parameter list for Manager constructor
	{
		employeeid=Id;
		employeeName=Name;
		employeeAddress=address;
		employeePhone=phone;
		basicSalary=salary;
		System.out.println("id:"+" "+employeeid+" "+"name:"+" "+employeeName+" "+"address:"+" "+"phone:"+" "+employeePhone+" "+"salary:"+" "+basicSalary);
	}
	public void calculateTransportAllowance() //method to declare travel allowance
	{
		double transportAllowance;
		transportAllowance=15*basicSalary/100; //calculate travel allowance for manager
		System.out.println(transportAllowance);
	}
}
class Trainee extends Employee1
{
	public Trainee(long Id,String Name,String address,long phone,double salary)
	{
		employeeid=Id;
		employeeName=Name;
		employeeAddress=address;
		employeePhone=phone;
		basicSalary=salary;
		System.out.println("id:"+" "+employeeid+" "+"name:"+" "+employeeName+" "+"address:"+" "+"phone:"+" "+employeePhone+" "+"salary:"+" "+basicSalary); //print the values
	}
}
public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mg=new Manager(126534l,"Peter","Chennai India",237844,65000.00); //parameter for Manager constructor
		System.out.println("Your Salary:");
		mg.calculateSalary();
		System.out.println("Your TravelAllowance:");
		mg.calculateTransportAllowance(); //call the method
		Trainee tn=new Trainee(29846l,"Jack","Mumbai India",442085,45000.00); //parameter for trainee constructor
		System.out.println("Your Salary:");
		tn.calculateSalary();
		System.out.println("Your TravelAllowance:");
		tn.calculateTransportAllowance(); //call the method
		
				
	}

}
