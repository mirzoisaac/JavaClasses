package com.syntax.class25;

public interface WebDriver {
	void open();
	void close();
	String getTitle();

}
interface TakesScreenshot{
	void getScreenshot();
}
interface RemoteWebDriver extends WebDriver,TakesScreenshot{
	void navigate();
}
class ChromeDriver implements RemoteWebDriver{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getScreenshot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navigate() {
		// TODO Auto-generated method stub
		
	}
	
}
class FirefoxDriver implements RemoteWebDriver{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getScreenshot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navigate() {
		// TODO Auto-generated method stub
		
	}
	
}
class SafariDriver implements RemoteWebDriver{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getScreenshot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navigate() {
		// TODO Auto-generated method stub
		
	}
	
}