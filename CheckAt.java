package Assignment_6Sept;
import java.util.Scanner;
/**
 * @author shikhar.upadhyay
 *
 */
public class CheckAt {
	public boolean StringCheck(String[] starr)
	{
		int start=0;
		int ends=starr.length;
		boolean b = false;
		System.out.println(starr[start]+starr[(ends)-1]);
		if(starr[start].equals("A")) 
		{
			if(starr[(ends)-1].equals("t"))
			{
				b=true;
			}
		}
		
			
			System.out.print("");
		return b;
	}
	public static void main(String[] args)
	{
		CheckAt o = new CheckAt();
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String[] starr = st.split("");
		boolean b = o.StringCheck(starr);
		if(b)
		{
			System.out.println("Correct String");
		}
		else if(b==false)
		{
			System.out.println("Incorrect String");		}
	}
	

}
