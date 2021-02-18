package br.ce.kaio.test;
import static br.ce.kaio.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ce.kaio.core.BaseTest;
import br.ce.kaio.page.CampoTreinamentoPage;

public class TesteCadastro extends BaseTest {

	private CampoTreinamentoPage page;

	@Before
	public void inicializa(){
		getDriver().get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		page = new CampoTreinamentoPage();
	}

	

	@Test
	public void deveRealizarCadastroComSucesso(){
		page.setNome("Kaio");
		page.setSobrenome("Dolfini");
		page.setSexoMasculino();
		page.setComidaPizza();
		page.setEscolaridade("Mestrado");
		page.setEsporte("Natacao");
		page.cadastrar();

		Assert.assertEquals("Cadastrado!", page.obterResultadoCadastro());
		Assert.assertEquals("Kaio", page.obterNomeCadastro());
		Assert.assertEquals("Dolfini", page.obterSobrenomeCadastro());
		Assert.assertEquals("Masculino", page.obterSexoCadastro());
		Assert.assertEquals("Pizza", page.obterComidaCadastro());
		Assert.assertEquals("mestrado", page.obterEscolaridadeCadastro());
		Assert.assertEquals("Natacao", page.obterEsportesCadastro());
	}
}
