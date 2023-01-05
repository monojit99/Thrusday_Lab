package basicprograms;
//Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
import java.util.Scanner;
public class StringOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count1=0,count2=0; //initialize to 0
		for(int i=0;i<str.length();i++)
		{
         		if(str.charAt(i)=='*') //checking the character *
                		count1++;
         		else if(str.charAt(i)=='#') //checking the character #
                 		count2++;
		}
		System.out.println(count1-count2); //deviate two count
	}
}
