package Assignment_7Sept;

public class ReplaceWord {
	public StringBuffer Method1(StringBuffer st,String s)
	{	
		
 		int start = st.indexOf(s);
		int end = st.lastIndexOf(s);
		int i=start;		//finding limits for loop
		
		String changTo = "Python";
		int rem=changTo.length();
		end+=(rem-1);		//How Changing word will affect Actual String
		
		while(i <= end)
		{
			int itr=s.length();
			st.replace(i, i+itr, "Python");//ChangeWord
			//System.out.println("Changed "+i);
			int nextIndex=st.indexOf(s, i+itr);
			if(nextIndex<end && nextIndex>start) 
			{
				i=nextIndex;
			}
			else 
			{
				break;
			}
					//System.out.println(i+" "+end+" "+nextIndex+" "+itr);
					//end=st.lastIndexOf("Java");  
		}
		return st;
	}

	public static void main(String[] args) 
	{
		ReplaceWord o = new ReplaceWord();
		StringBuffer st = new StringBuffer("Java is Object Oriented. Java is a Programming Language");
		String s="Java";
		
		StringBuffer print = o.Method1(st,s);
		System.out.println(print);
	}

}
