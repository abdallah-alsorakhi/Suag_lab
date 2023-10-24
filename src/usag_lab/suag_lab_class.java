package usag_lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class suag_lab_class extends parameters {

	@BeforeTest
	public void mySetup() {
		// System.setProperty("webdriver.edge.driver", "path_to_edgedriver_executable");
		// driver = new EdgeDriver();
		driver.get(Url);
	}

	@Test
	public void LoginWithStandardUser() throws InterruptedException {
		LoginFunction(StandardUserName, passWord);

		Thread.sleep(3000);

	}

	@Test
	public void LoginWithProblemUser() throws InterruptedException {
		LoginFunction(StandardUserName, passWord);

		Thread.sleep(3000);

	}

	@Test
	public void LoginWithPerformanceUser() throws InterruptedException {

		LoginFunction(StandardUserName, passWord);

		Thread.sleep(3000);

	}

	@AfterTest
	public void myPostTesting() {
		driver.quit();
	}
}
