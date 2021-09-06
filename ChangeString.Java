package Assignment_6Sept;

public class ChangeString {
	public String MaskON()
	{
		return " ";
	}
	public static void main(String[] args) {
		String st="Halo";
		char[] starr = new char[st.length()];
		for(int i = 0;i < st.length();i++)
		{
			char temp = st.charAt(i);
			if(temp=='a')
			{
				starr[i] = 'o';	
			}
			else
			{
				starr[i] = st.charAt(i);
			}
			
		}
		for(int i = 0;i < st.length();i++)
		{
			if(i==2)
			{
				char temp = starr[i];
				//char upper = Character.toUpperCase(temp);
				//starr[i] = upper;
//				
			}
		}
		
		System.out.println(starr);
	}

}
/*
  package Assignment_6Sept;

public class ChangeString {
	public String MaskON(String st)
	{
		char[] starr = new char[st.length()];
		for(int i = 0;i < st.length();i++)
		{
			char temp = st.charAt(i);
			if(temp=='a')
			{
				starr[i] = 'o';	
			}
			else
			{
				starr[i] = st.charAt(i);
			}
			System.out.println(st.charAt(i));
		}
		for(int i = 0;i < st.length();i++)
		{
			if(i==2)
			{
				char temp = starr[i];
				char upper = Character.toUpperCase(temp);
				starr[i] = upper;
	
			}
		}
		System.out.println(starr);
		String s = new String(starr);
		return s;
	}
	public static void main(String[] args) {
		String st="Halo";
		ChangeString o = new ChangeString();
		String printr = o.MaskON(st);
	}

}

 */
