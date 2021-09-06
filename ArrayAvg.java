
import java.util.Scanner;

public class ArrayAvg{
	public int calculateAvg(int[] Arr)
	{
		int sum = 0;
		for(int i:Arr)
		{
			sum+=i;
		}
		int avg=0;
		avg=sum/Arr.length;
		return avg;
	}
		
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		ArrayAvg o = new ArrayAvg();
		
		System.out.println("Enter no. of subjects");
	    int n = sc.nextInt();
	    
	    int[] Arr = new int[n];
	    for(int i = 0;i<n;i++)
		{
			Arr[i] = sc.nextInt();
		}
	    
		int avg = o.calculateAvg(Arr);
		
	    System.out.println("Average of Numbers = "+avg);
	}

}
