package miscellaneous;

import org.openqa.selenium.JavascriptExecutor;

public class Scrollscripts {
	
	public static void main(String[] args) {
		
	JavascriptExecutor driver = null;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)","");
	
	String flag="locator";
	js.executeScript("arguments[0].scrollIntoView();",flag);
	
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}
}
