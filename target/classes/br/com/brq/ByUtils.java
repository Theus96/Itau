package br.com.brq;

import org.openqa.selenium.By;

public abstract class ByUtils {

	public final static String A_LINK = "a", DIV = "div", SPAN = "span", INPUT = "input", SELECT = "select",
			BUTTON = "button", ALL = "*", TD = "td", LABEL = "label", IMG = "img", H1 = "H1", H2 = "H2", H3 = "H3",
			H4 = "H4", H5 = "H5", B = "b", TEXTAREA = "textarea", TABLE = "table";

	public static By encontraBy(String elemento, String id, String classe) {
		return By.xpath(String.format("//%1$s[(@id='%2$s') or (@class = '%3$s')]", elemento, id, classe));
	}

	public static By encontraByID(String elemento, String id) {
		return By.xpath(String.format("//%1$s[@id='%2$s']", elemento, id));
	}

	public static By encontraByClass(String elemento, String classe) {
		return By.xpath(String.format("//%1$s[contains(@class,'%2$s')]", elemento, classe));
	}
	
	public static By encontraByTitle(String elemento, String title) {
		return By.xpath(String.format("//%1$s[contains(@title,'%2$s')]", elemento, title));
	}

	public static By encontraByClass(String elemento, String classe, int index) {
		return By.xpath(String.format("(//%1$s[contains(@class,'%2$s')])[%3$d]", elemento, classe, index));
	}

	public static By encontraByTexto(String elemento, String texto) {
		return By.xpath(String.format("//%1$s[text()='%2$s']", elemento, texto));
	}

	public static By encontraByTexto(String elemento, String texto, int index) {
		return By.xpath(String.format("(//%1$s[text()='%2$s'])[%3$d]", elemento, texto, index));
	}

	public static By encontraByTextoContains(String elemento, String texto) {
		return By.xpath(String.format("//%1$s[contains(text(),'%2$s')]", elemento, texto));
	}
	
	public static By encontraByTextoContains(String elemento, char texto) {
		return By.xpath(String.format("//%1$s[contains(text(),'%2$s')]", elemento, texto));
	}

	public static By encontraByTextoContains(String elemento, String texto, int index) {
		return By.xpath(String.format("(//%1$s[contains(text(),'%2$s')])[%3$d]", elemento, texto, index));
	}

	public static By encontraByTextoTrim(String elemento, String texto) {
		return By.xpath(String.format("//%1$s[normalize-space(.)='%2$s']", elemento, texto));
	}

	public static By encontraByTextoTrim(String elemento, String texto, int index) {
		return By.xpath(String.format("(//%1$s[normalize-space(.)='%2$s'])[%3$d]", elemento, texto, index));
	}

	public static By encontraByValue(String elemento, String texto) {
		return By.xpath(String.format("//%1$s[@value='%2$s']", elemento, texto));
	}

	public static By encontraByValue(String elemento, String texto, int index) {
		return By.xpath(String.format("(//%1$s[@value='%2$s'])[%3$d]", elemento, texto, index));
	}

	public static By encontraByCssSelector(String elemento) {
		return By.cssSelector(String.format(".%1$s", elemento));
	}

	public static By encontraByImgSrc(String elemento, String src) {
		return By.xpath(String.format("//%1$s[@src='%2$s']", elemento, src));
	}

	public static By encontraByTable(int index) {
		return By.xpath(String.format("(//%1$s[@role='gridcell'])[%2$d]", ByUtils.TD, index));
	}

	public static By encontraBySelect(int index) {
		return By.xpath(String.format("(//%1$s[contains(@class,'form-control')])[%2$d]", ByUtils.SELECT, index));
	}

	public static By encontraByTableData(String classe, int linha, int coluna) {
		return By.xpath(
				String.format("//%1$s[@id='%2$s']/tbody/tr[%3$d]/td[%4$d]", ByUtils.TABLE, classe, linha, coluna));
	}

	public static By encontraByTableData(String classe, int linha, int coluna, int indice) {
		return By.xpath(String.format("(//%1$s[@id='%2$s']/tbody/tr[%3$d]/td[%4$d])[%5$d]", ByUtils.TABLE, classe,
				linha, coluna, indice));
	}
}
