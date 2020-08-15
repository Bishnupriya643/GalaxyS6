package com.autodesk.genricUtils;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @author bishnupriya
 * this utility class used to read the data from properties file
 *
 */
public class FileUtils 
{
	/**
	 * used to get the data from properties file
	 * @param key
	 * @return value
	 * @throws Throwable
	 */
public String getPropertyFileData(String key) throws Throwable
{
	FileInputStream fis=new FileInputStream("./Resources/commonData.properties");
	 
	 Properties pobj=new Properties();
	 pobj.load(fis);
	 
	String value = pobj.getProperty(key);
	
	return value;
	
}
}
