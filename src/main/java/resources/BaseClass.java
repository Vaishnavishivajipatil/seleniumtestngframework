package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static WebDriver driver; // this have scope

	public Properties prop;

	public static String emailAddress = uniqemailAddress();

	public void browserLaunch() throws IOException {

		// to read data.properties
		FileInputStream fo = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");

// object of properties class---- access the proerties file
		prop = new Properties();

		prop.load(fo);

		String browsername = prop.getProperty("Browser");

		if (browsername.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("please choose the correct browser");

		}
	}

	@BeforeMethod
	public void launchBrowserAndOpen() throws IOException

	{
		browserLaunch();
		driver.get(prop.getProperty("url"));
	}

	@AfterMethod
	public void closeBrowser() {
		// driver.quite();
	}

//   generate random email address UniqueemailAddress
	public static String uniqemailAddress() {
		return System.currentTimeMillis() + "@gmail.com";

	}

	// To capture the screenshot
	public static String screenShot(WebDriver driver, String filename) {
		String dateAndTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		// 202408311143

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\ScreenShot\\" + filename + "_" + dateAndTime + ".png";
		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return destination;
	}

	@BeforeSuite
	public void ExtentReport() {
		extentManager.setup();
	}

	@AfterSuite
	public void endReport() {
		extentManager.endReport();
	}

	@BeforeMethod
	public void launchBrowserAndOpenURl() throws IOException {

		browserLaunch();
		driver.get(prop.getProperty("url"));

	}
	@AfterMethod
	public void closeBrowser1() throws IOException {
		 driver.quit();
	}
	


}
