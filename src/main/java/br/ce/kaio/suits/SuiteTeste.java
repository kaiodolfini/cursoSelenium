package br.ce.kaio.suits;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.kaio.core.DriverFactory;
import br.ce.kaio.test.TesteCadastro;
import br.ce.kaio.test.TesteRegrasCadastro;

@RunWith(Suite.class)
@SuiteClasses({
	TesteCadastro.class,
	TesteRegrasCadastro.class,
})
public class SuiteTeste {
	
	@AfterClass
	public static void finalizaTudo() {
		DriverFactory.killDriver();
	}

}
