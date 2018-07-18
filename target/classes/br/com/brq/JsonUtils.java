package br.com.brq;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtils {
	private String url;
	private String usuario;
	private String senha;
	private long projeto;
	private long demanda;
	private long tarefa;
	private String descricao;

	public JsonUtils() {
		this.abreArquivo();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getProjeto() {
		return (int) projeto;
	}

	public void setProjeto(Long long1) {
		this.projeto = long1;
	}

	public int getDemanda() {
		return (int) demanda;
	}

	public void setDemanda(Long long1) {
		this.demanda = long1;
	}

	public int getTarefa() {
		return (int) tarefa;
	}

	public void setTarefa(Long long1) {
		this.tarefa = long1;
	}

	public void abreArquivo() {
		JSONParser parser = new JSONParser();
		try {
			File arquivo = new File(this.getClass().getResource("/dados.json").getFile());
			Object object = parser.parse(new FileReader(arquivo));

			JSONObject jsonObject = (JSONObject) object;

			this.setUrl((String) jsonObject.get("url"));
			this.setUsuario((String) jsonObject.get("usuario"));
			this.setSenha((String) jsonObject.get("senha"));
			this.setProjeto((Long) jsonObject.get("projeto"));
			this.setDemanda((Long) jsonObject.get("demanda"));
			this.setTarefa((Long) jsonObject.get("tarefa"));
			this.setDescricao((String) jsonObject.get("descricao"));
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
