package com.nextgeni.propertiesconcept;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\nextgeni\\propertiesconcept\\OR.properties");
        prop.load(fis);
        
        System.out.println(prop.getProperty("firstname"));
        System.out.println(prop.getProperty("lastname"));
        System.out.println(prop.getProperty("submitbtn"));
        
        //System.out.println(System.getProperty("user.dir"));
	}

}
