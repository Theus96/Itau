package br.com.brq.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.brq.ByUtils;
import br.com.brq.TelaBase;

public class TelaPrincipal extends TelaBase {
	private By menu = ByUtils.encontraByClass(ByUtils.SPAN, "ico-header ico-header-menu");
	private By fechaAnuncio = ByUtils.encontraByID(ByUtils.A_LINK, "fecharTourElements");

	public TelaPrincipal(WebDriver driver) {
		super(driver);
	}

	public void clickMenu(String valor) {
		getElemento().elementoWebClicaPerform(this.menu);
		By botaoMenu = ByUtils.encontraByTitle(ByUtils.ALL, valor);
		getElemento().elementoWebClica(botaoMenu);
	}
	
	public void clicaFechaAnuncio() {
		getElemento().elementoWebClica(fechaAnuncio);
	}

	
}
