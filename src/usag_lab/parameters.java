package usag_lab;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.github.dockerjava.api.model.Driver;

public class parameters  {
    

	static String Url = "https://www.saucedemo.com/";
	static String StandardUserName = "standard_user";
	static String ProblemUserName = "problem_user";

	static String PerformanceUserName = "performance_glitch_user";

	static String passWord = "secret_sauce";

	static WebDriver driver = new EdgeDriver();

	static void LoginFunction(String userName,String Passwrd) {
	WebElement userNameInputField = driver.findElement(By.id("user-name"));
	userNameInputField.sendKeys("user-name");
	WebElement passwordInputField = driver.findElement(By.id("password"));
	passwordInputField.sendKeys("PassWord");
	driver.findElement(By.id("login-button")).click();

		
		
		
		
	}
	 
}