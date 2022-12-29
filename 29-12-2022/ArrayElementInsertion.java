package basicprograms;
//Element insertion in specific position in array
import java.util.Scanner;

public class ArrayElementInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n, pos, x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:"); //take input
        n = s.nextInt();
        int a[] = new int[n+1];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt(); //store the element in perfect index position
        }
        System.out.print("Enter the position where you want to insert element:");
        pos = s.nextInt(); //add the element in given index position
        System.out.print("Enter the element you want to insert:");
        x = s.nextInt();
        for(int i = (n-1); i >= (pos-1); i--)
        {
            a[i+1] = a[i];
        }
        a[pos-1] = x;
        System.out.print("After inserting:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+","); //print all the elements after inserting
        }
        System.out.print(a[n]);
    }
}
