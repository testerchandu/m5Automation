package date;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class Reverse_String {
	public static void main(String[] args)
	{ 
		/*String input="nagachandu";
		 String output="";
     	 for(int i=input.length()-1;i>=0;i--)
			 output=output + input.charAt(i);
			 System.out.println(output); */
		String  input = "nolove";
		String output= " ";
		for (int i=input.length()-1;i>=0;i--) 
			output=output+input.charAt(i);
			System.out.println(output);
		}
	}
