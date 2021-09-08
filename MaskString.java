package Assignment_6Sept;

public class MaskString {
	public String MaskON(String[] arr,int n) 
	{
		String Pr = "";
		for(int i=0; i<n;i++)
		{
			for(int j=0; j<arr[i].length();j++)
			{
				if(j>2 && j<arr[i].length()) 
				{
					Pr += "X";
				}
				else 
				{
				    char a=arr[i].charAt(j);
					Pr += a;
				}
				
			}
			Pr+=" ";
		}
		return Pr;
	}
	public static void main(String[] args)
	{
		MaskString o = new MaskString();
		String str = "Shikhar Upadhyay";
		String[] arr = str.split(" ");
		int n = arr.length;
		String Pr = o.MaskON(arr,n);
		System.out.println(Pr);
		}
		
	}
	
