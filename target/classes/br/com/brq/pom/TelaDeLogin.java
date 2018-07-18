package br.com.brq.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.brq.ByUtils;
import br.com.brq.TelaBase;

public class TelaDeLogin extends TelaBase {
	private By inputAgencia = ByUtils.encontraByID(ByUtils.INPUT, "campo_agencia");
	private By inputConta = ByUtils.encontraByID(ByUtils.INPUT, "campo_conta");
	private By botaoEntrar = ByUtils.encontraByClass(ByUtils.A_LINK, "btnSubmit");
	private By senhaEletronica = ByUtils.encontraByID(ByUtils.INPUT, "senha");
	private By botaoAcessar = ByUtils.encontraByID(ByUtils.A_LINK, "acessar");

	public TelaDeLogin(WebDriver driver) {
		super(driver);
	}

	public void setAgencia(String usuario) {
		this.getElemento().elementoWebInsereTexto(this.inputAgencia, usuario);
	}

	public void setConta(String usuario) {
		this.getElemento().elementoWebInsereTexto(this.inputConta, usuario);
	}

	public boolean SenhaEletronica() {
		return this.getElemento().elementoWebEstaVisivelWait(this.senhaEletronica);
	}

	public void clicaBotaoEntrar() {
		this.getElemento().elementoWebClica(this.botaoEntrar);
	}

	public void clicaBotaoAcessar() {
		this.getElemento().elementoWebClica(this.botaoAcessar);
	}

	public void preencheSenha(String senha) {
		char[] letras = null;
		letras = senha.toCharArray();

		for (int i = 0; i < letras.length; i++) {
			System.out.println("SENHA   >>>>>> " + letras[i]);
			By botaoSenha = ByUtils.encontraByTextoContains(ByUtils.A_LINK, letras[i]);
			getElemento().elementoWebClica(botaoSenha);
		}
	}

//	public TelaHome loga() {
//		JsonUtils json = new JsonUtils();
//		this.navega(json.getUrl());
//		this.maximizaBrowser();
//		this.setChave(this.getChave());
//		this.setLogin(json.getUsuario());
//		this.setSenha(json.getSenha());
//		this.apertaEsc();
//		this.clicaBotaoEntrar();
//
//		return new TelaHome(this.getDriver());
//	}
}
