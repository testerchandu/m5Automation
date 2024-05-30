package date;

import java.util.Date;

import org.testng.annotations.Test;
public class datee {
public static void main(String[] args) {
	Date date=new Date();
	System.out.println(date);
			 String cdate = date.toString().replace(" ","--").replace(":", ":");
			//String cdatee = date.toString().replace("-"," ").replace(":", ":");
			//String cha = date.toString().replace(" ", "#").replace(":", ":");
			 System.out.println(cdate);
			//System.out.println(cdatee);
			//System.out.println(cha);		
}
}
