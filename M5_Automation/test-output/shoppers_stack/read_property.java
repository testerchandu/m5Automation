package shoppers_stack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class read_property {
public static void main(String[] args) throws IOException {
	//step1..>get an obj for external file
	FileInputStream fis=new FileInputStream("./commondata/m5login.properties");
	//step2-->create obj for properties
	Properties prop=new Properties();
	//step3-->load the file
	prop.load(fis);
	//step4--->read the data
	String data = prop.getProperty("url");
	System.out.println(data);
}
}
