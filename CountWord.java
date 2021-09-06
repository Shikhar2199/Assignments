

public class CountWord {
	public int CountJava(String[] arr)
	{   int count=0;
		String s="Java"; 
		for(String i:arr) 
		{	
			if(i.equals(s))
			{
				count+=1;
				System.out.println("Count++");
			}
			System.out.println(i);
		}
		return count;
	}

	public static void main(String[] args) {
		CountWord o = new CountWord();
		String st = "Java is Object oriented. Java is platform independent. Java is simple.";
		String[] arr = st.split("\\s+");
		int C = o.CountJava(arr);
		System.out.println(C);
	}

}
