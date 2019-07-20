package gitMaster;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import com.sun.jna.platform.FileUtils;


public class GitMaster {

	@Test
	public void logintest() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prashakt\\workspace1\\Gitmasterr\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("www.google.com");
		File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(src, new File("E:\\Workspace\\WebDriverTest\\Screenshot\\google.jpg"));
		
	}
	
}
