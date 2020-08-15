package com.autodeskcrm.contacttest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.autodesk.genricUtils.FileUtils;
import com.mysql.jdbc.Driver;

public class ContactTest 
{
	/**
	 * 
	 * @author Bishnupriya
	 * @throws Throwable 
	 * 
	 */
	@Test
 public void createContact() throws Throwable
 {
	/*Register the database driver*/
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		
		/*connect to database*/
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "admin");
		
		/*create statement*/
		Statement stat = con.createStatement();
		String query = "select * from actor_info";
		
		/*execute the query*/
		ResultSet result = stat.executeQuery(query);
		
		/*display the result*/
		while(result.next())
		{
			System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
		}
		
		/*close the connection*/
		con.close();
		
		
		
		
//		/* read data from properties file*/
//		FileUtils pObj=new FileUtils();
//		
//		
//		String URL = pObj.getPropertyFileData("url");
//		System.out.println(URL);
//		
		
 }
	
}
