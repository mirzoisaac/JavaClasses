package com.syntax.class25;

public class WebDriverTest {

	public static void main(String[] args) {
		RemoteWebDriver[] browsers= {new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
		for (RemoteWebDriver browser:browsers) {
			browser.open();
			browser.close();
			browser.getScreenshot();
			System.out.println(browser.getTitle());
		
		}
		

	}

}
