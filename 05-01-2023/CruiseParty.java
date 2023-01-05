package basicprograms;
//A party has been organized on cruise. The party is organized for a limited time(T). The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. The task is to find the maximum number of guests present on the cruise at any given instance within T hours.
import java.util.Scanner;

public class CruiseParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
        int t = sc.nextInt ();
        int e[] = new int[t]; //array for entry
        int l[] = new int[t]; //array for leave

        for (int i = 0; i < t; i++) //loop initialize to t times for entry
            e[i] = sc.nextInt ();

        for (int i = 0; i < t; i++) //loop initialize to t times for exit
            l[i] = sc.nextInt ();

        int max = 0, sum = 0; //initialize to 0
        for (int i = 0; i < t; i++)
        {
	        sum += e[i] - l[i]; //calculate spend time in party
	        max = Math.max(sum, max); //calculate max time
        }
        System.out.println(max); //print max time
	}

}
