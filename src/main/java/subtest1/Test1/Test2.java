package subtest1.Test1;


import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.internal.WrapsDriver;
import org.testng.annotations.Test;

import utility.Xls_Reader;

public class Test2 {

	WebDriver driver ;
	
	Xls_Reader excel ;
	
	Properties config = new Properties() ;
//	Logger log ;
	
	@Test
	public void check() throws IOException{
		
		File file = new File("C:\\Java Workspace\\Test1\\Data2\\env.properties") ;
		
		FileInputStream fis = new FileInputStream(file);
		
		config.load(fis);
		
		System.out.print(config.getProperty("browser"));
		
		//System.out.print("Hi");
		//driver = new ChromeDriver();
		//excel = new Xls_Reader("") ;
		
		
	}
	
	
	
	
	
}
