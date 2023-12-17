package com.simplylearn.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUploadTest {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		

		// step1: formulate a test domain url & driver path
		String siteUrl = "file:///C://Users//KAVYA//eclipse-workspace//phase1-selenium-sikuli//static//upload-docs.html";
		String driverPath = "drivers/windows/geckodriver.exe";

		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.geckodriver.driver", driverPath);

		// step3: instantiate selenium webdriver
		String inputFiePath="C:\\Users\\KAVYA\\eclipse-workspace\\phase1-selenium-sikuli\\sikuli-inputs";
		WebDriver driver = new ChromeDriver();
		Screen screen = new Screen();
		
		Pattern pattern = new Pattern(inputFiePath+"choosefile.PNG");
		Pattern fileInput = new Pattern(inputFiePath+"file-text-box.PNG");
		Pattern openButton = new Pattern(inputFiePath+"open-button.PNG");
		
		// make browser window full screen
		driver.manage().window().maximize();
		// step4: launch browser
		driver.get(siteUrl);
		
		Thread.sleep(2000);
		
		screen.click(pattern);
		
		Thread.sleep(2000);
		
		screen.click(fileInput);
		
		screen.type(fileInput, (inputFiePath + "amazon-tv.png") );
		
		Thread.sleep(2000);
		
		screen.click(openButton);
		
		
		
		// step6: close driver
		// driver.close();
	}
}
