import java.util.Scanner; //import scanner class
class Amstrong {

    public static void main(String[] args) {

        int num, origNum, rem, result = 0; //declare and initialze variables
	System.out.println("enter the number:"); //take user input
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
        origNum = num;

        while (origNum != 0)
        {
            rem = origNum % 10; //take remainder
            result += Math.pow(remainder, 3); //take math module for cubic expression
            origNum /= 10;
        }

        if(result == num)
            System.out.println(number + " is an Armstrong number."); //check the number is amstrong or not
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
