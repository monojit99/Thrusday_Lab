import java.util.Scanner; //import scanner class
class Amstrong {

    public static void main(String[] args) {

        int number, originalNumber, remainder, result = 0; /declare and initialze variables
	System.out.println("enter the number:"); //take user input
	Scanner sc=new Scanner(System.in);
	number=sc.nextInt();
        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10; //take remainder
            result += Math.pow(remainder, 3); //take math module for cubic expression
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number."); //check the number is amstrong or not
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}