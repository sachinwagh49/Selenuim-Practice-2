package Groww;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grow_login {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://groww.in/?gclid=CjwKCAjwoP6LBhBlEiwAvCcthA0R5VIffyFe_vAiOtKe9ZJJcpE9JTVFKMpYCXc1n64DX1JgCW9JWRoCxzcQAvD_BwE");

	}

}
