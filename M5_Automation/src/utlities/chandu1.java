package utlities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class chandu1 {
public String readproperties(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./commondata/m5login.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String data = prop.getProperty( "key");
	return data;
}
}