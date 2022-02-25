package HDFC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFC_login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://netbanking.hdfcbank.com/netbanking/CCLogin.html?_ga=2.58148526.564884579.1635751390-1464912681.1635751390");
		
	}

}
