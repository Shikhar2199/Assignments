/*
 * 
 * 
 * 
 STRINGTOKENIZER
boolean hasMoreTokens()	          It checks if there is more tokens available.
String nextToken()	              It returns the next token from the StringTokenizer object.
String nextToken(String delim)	  It returns the next token based on the delimiter.
boolean hasMoreElements()	      It is the same as hasMoreTokens() method.
Object nextElement()	          It is the same as nextToken() but its return type is Object.
int countTokens()              	  It returns the total number of tokens.

 * 
 * 
 * */
import java.util.Scanner;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class CheckNum {
	public int[] countElem(StreamTokenizer token) throws IOException
	{	
		int word = 0;
		int num = 0;
//		int t = token.nextToken();
//		System.out.println(t);
		int t;
        while ((t = token.nextToken()) != StreamTokenizer.TT_EOF)
        {
            switch (t)
            {
            case StreamTokenizer.TT_NUMBER:
            	num+=1;
            	break;
            case StreamTokenizer.TT_WORD:
            	word+=1;
            	break;
  
            }
        }
		
	        int[] k = {word,num};
	        return k;
	}
	
	
	 public static void main(String[] args) throws IOException
	 {
		 CheckNum o = new CheckNum();
		 Scanner sc = new Scanner(System.in);
		 String testString2 ="";
		 String testString = "one, two, three, four, 12 15";
		 String t = sc.nextLine();
		// testString2+=t;
		 StringReader sr = new StringReader(t);
		 StreamTokenizer token = new StreamTokenizer(sr);
		 System.out.println(token);
		 int[] i = o.countElem(token);
		System.out.println("String Has "+i[0]+" Words and "+i[1]+" Numbers");
		sc.close();
	}

}
