package br.com.brq.teste;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import br.com.brq.TempoTimeouts;
import br.com.brq.pom.TelaDeLogin;
import br.com.brq.pom.TelaPrincipal;

public class LogaItau {
	private TelaDeLogin telaLogin;
	private TelaPrincipal telaPrincipal;
	WebDriver driver;

	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:/DEV/LIB/geckodriver.exe");
		driver = new FirefoxDriver();
		telaLogin = new TelaDeLogin(driver);
		telaPrincipal = new TelaPrincipal(driver);
	}

	@org.testng.annotations.Test
	public void run() throws InterruptedException {
		telaLogin.startURL("https://www.itau.com.br/");
		telaLogin.setAgencia("0440");
		telaLogin.setConta("083327");
		telaLogin.clicaBotaoEntrar();
		Thread.sleep(TempoTimeouts.TEMPOLONGO);
//		telaLogin.getElemento().elementoWebEstaHabilitadoWait(telaLogin.setSenhaEletronica());
//		if (telaLogin.setSenhaEletronica()) {
//			assertTrue("Deu bom", telaLogin.setSenhaEletronica());
//		} else {
//			Assert.fail("Deu ruim");
//		}
		telaLogin.preencheSenha("102432");
		telaLogin.clicaBotaoAcessar();
		Thread.sleep(TempoTimeouts.TEMPOLONGO);
		telaPrincipal.clicaFechaAnuncio();
		Thread.sleep(TempoTimeouts.TEMPOCURTO);
		telaPrincipal.clickMenu("Menu completo");
		Thread.sleep(TempoTimeouts.TEMPOLONGO);
	}

	@AfterTest
	public void downTest() {
		telaLogin.fecha();
	}

}
