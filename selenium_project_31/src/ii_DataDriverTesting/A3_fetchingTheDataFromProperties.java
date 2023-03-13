package ii_DataDriverTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class A3_fetchingTheDataFromProperties {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./xlsxfile/Input2.properties");
		Properties property=new Properties();
		property.load(fis);
	    String s=property.getProperty("username");
	    String s1=property.getProperty("password");
	    System.out.println(s +" "+s1 );
	}

}
