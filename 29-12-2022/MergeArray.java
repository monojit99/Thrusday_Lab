package basicprograms;
//Merge Two array
public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[]a = {5,6,4,8,5,2,9};
	      int[]b = {7,3,6,8,5,3,2};
	      int[]c = new int[a.length+b.length];
	      int count = 0;
	      
	      for(int i = 0; i < a.length; i++) { 
	         c[i] = a[i];
	         count++;
	      } 
	      for(int j = 0; j < b.length;j++) { 
	         c[count++] = b[j];
	      } 
	      for(int i = 0;i < c.length;i++) 
	    	 System.out.print(c[i]+" ");
	   } 
	}
