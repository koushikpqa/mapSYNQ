package com.MapsynqTestCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




/*
**********************************
This class file enlists all the test cases
for the mapsynq application 
**********************************
*/

public class MapsynqTestCases {
	
	public static WebDriver driver;	
	public String baseUrl = "http://www.mapsynq.com";	
	
	@BeforeTest
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTools\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	//Access mapsynq application in chrome browser
	@Test(priority=1, alwaysRun=true)
	public void launchApplication() throws InterruptedException {
		driver.get(baseUrl);	
		driver.manage().window().maximize();
		Thread.sleep(2000);
		}
	
	//Close the Galactio application promotion over floor map
	@Test(priority=2, dependsOnMethods= {"launchApplication"}, alwaysRun=true)
	public void promotionalWindow() throws InterruptedException {
		WebElement promoclose = driver.findElement(By.xpath("//div[@id='ad_toggle']"));
		promoclose.click();	
		Thread.sleep(10000);
	}
	
	//Close the left pane for entering directions
	@Test(priority=3, dependsOnMethods= {"launchApplication"}, alwaysRun=true)
	public void LeftWindowClose() throws InterruptedException {
		WebElement leftpaneclose = driver.findElement(By.xpath("//div[@id='sp_toggle']"));
		leftpaneclose.click();	
		Thread.sleep(10000);
	}
	
	//De-select the Incidents Tab over map
	@Test(priority=4, dependsOnMethods= {"launchApplication"}, alwaysRun=true)
	public void CloseIncidentsTAB() throws InterruptedException {
		WebElement incidentsTabClose = driver.findElement(By.xpath("//div[@class='incidentsButtonItemActive']"));
		incidentsTabClose.click();	
		Thread.sleep(10000);
	}
	
	//Select Traffic Tab over map
	@Test(priority=5, dependsOnMethods= {"launchApplication"}, alwaysRun=true)
	public void OpenTrafficTAB() throws InterruptedException {
		WebElement TrafficTabClick = driver.findElement(By.xpath("//div[@class='speedButtonItemInactive']"));
		TrafficTabClick.click();	
		Thread.sleep(10000);
	}
	
	//De-select Traffic Tab
	@Test(priority=6, dependsOnMethods= {"launchApplication"}, alwaysRun=true)
	public void CloseTrafficTAB() throws InterruptedException {
		WebElement ClickTrafficTabToClose = driver.findElement(By.xpath("//div[@class='speedButtonItemActive']"));
		ClickTrafficTabToClose.click();	
		Thread.sleep(10000);
	}
	
	//Select Incidents Tab
	@Test(priority=7, dependsOnMethods= {"launchApplication"}, alwaysRun=true)
	public void OpenIncidentsTAB() throws InterruptedException {
		WebElement incidentsTabToOpen = driver.findElement(By.xpath("//div[@class='incidentsButtonItemInactive']"));
		incidentsTabToOpen.click();	
		Thread.sleep(10000);
	}
	
	//De-select Incidents Tab
	@Test(priority=8, dependsOnMethods= {"launchApplication"}, alwaysRun=true)
	public void CloseIncidentsTAB2() throws InterruptedException {
		WebElement incidentsTabClose2 = driver.findElement(By.xpath("//div[@class='incidentsButtonItemActive']"));
		incidentsTabClose2.click();	
		Thread.sleep(10000);
	}
	
	//Select Parking Tab
	@Test(priority=9, dependsOnMethods= {"launchApplication"}, alwaysRun=true)
	public void OpenParkingTAB() throws InterruptedException {
		WebElement parkingTabOPen = driver.findElement(By.xpath("//div[@class='parkingButtonItemInactive']"));
		parkingTabOPen.click();	
		Thread.sleep(10000);
	}
	
	//De-select Parking Tab
	@Test(priority=10, dependsOnMethods= {"launchApplication"}, alwaysRun=true)
	public void CloseParkingTAB() throws InterruptedException {
		WebElement parkingTabClose = driver.findElement(By.xpath("//div[@class='parkingButtonItemActive']"));
		parkingTabClose.click();	
		Thread.sleep(10000);
	}
	
	//Select Cameras Tab
	@Test(priority=11, dependsOnMethods= {"launchApplication"}, alwaysRun=true)
	public void OpenCamerasTAB() throws InterruptedException {
		WebElement camerasTabOPen = driver.findElement(By.xpath("//div[@class='cameraButtonItemInactive']"));
		camerasTabOPen.click();	
		Thread.sleep(10000);
	}
	
		
	//Select Toll Tab
	@Test(priority=11, dependsOnMethods= {"launchApplication"}, alwaysRun=true)
	public void OpenTollTAB() throws InterruptedException {
		WebElement tollTabOpen = driver.findElement(By.xpath("//div[@class='erpButtonItemInactive']"));
		tollTabOpen.click();	
		Thread.sleep(10000);
	}
	
	//De-select Toll Tab
	@Test(priority=12, dependsOnMethods= {"launchApplication"}, alwaysRun=true)
	public void CloseTollTAB() throws InterruptedException {
		WebElement tollTabClose = driver.findElement(By.xpath("//div[@class='erpButtonItemActive']"));
		tollTabClose.click();	
		Thread.sleep(10000);
	}
	
	//Select all Tabs
	@Test(priority=13, dependsOnMethods= {"launchApplication"}, alwaysRun=true)
	public void OpenAllTAB() throws InterruptedException {
		WebElement allTabOpen1 = driver.findElement(By.xpath("//div[@class='erpButtonItemInactive']"));
		//WebElement allTabOpen2 = driver.findElement(By.xpath("//div[@class='cameraButtonItemInactive']"));
		WebElement allTabOpen3 = driver.findElement(By.xpath("//div[@class='parkingButtonItemInactive']"));
		WebElement allTabOpen4 = driver.findElement(By.xpath("//div[@class='incidentsButtonItemInactive']"));
		WebElement allTabOpen5 = driver.findElement(By.xpath("//div[@class='speedButtonItemInactive']"));
		
		allTabOpen1.click();	
		Thread.sleep(5000);
		//allTabOpen2.click();
		//Thread.sleep(5000);
		allTabOpen3.click();
		Thread.sleep(5000);
		allTabOpen4.click();
		Thread.sleep(5000);
		allTabOpen5.click();
		Thread.sleep(10000);
	}
	
	
	//Open the left pane to find Directions	
	@Test(priority=14, dependsOnMethods= {"launchApplication"}, alwaysRun=true)
	public void LeftWindowOpen() throws InterruptedException {
		WebElement leftpaneopen = driver.findElement(By.xpath("//div[@id='sp_toggle']"));
		leftpaneopen.click();	
		Thread.sleep(10000);
	}
		
		//Click on Directions TAB in the left pane to find Directions	
		@Test(priority=15, dependsOnMethods= {"launchApplication"}, alwaysRun=true)
		public void ClickDirectionsTab() throws InterruptedException {
			WebElement directionsTab = driver.findElement(By.xpath("//a[@data-tabid='0']"));
			directionsTab.click();	
			Thread.sleep(10000);
		}
		
		//Pass source + destination information and select all four checkboxes
		// and click on Get Directions button	
		@Test(priority=16, dependsOnMethods= {"launchApplication"}, alwaysRun=true)
		public void GetDirections() throws InterruptedException {
		
		//Pass source as CHANGI AIRPORT	
		WebElement source = driver.findElement(By.xpath("//input[@id='poi_from']"));
		//source.click();
		source.sendKeys(Keys.DELETE);
		source.sendKeys("CHANGI AIR");
		source.sendKeys(Keys.DOWN);
		source.sendKeys(Keys.DOWN);
		source.sendKeys(Keys.DOWN);
		source.sendKeys(Keys.DOWN);
		source.sendKeys(Keys.DOWN);
		source.sendKeys(Keys.DOWN); //Navigate to CHANGI AIRPORT from Auto Suggestive List
		source.click();
		
		//Capture CHANGI AIRPORT Text in a string variable for verification
		String sourcevalue = source.getText();
		System.out.println(sourcevalue);
		
		//JavascriptExecutor is used to find out hidden elements from DOM
		//It is used here to capture the value CHANGI AIRPORT
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return document.getElementById(\"poi_from\").value;";
		String text = (String) js.executeScript(script);
		
		Thread.sleep(2000);
		
		//Pass source as SUNTEC SINGAPORE INTERNATIONAL CONVENTION & EXHIBITION CENTER	
		WebElement dest = driver.findElement(By.xpath("//input[@id='poi_to']"));
		dest.click();
		
		dest.sendKeys(Keys.CLEAR);
		dest.sendKeys("SUNTEC SINGAPORE");
		dest.sendKeys(Keys.DOWN);
		dest.sendKeys(Keys.DOWN);
		dest.click();
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		
		String script1 = "return document.getElementById(\"poi_to\").value;";
		String text1 = (String) js1.executeScript(script);
		Thread.sleep(2000);
		
/*
		//Select Toll Aware Checkbox
		WebElement tollAwarechk = driver.findElement(By.xpath("//input[@id='also_erp']"));
		tollAwarechk.click();
		
		//Select Fastest Checkbox
		WebElement fasTestchk = driver.findElement(By.xpath("//input[@id='also_fastest']"));
		fasTestchk.click();
		
		//Select Shortest Checkbox
		WebElement shortestchk = driver.findElement(By.xpath("//input[@id='also_shortest']"));
		shortestchk.click();
	*/	
		WebElement btngetDirections = driver.findElement(By.xpath("//input[@type='button']"));
		btngetDirections.click();
		Thread.sleep(10000);
		}
		
   //Click on Mobile App Link
	@Test(priority=17, dependsOnMethods= {"launchApplication"}, alwaysRun=true)
	public void clickonMobileAppLink() throws InterruptedException {
		WebElement mapp = driver.findElement(By.xpath("//a[@href='http://account.mapsynq.com/mobile.html']"));
		mapp.click();	
		Thread.sleep(10000);
	}
	
    //Click on Galactio Link	
	@Test(priority=18, dependsOnMethods= {"launchApplication"}, alwaysRun=true)
	public void clickonGalactioLink() throws InterruptedException  {
		WebElement glink = driver.findElement(By.xpath("//a[@href='http://www.galactio.com']"));
		glink.click();
		Thread.sleep(10000);
	}
	
    //Click on SGPS Navigation
	@Test(priority=19, dependsOnMethods= {"launchApplication"}, alwaysRun=true)
	public void clickonSGGPSNav() throws InterruptedException{
		WebElement gnav = driver.findElement(By.xpath("//a[@href='https://play.google.com/store/apps/details?id=com.galactio.mobile.sg&hl=en']"));
		gnav.click();	
		Thread.sleep(10000);
	}
	

}
