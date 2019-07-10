package fileaccess;

import java.io.IOException;
import java.util.Scanner;

public class tryme {
	public static void main(String[] args) throws IOException 
	{
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Write the LISP code here and end the code by keeping '.' at end of code");
    	String x="";
    	while(sc.hasNext()) // this loop is to concat all the lines of code 
    	{
    		String x1= sc.next();
    		if(x1.equals("exit")) break; // write exit in console so that it means code has been ended
    		x=x+x1;
    	}
    	System.out.println(x);
    	String s;

		s= FilterBrackets(x);
    	System.out.println(s.length());
        while ((s.length()!=0) && (s.contains("[]")||s.contains("()")||s.contains("{}")))
        {
        s = s.replace("[]", "");
        s = s.replace("()", "");
        s = s.replace("{}", "");
        
       }
        if(s.length()==0)
        {
            System.out.println("String is properly closed or nested");
        }
        else
        {
            System.out.println("String is not properly closed or nested");
        }
        
	    }
    
    public static String FilterBrackets(String str) //Method is to remove alphabets
    {
        int len=str.length();
        char arr[] = str.toCharArray();
        String filter = "";
        for (int i = 0; i < len; i++)
        {
            if ((arr[i]=='(') || (arr[i]==')') || (arr[i]=='[') || (arr[i]==']') || (arr[i]=='{') || (arr[i]=='}'))
            {
                filter=filter+arr[i];
            }
        }
        return filter;
    }
}

