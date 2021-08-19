package com.newframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class Fetchdata implements AutoConstants1 {
	public String data(String key) throws FileNotFoundException, IOException
	{
		Properties ref=new Properties();
		ref.load(new FileInputStream(propertyfilepath));
		return ref.getProperty(key);
	}

}

