package br.ce.kaio.test;
import static br.ce.kaio.core.DriverFactory.getDriver;
import static br.ce.kaio.core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;

public class TesteGoogle {
	

	@Before
	public void inicializa(){
		getDriver().manage().window().setSize(new Dimension(1200, 765));
	}
	
	@After
	public void finaliza(){
		killDriver();
	}
	
	@Test
	public void teste() {
//		System.setProperty("webdriver.gecko.driver", "/Users/wcaquino/Downloads/geckodriver");
//		System.setProperty("webdriver.chrome.driver", "/Users/wcaquino/Downloads/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new InternetExplorerDriver();
		getDriver().get("http://www.google.com");
		Assert.assertEquals("Google", getDriver().getTitle());
	}

}
