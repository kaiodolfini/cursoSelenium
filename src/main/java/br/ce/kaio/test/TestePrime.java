package br.ce.kaio.test;
import static br.ce.kaio.core.DriverFactory.getDriver;
import static br.ce.kaio.core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.ce.kaio.core.DSL;

public class TestePrime {
	
	private DSL dsl;

	@Before
	public void inicializa(){
		getDriver();
		dsl = new DSL();
	}
	
	@After
	public void finaliza(){
		killDriver();
	}

	@Test
	public void deveInteragirComRadioPrime(){
		getDriver().get("https://www.primefaces.org/showcase/ui/input/oneRadio.xhtml");
		dsl.clicarRadio(By.xpath("//input[@id='j_idt86:console:0']/../..//span"));
		Assert.assertTrue(dsl.isRadioMarcado("j_idt86:console:0"));
		dsl.clicarRadio(By.xpath("//label[.='PS4']/..//span"));
		Assert.assertTrue(dsl.isRadioMarcado("j_idt86:console:1"));
	}
	
	@Test
	public void deveInteragirComSelectPrime(){
		getDriver().get("https://www.primefaces.org/showcase/ui/input/oneMenu.xhtml");
		dsl.selecionarComboPrime("j_idt86:console", "Xbox One");
		Assert.assertEquals("Xbox One", dsl.obterTexto("j_idt86:console_label"));
	}
}