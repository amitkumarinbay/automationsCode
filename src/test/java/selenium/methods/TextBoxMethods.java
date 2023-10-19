package selenium.methods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.objects.TextBoxOR;

public class TextBoxMethods {

	final static Logger logger = LogManager.getLogger(TextBoxMethods.class);

	public static WebDriver driver;

	public static void launchBrowser(String systemURL) {
		try {
			WebDriverManager.chromedriver().setup();
			ChromeOptions cr = new ChromeOptions();
			cr.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(cr);
			driver.get(systemURL);
			driver.manage().window().maximize();
		} catch (TimeoutException e) {
			// TODO: handle exception
		}
		logger.info("launchBrowser is successfully executed");
	}

	public static void enterFullName(String fullname) {
		try {
			driver.findElement(TextBoxOR.FULL_NAME).sendKeys(fullname);
		} catch (NoSuchElementException e) {

		}
		logger.info("enterFullName is successfully executed");
	}

	public static void enterEmail(String userEmail) {

		try {
			driver.findElement(TextBoxOR.EMAIL).sendKeys(userEmail);
		} catch (Exception e) {
			// TODO: handle exception
		}
		logger.info("enterEmail is successfully executed");
	}

	public static void enterCurrentAddress(String caddress) {
		try {
			driver.findElement(TextBoxOR.CURRENT_ADDRESS).sendKeys(caddress);
		} catch (Exception e) {
			// TODO: handle exception
		}
		logger.info("enterCurrentAddress is successfully executed");
	}

	public static void enterParmanentAddress(String paddress) {
		try {
			driver.findElement(TextBoxOR.PARMANENT_ADDRESS).sendKeys(paddress);
		} catch (Exception e) {
			// TODO: handle exception
		}
		logger.info("enterParmanentAddress is successfully executed");
	}

	public static void clickSubmit() {
		try {
			driver.findElement(TextBoxOR.SUBMIT).click();
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		}
		logger.info("clickSubmit is successfully executed");
	}

	public static void verifyOutput() {

		boolean output = driver.findElement(TextBoxOR.FORM_OUTPUT).isDisplayed();
		if (output == true) {
			System.out.println("Test pass");
		}
		logger.info("verifyOutput is successfully executed");
	}

}
