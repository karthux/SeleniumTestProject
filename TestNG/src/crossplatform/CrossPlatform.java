package crossplatform;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class CrossPlatform {
	public static WebDriver wd=null;
	@Test
	public void Test1() throws MalformedURLException {
		String node1="http://192.168.1.8:5555/wd/hub";
		String url1="https://www.bing.com";
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		wd=new RemoteWebDriver(new URL(node1),cap);
		wd.get(url1);
		
	}
	@Test
	public void Test2() throws MalformedURLException {
		String node2="http://192.168.1.18:5554/wd/hub";
		String url2="https://www.google.com";
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.MAC);
		wd=new RemoteWebDriver(new URL(node2),cap);
		wd.get(url2);
	}
}
