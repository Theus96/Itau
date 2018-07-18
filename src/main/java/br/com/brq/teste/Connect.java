package br.com.brq.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	static private String endereco = "NBBV027452";
	static private String stringPortaBanco = "1433";
	static private String stringUsuarioBanco = "BRQ\\matheussouza";
	static private String stringSenhaBanco = "V1g7rb9@!";
	static private String nomeDataBase = "SILK";
	
	public static void main(String[] args) {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:sqlserver:" + "//" + endereco + ":"
					+ stringPortaBanco + ";user=" + stringUsuarioBanco + ";password=" + stringSenhaBanco
					+ ";databaseName=" + nomeDataBase);
			System.out.println("Conectado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro ao se conectar ao banco de dados." + e.getMessage());
		}
	}
	
	

}
