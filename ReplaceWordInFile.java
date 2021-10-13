package javaIO;

import java.io.*;  

public class ReplaceWordInFile  
{  
	
	public static StringBuffer Method1(StringBuffer st,String s)
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
	
public static void main(String args[])  
{  
	try  
	{  
		File file=new File("D:\\FileIO\\ToBeModify.txt");  
		FileReader fr=new FileReader(file);   
		
		BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
		
		StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
		
		String line;  
		
		while((line=br.readLine())!=null)  
		{  
			sb.append(line);     
		}  
		fr.close();      
		System.out.println("Contents of File-- \n\nBefore changing: "+sb.toString());  
		String s = "Hiii";
		StringBuffer st = Method1(sb,s);
		System.out.println("After changing : "+st.toString());
	}  
	catch(IOException e)  
	{  
		e.printStackTrace();  
	}  
}  
}  

