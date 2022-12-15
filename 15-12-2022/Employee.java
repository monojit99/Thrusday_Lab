import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		
		int servYear,bonus=0,joiningYear,currentYear;
		
		System.out.println("Enter the joining year: ");
		Scanner obj=new Scanner(System.in);
		joiningYear=obj.nextInt();
		System.out.println("Enter the current year: ");
		currentYear=obj.nextInt();
		servYear=currentYear-joiningYear;
		if(servYear>3)
			bonus=2500;
		System.out.println("Bounus is: "+bonus);
		

	}

}